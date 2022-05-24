package leetcode;

public class leetcode58 {
    public static void main(String[] args) {
        String a = "moon ";
        lengthofLastWord(a);
        System.out.println(a.lastIndexOf(" "));
    }
    //将原字符串头和尾的空格去掉，然后输出最后一个单词的长度，先调用String的trim()和split方法，将字符串用空格分离并存入数组
    //输出最后一个数组内字符串的长度。
    public static void lengthofLastWord(String s){
        String[] b = s.trim().split(" ");
        System.out.println(b[b.length-1].length());
    }
}
