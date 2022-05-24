package leetcode;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class leetcode1309 {
    public static void main(String[] args) {
        String s = new String("10#11#12");
        System.out.println(freqAlphabets(s));
    }
    //先构建一个StringBuilder，遍历，判断指针加二没有越界以及指针加二为'#'，将该字符加入sb，i自加3，否则自加1。
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i<s.length()-2&&s.charAt(i+2)=='#'){
                sb.append((char)(97+Integer.parseInt(s.substring(i,i+2))-1));
                i+=3;
            }else{
                sb.append((char)(97+Integer.parseInt(s.substring(i,i+1))-1));
                i++;
            }
        }
        return sb.toString();
    }
}
