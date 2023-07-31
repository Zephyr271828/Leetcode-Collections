package Leetcode;

public class searchInsert {
    public static int searchInsert(int[] nums, int target){
        int L = 0, R = nums.length, M;
        while (L < R){
            M = (L + R) / 2;
            System.out.println(L);
            System.out.println(M);
            System.out.println(R);
            if (nums[M] >= target) R = M;
            else L = M + 1;
        }
        System.out.println(L);
        System.out.println(R);
        return L;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 4; 
        System.out.println(searchInsert(nums, target));
    }
}
