package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode17 {
    public static void main(String[] args) {
        String digits = new String("23");
        String digits2 = new String("2");
        Solution1 solution = new Solution1();
        System.out.println(solution.letterCombinations(digits));
    }
}
class Solution1{
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits){
        if(digits==null||digits.length()==0){
            return list;
        }
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(digits,numString,0);
        return list;
    }
    StringBuilder temp = new StringBuilder();
    public void backTracking(String digits, String[] numString, int num){
        if(num == digits.length()){
            list.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(num)-'0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTracking(digits,numString,num+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}