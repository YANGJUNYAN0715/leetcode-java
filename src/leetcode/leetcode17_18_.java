package leetcode;

import java.util.HashMap;

public class leetcode17_18_ {
    public static void main(String[] args) {
        int [] big = new int[]{7,5,9,0,2,1,3,5,7,9,1,1,5,8,8,9,7};
        int [] small = new int[]{1,5,9,2};
        int [] res = shortestSeq(big,small);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    //使用滑动窗口的方法，保证在窗口内包含所有small内的元素，定义左和右两个指针，当窗口内不能满足所有small元素时，滑动右指针，
    // 当需要尽可能缩小滑动窗口时，滑动左指针。
    public static int[] shortestSeq(int[] big, int[] small) {
        HashMap<java.lang.Integer, java.lang.Integer> map = new HashMap<>();
        for (int i : small) {
            map.put(i, 0);
        }
        int left = 0;
        int right = 0;
        int[] ans = new int[2];
        ans[1] = big.length + 1;
        int times = 0;
        while (right < big.length) {
            int num = big[right];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            if (map.containsKey(num) && map.get(num) == 1) {
                times++;
            }
            while (times == small.length) {
                num = big[left];
                int diff = ans[1] - ans[0];
                if (right - left < diff) {
                    ans[1] = right;
                    ans[0] = left;
                }
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) - 1);
                }
                if (map.containsKey(num) && map.get(num) < 1) {
                    times--;
                }
                left++;
            }
            right++;
        }
        return ans[1] == big.length + 1 ? new int[0] : ans;
    }
}
