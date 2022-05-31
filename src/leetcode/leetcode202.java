package leetcode;

import java.util.HashSet;

public class leetcode202 {
    public static void main(String[] args) {
        int n = 2;
        int number = 0;
        System.out.println(isHappy(n, number));
    }
    // 笑死，不能传两个参数，白写了
    public static boolean isHappy(int n, int number) {
        if (n == 1) {
            return true;
        }
        if (number == 10000) {
            return false;
        }
        n = sumDigits(n);
        number += 1;
        return isHappy(n, number);
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return sum;
    }
}
