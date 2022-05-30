package leetcode;

public class leetcode1022 {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1, new TreeNode1(0, new TreeNode1(0), new TreeNode1(1)), new TreeNode1(1, new TreeNode1(0), new TreeNode1(1)));
        System.out.println(sumRootToLeaf(root));
    }

    public static int sumRootToLeaf(TreeNode1 root) {
        return dfs(root, 0);
    }
    public static int dfs(TreeNode1 root, int val) {
        if (root == null) return 0;
        val = (val << 1) + root.val;
        if (root.left == null && root.right == null) {
            return val;
        }
        int left = dfs(root.left, val);
        int right = dfs(root.right, val);
        return left + right;
    }
}

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
