package leetcode;

public class leetcode66 {
    public static void main(String[] args) {
        int [] digits = new int[]{9};
        int[] a = plusOne(digits);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    //从后到前遍历，如果全为9，新建数组，将首个元素置为1；不然则找到第一个不为9的数组元素，令其加一，在它之后的数组元素全部置0；
    //亦或者没有9，那更简单，末尾直接加一。
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                for(int j=i+1;j<n;j++){
                    digits[j]=0;
                }
                return digits;
            }
        }
        int[] ans = new int[n+1];
        ans[0]=1;
        return ans;
    }
}
