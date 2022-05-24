package leetcode;

public class leetcode1672 {
    public static void main(String[] args) {
        int [][] accounts = new int[][]{{1,2,3},{3,2,1},{2,5,9}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += accounts[i][j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
