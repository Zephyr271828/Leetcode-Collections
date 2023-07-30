package Leetcode;

public class removeDuplicates {
    public static int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > nums[tmp]){
                tmp++;
                nums[tmp] = nums[i];
            }
        }
        return tmp + 1;
    }

    public static void main(String[] args) {
        int[] nums = {};
    }
}
