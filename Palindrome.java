package Leetcode;

public class Palindrome {
    public static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        if (x % 10 == 0 && x != 0){
            return false;
        }
        int tmp = 0;
        while (tmp < x){
            tmp = tmp * 10 + x % 10;
            if (x == tmp){
                return true;
            }
            x /= 10;
        }
        return (x == tmp);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
