package Leetcode;

public class removeElement {
    public static int removeElement(int[] nums, int val){
        if (nums.length == 0) return 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[tmp] = nums[i];
                tmp++;
            }
        }
        return tmp + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int[] ans = removeElement(nums, val);
        for (int num : ans) System.out.println(num);
    }
}
