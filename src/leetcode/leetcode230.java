package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode230 {
    //栈的方法，首先明确题目中为二叉搜索树，考查中序遍历的方法，可以使用递归或者直接中序遍历；
    //如果根不为空且栈不为空，先一直向左寻找子节点，将根和其左节点依次存入栈，然后弹出最底部左节点，K--，然后向右寻找右节点，依次循环，最后返回根的值；
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6,new TreeNode(3,new TreeNode(1),new TreeNode(4)),new TreeNode(7,new TreeNode(5),new TreeNode(8)));
        int k = 2;
        System.out.println(kthSmallest(root,k));
    }
    public static int kthSmallest(TreeNode root,int k){
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            k--;
            if(k==0){
                break;
            }
            root = root.right;
        }
        return root.val;
    }
}
class TreeNode {
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
