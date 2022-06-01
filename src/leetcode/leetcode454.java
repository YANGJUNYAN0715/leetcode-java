package leetcode;

import java.util.HashMap;

public class leetcode454 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{-2, -1};
        int[] nums3 = new int[]{-1, 2};
        int[] nums4 = new int[]{0, 2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp;
        int res = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                temp = i + j;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        for (int i : nums3) {
            for (int j : nums4) {
                temp = i + j;
                if (map.containsKey(-temp)) {
                    res += map.get(-temp);
                }
            }
        }
        return res;
    }
}
