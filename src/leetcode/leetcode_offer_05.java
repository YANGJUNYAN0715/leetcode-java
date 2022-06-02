package leetcode;

public class leetcode_offer_05 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
