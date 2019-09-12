package com.jagdeep.ds.leet;

import java.util.*;

public class KClosestPointstoOrigin_973 {

    public static void main(String[] args) {
        int[][] points = new int[][]{{1,3},{-2,2},{-1,-1}};

        int[][] result = kClosest(points, 1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }

    public static int[][] kClosest(int[][] points, int K){

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return findDistanceFromCenter(a[0],a[1])<findDistanceFromCenter(b[0],b[1])?1:-1;
            }
        });

//        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)
//                ->
//                (b[0] * b[0] + b[1] * b[1] - (a[0] * a[0] + a[1] * a[1])));

        for(int[] point: points){
            maxHeap.add(point);
            if(maxHeap.size()>K)
                maxHeap.remove();
        }

        int[][] result = new int[K][2];
        while(K-- >0)
            result[K] = maxHeap.remove();

        return result;
    }

    public static int[][] kClosest_(int[][] points, int K) {
        TreeMap<Double, Integer[]> distHashMap = new TreeMap<>();

        for (int i = 0; i < points.length; i++) {
            distHashMap.put(
                    findDistanceFromCenter(points[i][0], points[i][1]),
                    new Integer[]{points[i][0], points[i][1]}
                    );
        }

        int[][] result = new int[K][2];

//        int i = 0;
//        Iterator<Integer[]> iterator = distHashMap.values().iterator();
//        while(iterator.hasNext()) {
//            result[i][0] = iterator.next();
//        }

        return result;
    }

    static double findDistanceFromCenter(int a, int b){
        return Math.sqrt((Math.pow((a-0),2))+(Math.pow((b-0),2)));
    }
}
