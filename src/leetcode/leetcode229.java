package leetcode;

import java.util.*;

public class leetcode229 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,3,3,2,2,2};
        System.out.println(majorityElement(nums));
    }
    //暴力，最后记得因为list中可能有重复项，用hashset去重。
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0 )+1);
        }
        for(int x:map.keySet()){
            if(map.get(x)>(n/3)){
                list.add(x);
            }
        }
        return list;
//        for (int i = 0; i < n; i++) {
//            if (map.get(nums+i]) > (n / 3)) {
//                list.add(nums[i]);
//            }
//        }
//        List newList = new ArrayList(new HashSet(list));
//        return newList;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
