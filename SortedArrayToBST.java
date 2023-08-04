package Leetcode;

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

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums){
        if (nums.length == 0) return null;
        int M = nums.length / 2;
        TreeNode root = new TreeNode(nums[M]);
        int[] L = new int[M], R = new int[nums.length - M - 1];
        for(int i = 0; i < M; i++) L[i] = nums[i];
        for(int j = M + 1; j < nums.length; j++) R[j - M - 1] = nums[j];
        root.left = sortedArrayToBST(L);
        root.right = sortedArrayToBST(R);
        return root;
    }

    public TreeNode sortedArrayToBST2(int[] nums){
        return BST(nums, 0, nums.length - 1);
    }

    private TreeNode BST(int[] nums, int L, int R){
        if (L == R) return null;
        int M = (L + R) / 2;
        TreeNode root = new TreeNode(nums[M]);
        root.left = BST(nums, L, M);
        root.right = BST(nums, M + 1, R);
        return root;
    }
}
