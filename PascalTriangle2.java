package Leetcode;

import java.util.*;

public class PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex){
        List<Integer> ans = new ArrayList<>(rowIndex + 1);
        int tmp = 1;
        ans.add(tmp);
        for (int i = 1; i <= rowIndex / 2; i++){
            tmp = (rowIndex + 1 - i) * tmp / i;
            ans.add(tmp);
        }
        for (int i = rowIndex / 2 + 1; i <= rowIndex; i++) ans.add(ans.get(rowIndex - i));
        for(int num : ans) System.out.println(num);
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        getRow(n);
    }
}
// c(2, 0) = 1
// c(2, 1) = c(2, 0) * 2 / 1

