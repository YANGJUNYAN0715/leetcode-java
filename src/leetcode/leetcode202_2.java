package leetcode;

public class leetcode202_2 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int number = 0;
        while (n != 1){
            n = sumDigits(n);
            number++;
            if(number==1000){
                return false;
            }
        }
        return true;
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
