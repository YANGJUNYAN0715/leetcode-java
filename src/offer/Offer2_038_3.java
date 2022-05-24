package offer;

public class Offer2_038_3 {
    public static void main(String[] args) {
        int [] temperatures = new int[]{73,74,75,71,69,72,76,73};
        for(int i=0;i<dailyTemperatures(temperatures).length;i++){
            System.out.println(dailyTemperatures(temperatures)[i]);
        }
    }
    public static int[] dailyTemperatures(int[] T) {
        int[] result  = new int[T.length];
        for(int i=T.length-2;i>=0;i--) {
            for(int j=i+1;j<T.length;j+=result[j]) {
                if(T[j]>T[i]) {
                    result[i]=j-i;
                    break;
                }else if (result[j] == 0) {
                    result[i] = 0;
                    break;
                }
            }
        }
        return result;
    }
}
