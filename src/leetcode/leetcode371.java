package leetcode;

public class leetcode371 {
    public static void main(String[] args) {
        int c  = getsum(17,11);
        System.out.println(c);
    }
    public static int getsum(int a,int b){
        while(b!=0){
            int carry = (a&b)<<1;
            a = a^b;
            b = carry;
        }
        return a;
    }
}
