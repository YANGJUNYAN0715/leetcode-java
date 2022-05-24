package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode412 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n){
        List<String> a = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                a.add("FizzBuzz");
            }else if(i%5==0){
                a.add("Buzz");
            }else if(i%3==0){
                a.add("Fizz");
            }else{
                a.add(Integer.toString(i));
            }
        }
        return a;
    }
}
