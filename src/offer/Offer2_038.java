package offer;

public class Offer2_038 {
    public static void main(String[] args) {
        int [] temperatures = new int[]{30,60,90};
        for(int i=0;i<dailyTemperatures(temperatures).length;i++){
            System.out.println(dailyTemperatures(temperatures)[i]);
        }
    }
    //二重循环，暴力解，找到第一个大于数组中元素值得下一个元素，下标差就是结果，存入新建立的数组对应位置即可，新建立数组默认值为0，故不需要其他操作；
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    ans[i] = (j-i);
                    break;
                }
            }
        }
        return ans;
    }
}
