package leetcode;

/*
思路：先将整数n强制转换为浮点数，然后不断对s除3，如果s是3的幂，那么必然可以除到1，否则一定会除到某一个小于1的浮点数
 */
public class leetcode326 {
    public static void main(String[] args) {
        int number = 81;
        System.out.println(isPowerOfThree(number));
    }
    //判断一个数是不是3的倍数，先将该数转换为浮点数，不断对其除3，如果是3的倍数，最后一定会等于1，不然会得到一个小于1的浮点数。
    public static boolean isPowerOfThree(int n) {
        double s = (double)n;
        while (s != 1) {
            s = s / 3;
            if(s<1) return false;
        }
        return true;
    }
}
