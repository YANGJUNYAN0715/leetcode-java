package leetcode;

public class leetcode1753 {
    public static void main(String[] args) {
        int a=1,b=8,c=8;
        System.out.println(maximumScore(a,b,c));
    }
    public static int maximumScore(int a,int b,int c) {
        int min = Math.min(Math.min(a, b), Math.min(b, c));
        int max = Math.max(Math.max(a, b), Math.max(b, c));
        int mid = a + b + c - min - max;
        if (min + mid == max) {
            return max;
        } else if (mid + min > max) {
            return (mid+min+max) / 2;
        } else return (min+mid);
    }
}
