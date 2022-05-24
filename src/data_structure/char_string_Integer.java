package data_structure;

public class char_string_Integer {
    public static void main(String[] args) {
        //三者关系
        StringBuilder sb = new StringBuilder();
        sb.append('1'+2);
        System.out.println(sb);
        String a = new String("123");
        //任意一个字符串，截取字符转换。
        sb.append(" "+(char)('a'+ Integer.parseInt(a.substring(0,2))));
        System.out.println(sb);
        //a b c d e f g h i j k l m
    }
}
