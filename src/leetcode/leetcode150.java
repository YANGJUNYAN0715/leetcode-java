package leetcode;

import java.util.Stack;

public class leetcode150 {
    public static void main(String[] args) {
        String[] strings = new String[]{"2", "1", "+", "3", "*"};
        String[] strings1 = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(strings));
        System.out.println(evalRPN(strings1));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for (String token : tokens) {
            // 通过判断字符串最后一位Char是不是Digit来判断是否是数字
            if (Character.isDigit(token.charAt(token.length()-1))) {
                st.push(token);
            } else {
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                int res = 0;
                switch (token) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;
                        break;
                }
                st.push(String.valueOf(res));
            }
        }
        return Integer.parseInt(st.pop());
    }
}
