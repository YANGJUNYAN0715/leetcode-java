package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class leetcode20 {
    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "([)]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<Character, Character>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(st.isEmpty()||st.peek()!=map.get(ch)){
                    return false;
                }
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
