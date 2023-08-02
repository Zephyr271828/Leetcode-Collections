package Leetcode;

import java.util.*;

public class sqrt {
    public static int mySqrt(int x){
        int L = 0, R = x;
        while (L <= R){
            int M = L + (R - L) / 2 ;
            if (M > x / M) R = M - 1;
            else L = M + 1;
        }
        return R;
    }

    public static int mySqrt2(int x){
        int ans = 1;
        while (ans * ans > x || (ans + 1) * (ans + 1) <= x){
            ans = (ans + x / ans) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 9;
        System.out.println(mySqrt(x));
    }
}
