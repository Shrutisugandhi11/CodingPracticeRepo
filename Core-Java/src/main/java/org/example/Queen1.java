package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queen1 {

    public static List<List<String>> nQueen(int n) {
        char[][] board = new char[n][n];
        for (char[] ch : board) {
            Arrays.fill(ch,'E');
        }
        List<List<String>> res =new ArrayList<>();
        solveQueen(board,0,res);
        return res;
    }
    public static List<String> addRow(char[][]board){
        List<String> res=new ArrayList<>();
        for (char[] row:board) {
            res.add(new String(row));
        }
        return res;
    }
    public static void solveQueen(char[][]board,int col,List<List<String>> res){
        if (col== board.length){
            res.add(addRow(board));
            return;
        }
        for (int row=0;row< board.length;row++){
            if(isPositionCorrect(board,row,col)){
                board[row][col]='Q';
                solveQueen(board,col+1,res);
                board[row][col]='E';
            }
        }
    }

    public static boolean isPositionCorrect(char[][]board,int row,int col){
        int dupRow=row;
        int dupCol=col;
        while (dupCol>=0 && dupRow >=0){
            if (board[dupRow][dupCol]=='Q') return false;
            dupRow--;
            dupCol--;
        }
        dupRow=row;
        dupCol=col;
        while (dupCol>=0){
            if (board[dupRow][dupCol]=='Q') return false;
            dupCol--;
        }
        dupRow=row;
        dupCol=col;
        while (dupCol>=0 && dupRow< board.length){
            if (board[dupRow][dupCol]=='Q') return false;
            dupCol--;
            dupRow++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(nQueen(6));
    }

}
