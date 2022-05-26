package leetcode;

import java.util.Stack;

public class leetocde1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        st.push(s.charAt(0));
        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);
            if (!st.empty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
/*        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();*/
        String str = "";
        while (!st.empty()) {
            str = st.pop() + str;
        }
        return str;
    }
}
