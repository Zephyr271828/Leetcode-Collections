package Leetcode;

public class plusOne {
    public static int[] plusOne(int[] digits){
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--){
            if (flag == true){
                digits[i] += 1;
                flag = digits[i] >= 10;
                if (flag) digits[i] -= 10;
            } else break;
        }
        if (flag){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 0; i < digits.length; i++) arr[i + 1] = digits[i];
            return arr;
        }
        else return digits;

    }

    public static int[] plusOne2(int[] digits){
        for(int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] ans = plusOne2(digits);
        for (int num : ans) System.out.print(num);
    }
}
