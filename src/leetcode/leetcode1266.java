package leetcode;

public class leetcode1266 {
    public static void main(String[] args) {
        int [][] points = new int[][]{{3,2},{-2,2},{1,1}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
    public static int minTimeToVisitAllPoints(int[][] points){
        int n = points.length;
        int sum =0;
        for(int i =0;i<n-1;i++){
            sum += Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        return sum;
    }
}
