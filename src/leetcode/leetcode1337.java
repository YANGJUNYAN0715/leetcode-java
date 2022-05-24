package leetcode;

import java.util.*;

public class leetcode1337 {
    public static void main(String[] args) {
        int [][] mat =
            {{1,1,0,0,0},
             {1,1,1,1,0},
             {1,0,0,0,0},
             {1,1,0,0,0},
             {1,1,1,1,1}};
        int k = 3;
        kweakestrows(mat,k);
        System.out.println(1);
    }
    public static void kweakestrows(int[][] mat,int k){
        int n = mat.length;
        Map<Integer,Integer> a = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++) {
                if (mat[i][j] == 1) {
                    a.put(i, sum);
                    sum++;
                }
            }
        }
    }
}
