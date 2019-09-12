package com.jagdeep.ds.leet;

public class ContainerWithMostWater_11 {

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        ContainerWithMostWater_11 containerWithMostWater_11 = new ContainerWithMostWater_11();
        System.out.println(containerWithMostWater_11.maxArea(height));
    }

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;

        int max_area = 0;

        while(i<j){
            int length = height[i]<height[j]?height[i]:height[j];
            int breadth = j-i;
            int area = getArea(length,breadth);
            if(area>max_area){
                max_area = area;
            }
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max_area;
    }


    private int getArea(int length, int breadth){
        return length * breadth;
    }
}
