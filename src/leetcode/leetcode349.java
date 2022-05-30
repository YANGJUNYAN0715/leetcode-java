package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class leetcode349 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 4, 8};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        //遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        //遍历数组2的过程中判断哈希表中是否存在该元素
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }
        int[] resArr = new int[resSet.size()];
        int index = 0;
        //将结果几何转为数组
        for (int i : resSet) {
            resArr[index++] = i;
        }
        return resArr;
    }
}
