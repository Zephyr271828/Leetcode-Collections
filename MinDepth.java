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

public class MinDepth {
    public int minDepth(TreeNode root){
        if (root == null) return 0;
        return helper(root);
    }

    private int helper(TreeNode root){
        if (root == null) return Integer.MAX_VALUE;
        if (root.left == null && root.right == null) return 1;
        return 1 + Math.min(helper(root.left), helper(root.right));
    }

    public int minDepth2(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return 0;
        queue.add(root);
        int depth = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode first = queue.remove();
                if (first.left != null) queue.add(first.left);
                else if (first.right != null) queue.add(first.right);
                else return depth;
            }
            depth += 1;
        }
    }
}


