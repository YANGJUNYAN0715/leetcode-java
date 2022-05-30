package leetcode;

import java.util.HashMap;

public class leetcode242 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int m = t.length();
        for (int i = 0; i < m; i++) {
            if (!map.containsKey(t.charAt(i))) {
                return false;
            } else {
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            }
        }
        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}

