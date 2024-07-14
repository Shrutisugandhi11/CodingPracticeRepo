package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queen {


    public  List<List<String>> nQueen(int n){
        char[][] board=new char[n][n];
        for (char [] ch: board)
        Arrays.fill(ch,'E');
        List<List<String>> res=new ArrayList<>();
        result(board,0,res);
      return res;
    }
    public static List<String>addRes(char[][] board){
        List<String> res=new ArrayList<>();
        for (char[] ch:board){
            res.add(new String(ch));
        }
        return res;
    }
    public static void result(char[][]board,int col,List<List<String>> res ){
        if(col==board.length){
            res.add(addRes(board));
            return;
        }
        for(int i=0;i< board.length;i++){
            if(isPositionTrue(board,i,col)){
                board[i][col]='Q';
                result(board,col+1,res);
                board[i][col]='E';
            }
        }

           }

           public static boolean isPositionTrue(char[][]board,int row,int col){
            int row1=row;
            int col1=col;
            while (row1>=0 && col1>=0){
                if(board[row1][col1]=='Q') return false;
                row1--;
                col1--;
            }
            row1=row;
            col1=col;
            while (col1>=0){
                if (board[row1][col1]=='Q')return false;
                col1--;
            }
            row1=row;
            col1=col;
            while (col1>=0 && row1< board.length){
                if (board[row1][col1]=='Q') return false;
                col1--;
                row1++;
            }
            return true;
           }

}
