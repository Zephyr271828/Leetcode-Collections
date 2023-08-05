import java.util.*;

class TreeNode {
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

public class IsBalanced {
    public boolean isBalanced(TreeNode root){
        if (root == null) return true;
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }

    private int depth(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

    public boolean isBalanced2(TreeNode root){
        if (root == null) return true;
        return depth2(root) != -1;
    }

    private int depth2(TreeNode root){
        if (root == null) return 0;
        int LH = depth(root.left), RH = depth(root.right);
        if (LH == -1 || RH == -1 || Math.abs(LH - RH) > 1) return -1;
        return Math.max(LH, RH) + 1;
    }
}
