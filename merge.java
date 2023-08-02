package Leetcode;

public class merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1, j = n - 1;
        while (i >= 0 || j >= 0){   
            if (j < 0 || (i >= 0 &&nums1[i] > nums2[j])){
                nums1[i + j + 1] = nums1[i];
                i--;
            } else{
                nums1[i + j + 1] = nums2[j];
                j--;
            }
        }
        for(int num : nums1) System.out.println(num);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
}
