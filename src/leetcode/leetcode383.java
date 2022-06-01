package leetcode;

import java.util.HashMap;

public class leetcode383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magzine = "ab";
        System.out.println(canConstruct(ransomNote, magzine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int temp;
        for (int i = 0; i < magazine.length(); i++) {
            temp = magazine.charAt(i) - 'a';
            arr[temp]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            temp = ransomNote.charAt(i) - 'a';
            if (arr[temp] < 0) {
                return false;
            } else {
                arr[temp]--;
            }
        }
        return false;
    }
}
