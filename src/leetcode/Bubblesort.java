package leetcode;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] nums = new int[]{6,5,4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
    public static int[] bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }
}
