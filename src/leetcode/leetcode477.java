package leetcode;

public class leetcode477 {
    public static void main(String[] args) {
        int [] a = new int[]{4,14,2};
//        int m = totalHammingDistance(a);
//        System.out.println(m);
        int n = a.length;
        int sum =0;
        for(int i = 30;i>=0;i--){
            int cnt = 0;
            for(int val:a){
                cnt += (val>>i&1);
            }
            sum+=cnt*(n-cnt);
        }
        System.out.println(sum);
    }
//    public static int totalHammingDistance(int[] nums) {
//        int n = nums.length;
//        int sum = 0;
//        for(int i = 0;i<n;i++){
//            for(int j = i+1;j<n;j++){
//                sum+=XOR(nums[i],nums[j]);
//            }
//        }
//        return sum;
//    }
//    public static int XOR(int a,int b){
//        int c = a^b;
//        int count = 0;
//        while(c!=0){
//            count++;
//            c = c&(c-1);
//        }
//        return count;
//    }
}
