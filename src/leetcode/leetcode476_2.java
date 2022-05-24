package leetcode;

public class leetcode476_2 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(findComplement(num));
    }
    //异或运算，得到原数的位数，求得该位数下每位均为1的二进制数(靠左移获得)，然后与原数进行异或运算即可。
    public static int findComplement(int num) {
        int temp = num, c = 0;
        while(temp > 0){
            temp >>= 1;
            c =  (c << 1) + 1;
        }
        return num ^ c;
    }
}
