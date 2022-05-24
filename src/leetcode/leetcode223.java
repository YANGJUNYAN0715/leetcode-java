package leetcode;

public class leetcode223 {
    public static void main(String[] args) {
        System.out.println(computeArea(-3,0,3,4,0,-1,9,2));
    }
    public static int computeArea(int ax1,int ay1,int ax2,int ay2,int bx1,int by1,int bx2,int by2) {
//        int s1 = (ax2-ax1)*(ay2-ay1);
//        int s2 = (bx2-bx1)*(by2-by1);
//        int res = 0;
//        if(ax2>bx1&&by2>ay1) {
//            res = Math.abs(ax2 - bx1) * Math.abs(by2 - ay1);
//        }else if(ax2>bx1&&ay2>by1){
//            res = Math.abs(ax2-bx1)*Math.abs(ay2-by1);
//        }else if(bx2>ax1&&ay2>by1){
//            res = Math.abs(bx2-ax1)*(ay2-by1);
//        }else if(bx2>ax1&&by2>ay1){
//            res = Math.abs(bx2-ax1)*(by2-ay1);
//        }
//            if(ax2<=bx1||ay1>=by2||ax1>=bx2||ay2<=by1){
//                return s1+s2;
//            }
//            if((ax1<bx1&&ay1<by1&&ax2>bx2&&ay2>by2)||(ax1>bx1&&ay1>by1&&ax2<bx2&&ay2<by2)){
//                return Math.max(s1,s2);
//            }
//        return s1+s2-res;
//    }
        int area1 = (ax2 - ax1) * (ay2 - ay1), area2 = (bx2 - bx1) * (by2 - by1);
        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1), overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        int overlapArea = Math.max(overlapWidth, 0) * Math.max(overlapHeight, 0);
        return area1 + area2 - overlapArea;
    }
}
