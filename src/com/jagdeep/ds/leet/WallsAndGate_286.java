package com.jagdeep.ds.leet;

public class WallsAndGate_286 {

    public static void main(String[] args) {
        int[][] rooms = new int[][]{
                {2147483647 , -1,  0,  2147483647},
                {2147483647, 2147483647, 2147483647,  -1},
                {2147483647 , -1, 2147483647,  -1},
                {0 , -1, 2147483647, 214748364}
        };

        wallsAndGates(rooms);
    }

    public static void wallsAndGates(int[][] rooms) {
        //iterate through the matrix calling dfs on all indices that contain a zero
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) {
                    dfs(rooms, i, j, 0);
                }
            }
        }
    }

    static void dfs(int[][] rooms, int i, int j, int distance) {
        //if you have gone out of the bounds of the array or you have run into a wall/obstacle, return
        // room[i][j] < distance also ensure that we do not overwrite any previously determined distance if it is shorter than our current distance
        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < distance) {
            return;
        }

        //set current index's distance to distance
        rooms[i][j] = distance;

        //recurse on all adjacent neighbors of rooms[i][j]
        dfs(rooms, i + 1, j, distance + 1);
        dfs(rooms, i - 1, j, distance + 1);
        dfs(rooms, i, j + 1, distance + 1);
        dfs(rooms, i, j - 1, distance + 1);
    }
}
