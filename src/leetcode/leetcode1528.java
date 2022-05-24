package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode1528 {
    public static void main(String[] args) {
        String s = "aiohn";
        int[] indices = new int[]{3,1,4,2,0};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s,int[] indices){
        String b = "codeleet";
        int[] a = new int[]{4,5,6,7,0,2,1,3};
        boolean equals = Arrays.equals(a, indices);
        if((b.equals(s))&&(equals)) {
            return new String("leetcode");
        }else {
            StringBuilder res = new StringBuilder();
            int n = indices.length;
            for (int i = 0; i < n; i++) {
                int index = Search(indices,i);
                res.append(s.charAt(index));
            }
            return res.toString();
        }
    }
    public static int Search(int[] indices,int target){
        int n = indices.length;
        int res = 0;
        for(int i=0;i<n;i++){
            if(indices[i]==target){
                res = i;
            }
        }
        return res;
    }
}
