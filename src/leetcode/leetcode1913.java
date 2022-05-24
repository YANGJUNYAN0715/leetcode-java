package leetcode;

public class leetcode1913 {
    public static void main(String[] args) {
        int [] a =new int []{5,6,2,7,4,7,3,5,1,3,2};
        System.out.println(maxProductDifference(a));
    }
    public static int maxProductDifference(int[] nums){
        int []b = bubblesort(nums);
        int n = b.length;
        return(nums[n-1]*nums[n-2]-nums[0]*nums[1]);
    }
    public static int[] bubblesort(int[] arr){ //冒泡排序
        int n = arr.length;
        for(int i =n-1;i>0;i--){
            for(int j=n-1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
