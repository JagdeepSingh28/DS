package com.jagdeep.ds.leet;

public class MaxAreaIsland_695 {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1)
                max = Math.max(max, sinkIsland(grid, i, j));
            }
        }

        return max;
    }

    private static int sinkIsland(int[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        int counter = 1;
        grid[i][j] = 0;

        counter += sinkIsland(grid, i + 1, j);
        counter += sinkIsland(grid, i - 1, j);
        counter += sinkIsland(grid, i, j + 1);
        counter += sinkIsland(grid, i, j - 1);

        return counter;
    }
}
