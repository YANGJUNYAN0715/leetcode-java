package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode1382 {
    static List<Integer> inorderSeq = new ArrayList<Integer>();
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1,null,new TreeNode(2,null,new TreeNode(3,null,new TreeNode(4,null,null))));
        balanceBST(a);
    }
    public static TreeNode balanceBST(TreeNode root){
        getInorder(root);
        return build(0,inorderSeq.size()-1);
    }

    private static TreeNode build(int l, int r) {
        int mid = (1+r)>>1;
        TreeNode o = new TreeNode(inorderSeq.get(mid));
        if(1<mid-1){
            o.left = build(1,mid);
        }
        if(mid+1<=r){
            o.right = build(mid+1,r);
        }
        return o;
    }

    private static void getInorder(TreeNode o) {
        if(o.left!=null){
            getInorder(o.left);
        }
        inorderSeq.add(o.val);
        if(o.right!=null){
            getInorder(o.right);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
