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

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root){
        if (root == null) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        ans.addAll(postorderTraversal(root.left));
        ans.add(root.val);
        ans.addAll(postorderTraversal(root.right));
        return ans;
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }
    
    public void postOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
}
