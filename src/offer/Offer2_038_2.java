package offer;

import java.util.*;

public class Offer2_038_2 {
    public static void main(String[] args) {
        int [] temperatures = new int[]{73,74,75,71,69,72,76,73};
        for(int i=0;i<dailyTemperatures(temperatures).length;i++){
            System.out.println(dailyTemperatures(temperatures)[i]);
        }
    }
    //相对于暴力解O(n^2)的时间复杂度，使用栈的方法会减小不少复杂度，如果栈不为空或者以栈底层中元素为下标的数组元素大于以当前i为下标的数组元素时
    //将该元素压入栈，i++，不然则弹出栈顶元素，对应以top为下标的数组元素值记为两者位置差；
    public static int[] dailyTemperatures(int[] temperatures) {
        int i = 0;
        int n = temperatures.length;
        int [] ans = new int[n];
        Deque<Integer> dq = new ArrayDeque<>();
        while(i<n){
            if(dq.isEmpty()||temperatures[dq.peek()]>=temperatures[i]){
                dq.push(i);
                i++;
            }else{
                Integer top = dq.pop();
                ans[top] = i-top;
            }
        }
        return ans;
    }
}
