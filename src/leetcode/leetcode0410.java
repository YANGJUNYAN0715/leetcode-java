package leetcode;


public class leetcode0410 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = null;
        t1.right = new TreeNode(2);
        t1.right.left = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(4);
        System.out.println(checkSubTree(t1,t2));
    }
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public static boolean checkSubTree(TreeNode t1,TreeNode t2){
        if(t1 !=null){
            if(t2 == null){
                return true;
            }
        }else{
            return false;
        }
        return check(t1,t2)||checkSubTree(t1.left,t2)||checkSubTree(t1.right,t2);
    }
    private static boolean check(TreeNode t1,TreeNode t2){
        if(t1 == null) return true;
        if(t1.val!=t2.val) return false;
        return check(t1.left,t2.left)&&check(t1.right,t2.right);
    }
}

