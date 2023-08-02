package Leetcode;

import java.util.*;

public class addBinary {
    
    public static String addBinary(String a, String b){
        int flag = 0;
        String ans = "";
        for (int i = 1; i <= a.length() || i <= b.length(); i++){
            if (i <= a.length() && a.charAt(a.length() - i) == '1') flag++;
            if (i <= b.length() && b.charAt(b.length() - i) == '1') flag++;
            if (flag % 2 == 1) ans = "1" + ans;
            else ans = "0" + ans;
            if (flag >= 2) flag = 1;
            else flag = 0;
        }
        if (flag == 1) ans = "1" + ans;
        return ans;
    }

    public static String addBinary2(String a, String b){
        StringBuilder res = new StringBuilder();
        int flag = 0;
        for(int i = 1; i <= a.length() || i <= b.length(); i++){
            if (i <= a.length()) flag += a.charAt(a.length() - i) - '0';
            if (i <= b.length()) flag += b.charAt(b.length() - i) - '0';
            res.append(flag % 2);
            flag = flag > 1 ? 1 : 0;
        }
        if (flag > 0) res.append(1);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
    }
}
