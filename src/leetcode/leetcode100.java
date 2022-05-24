package leetcode;

public class leetcode100 {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1,new TreeNode(2,null,null),new TreeNode(3,null,null));
        TreeNode q = new TreeNode(1,new TreeNode(2,null,null),new TreeNode(3,null,null));
        System.out.println(isSameTree(p,q));
    }
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }else if(p == null||q == null){
            return false;
        }else if(p.val!=q.val){
            return false;
        }else{
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

