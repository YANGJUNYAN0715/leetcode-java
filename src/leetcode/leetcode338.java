package leetcode;

public class leetcode338 {
    public static void main(String[] args) {
        int [] b = countBits(10);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    public static int[] countBits(int n){
        int []ans = new int[n+1];
        for(int i =0;i<n;i++){
            ans[i] = A(i);
        }
        return ans;
    }
    public  static int A(int n){
        int sum = 0;
        if(n==0) return 0;
        while(n!=1) {
            if (n % 2 == 1) {
                sum++;
            }
            n = n/2;
        }
        return sum+1;
    }
}
