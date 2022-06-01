package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class leetcode1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 11, 1, 8};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        System.out.println(map);
        return res;
    }
}
