package com.jagdeep.ds.leet;

public class BattleShipCount {

    public static void main(String[] args) {
        char[][] battleShip = new char[][]{
                new char[]{'X','.','X'},
                new char[]{'X','.','X'},
                new char[]{'X','.','X'}
        };

        BattleShipCount battleShipCount = new BattleShipCount();
        System.out.println(battleShipCount.countBattleships(battleShip));
    }

    public int countBattleships(char[][] board) {
        int battleShipCount = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == '.')
                    continue;

                if(i>0 && board[i-1][j] == 'X')
                    continue;

                if(j>0 && board[i][j-1] == 'X')
                    continue;

                battleShipCount++;
            }
        }
        return battleShipCount;
    }

    public int countBattleshipsWithSpace(char[][] board) {
        int battleShipCount = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 'X'){
                    battleShipCount++;
                    sinkShip(board, i, j);
                }
            }
        }
        return battleShipCount;
    }

    private void sinkShip(char[][] board, int i, int j) {
        if(i<0 || i>=board.length || j<0 || j>= board[i].length || board[i][j] != 'X')
            return;

        board[i][j] = '.';
        sinkShip(board, i +1, j);
        sinkShip(board, i -1, j);
        sinkShip(board, i , j-1);
        sinkShip(board, i , j+1);
    }
}
