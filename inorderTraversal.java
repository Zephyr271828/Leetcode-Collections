package Leetcode;

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

public class inorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root){
        if (root == null) return new ArrayList<Integer>();
        List<Integer> ans = inorderTraversal(root.left);
        ans.add(root.val);
        ans.addAll(inorderTraversal(root.right));
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
