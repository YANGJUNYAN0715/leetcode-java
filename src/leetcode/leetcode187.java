package leetcode;

import java.util.*;

public class leetcode187 {
    static final int L = 10;
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Iterator<String> iterator = findRepeatedDnaSequence(s).iterator();
        while(iterator.hasNext()){
            String a = iterator.next();
            System.out.println(a);
        }
    }
    //使用一个哈希表统计s中所有长度为10的字串出现的个数，每次循环是查看map中该字串对应的value值是否等于2，是则将其添加到List中。
    public static List<String> findRepeatedDnaSequence(String s){
        List<String> ans = new ArrayList<String>();
        Map<String,Integer> cnt = new HashMap<String,Integer>();
        int n = s.length();
        for(int i=0;i<=n-L;i++){
            String sub = s.substring(i,i+L);
            cnt.put(sub,cnt.getOrDefault(sub,0)+1);
            if(cnt.get(sub)==2){
                ans.add(sub);
            }
        }
        return ans;
    }
}
