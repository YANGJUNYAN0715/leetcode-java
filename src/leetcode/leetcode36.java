package leetcode;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class leetcode36 {
    public static void main(String[] args) {
        char[][] a ={{'5','3','.','.','7','.','.','.','.'}
                    ,{'6','2','.','1','9','5','.','.','.'}
                    ,{'8','.','.','.','6','.','.','.','3'}
                    ,{'.','9','8','.','.','.','.','6','.'}
                    ,{'7','.','.','.','2','.','.','.','4'}
                    ,{'4','.','.','8','.','3','.','.','1'}
                    ,{'.','6','.','.','.','.','2','8','.'}
                    ,{'.','.','.','4','1','9','.','.','5'}
                    ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSusdo(a));
    }
    public static boolean isValidSusdo(char[][] board){
        int [][] rows = new int [9][9];
        int [][] colunms = new int [9][9];
        int [][][] subboxs = new int [3][3][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[i][j];
                if(c!='.'){
                    int index = c-'0'-1;
                    rows[i][index]++;
                    colunms[j][index]++;
                    subboxs[i/3][j/3][index]++;
                    if(rows[i][index]>1||colunms[j][index]>1||subboxs[i/3][j/3][index]>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
