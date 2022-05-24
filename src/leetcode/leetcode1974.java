package leetcode;

public class leetcode1974 {
    public static void main(String[] args) {
        String word = "zjpc";
        int res =0,dis=0;
        char start = 'a';
        char[] cc = word.toCharArray();
        for(char c:cc){
            dis = Math.abs(c-start);
            res += Math.min(dis,26-dis);
            start = c;
        }
        System.out.println(res+cc.length);
        System.out.println(cc.length);
        System.out.println(word.length());
    }
}
