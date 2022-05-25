package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class leetcode503 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 5, 1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return new int[]{-1};
        }
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            while (!st.isEmpty() && nums[i % n] > nums[st.peek()]) {
                res[st.peek()] = nums[i % n];
                st.pop();
            }
            st.push(i % n);
        }
        return res;
    }
}
