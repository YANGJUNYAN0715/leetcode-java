package leetcode;

import java.util.HashMap;

// 分别用数据和HashMap试试
public class leetcode242_2 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        for (int j : record) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
