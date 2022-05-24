package leetcode;

public class leetcode1528_2 {
    public static void main(String[] args) {
        String s = "aiohn";
        int[] indices = new int[]{3,1,4,2,0};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s,int[] indices){
        int length = s.length();
        char [] a = new char[length];
        for(int i=0;i<length;i++){
            a[indices[i]] = s.charAt(i);
        }
        return new String(a);
    }
}
