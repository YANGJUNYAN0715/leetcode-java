package offer;

public class Offer2_069 {
    public static void main(String[] args) {
        int[] arr = new int[]{18,29,38,59,98,100,99,98,90};
        System.out.println(peakIndexMountainArray(arr));
    }
    public static int peakIndexMountainArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while(left<=right){
            mid = left+(right-left)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]) {
                break;
            }else if (arr[mid]>arr[mid+1]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return mid;
    }
}
