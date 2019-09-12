package com.jagdeep.ds.leet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinMeetingRoomsII_253 {


    public static void main(String[] args) {
        int[][] meeting = new int[][]{{10,30},{5,10},{15,20}};

        Interval interval1 = new Interval(10,30);
        Interval interval2 = new Interval(5,10);
        Interval interval3 = new Interval(15,20);

        Interval[] intervals = new Interval[]{interval1, interval2, interval3};


        MinMeetingRoomsII_253 minMeetingRoomsII_253 = new MinMeetingRoomsII_253();

        System.out.println(minMeetingRoomsII_253.minMeetingRooms(intervals));

//        System.out.println(minMeetingRoomsII_253.minMeetingRooms(meeting));
    }

    public static class Interval {

        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }

    }

    public int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval ia, Interval ib){
                return ia.start - ib.start;
            }
        });

        PriorityQueue<Integer> minEndTimes = new PriorityQueue<>();
        minEndTimes.offer(intervals[0].end);
        for(int i = 1; i < intervals.length; i++) {

            if (intervals[i].start >= minEndTimes.peek()) {
                minEndTimes.poll();
                minEndTimes.offer(intervals[i].end);
            } else {
                minEndTimes.offer(intervals[i].end);
            }
        }

        return minEndTimes.size();
    }

    public int minMeetingRooms_(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms = 0;
        int endsItr = 0;

        for(int i=0; i<starts.length; i++) {
            if(starts[i]<ends[endsItr]) {
                rooms++;
            } else {
                endsItr++;
            }
        }

        return rooms;
    }


    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        for (int[] itv : intervals) {
            if (heap.isEmpty()) {
                count++;
                heap.offer(itv[1]);
            } else {
                if (itv[0] >= heap.peek()) {
                    heap.poll();
                } else {
                    count++;
                }

                heap.offer(itv[1]);
            }
        }

        return count;
    }
}
