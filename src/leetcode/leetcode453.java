package leetcode;

import java.util.Arrays;

public class leetcode453 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(minMoves(nums));
    }
    //逆向思维，让n-1个数加一，就是让一个数减一，所以总次数就是让每个数减到原数组中最小整数的次数和。
    public static int minMoves(int[] nums){
        int min = Arrays.stream(nums).min().getAsInt();
        int sum =0;
        for(int num:nums){
            sum+=num-min;
        }
        return sum;
    }
}
