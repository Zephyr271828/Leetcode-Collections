package Leetcode;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if (dict.containsKey(nums[i])){
                return new int[] {dict.get(nums[i]), i};
            }
            dict.put(target - nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        
    }
}
