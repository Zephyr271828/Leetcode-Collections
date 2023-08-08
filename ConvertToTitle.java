package Leetcode;

import java.util.*;

public class ConvertToTitle {
    public static String convertToTitle(int columnNumber){
        List<Character> l = new ArrayList<>();
        while (columnNumber > 0){
            if (columnNumber % 26 == 0) {
                l.add(0, 'Z');
                columnNumber = columnNumber / 26 - 1;
            } else{
                l.add((char)(columnNumber % 26 + 64));
                columnNumber = columnNumber / 26;
            }
        }
        StringBuilder ans = new StringBuilder(l.size());
        for (int i = 0; i < l.size(); i++) ans.append(l.get(i));
        return ans.toString();
    }

    public static void main(String[] args) {
        int n = 703;
        convertToTitle(n);
    }
}

// 26 Z
// 27 = 26 * 1 + 1 AA
// 
// 701 = 26 * 26 + 25 ZY
// 702 = 26 * 26 + 26 ZZ
// 703 = 26 * 26 + 26 * 1 + 1 AAA

