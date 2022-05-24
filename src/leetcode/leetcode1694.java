package leetcode;

public class leetcode1694 {
    public static void main(String[] args) {
        String number = "1-23-45 6";
//        for(int i=0;i<reformatNumber(number).length();i++){
//            System.out.println(reformatNumber(number).charAt(i));
//        }
        char[] c = number.toCharArray();
        for(int i =0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    public static String reformatNumber(String number){
        if(number.length()<3){
            return number;
        }
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<number.length();i++){
            char ch  = number.charAt(i);
            if(ch>'0'&&ch < '9'){
                ans.append(ch);
                count+=1;
                if(count==3){
                    ans.append('-');
                    count=0;
                }
            }
        }
        if(count == 0){
            ans.deleteCharAt(ans.length()-1);
        }
        if(count == 1){
            ans.insert(ans.length()-2,'-');
        }
        return ans.toString();
    }
}
