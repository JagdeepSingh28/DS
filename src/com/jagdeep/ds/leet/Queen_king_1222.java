package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queen_king_1222 {

    public static void main(String[] args) {
        int[][] queens = new int[][]{{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
        int[] king = new int[]{0,0};

        queensAttacktheKing(queens, king);
    }

    public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] seen = new boolean[8][8];
        for (int[] queen : queens) seen[queen[0]][queen[1]] = true;
        int[] dirs = {-1, 0, 1};
        for (int dx : dirs) {
            for (int dy : dirs) {
                if (dx == 0 && dy == 0) continue;
                int x = king[0], y = king[1];
                while (x + dx >= 0 && x + dx < 8 && y + dy >= 0 && y + dy < 8) {
                    x += dx;
                    y += dy;
                    if (seen[x][y]) {
                        result.add(Arrays.asList(x, y));
                        break;
                    }
                }
            }
        }
        return result;
    }
}
