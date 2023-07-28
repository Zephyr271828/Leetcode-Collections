package Leetcode;

import java.util.HashMap;

public class Rome2Int {
    public static int romanToInt(String s){
        HashMap<String, Integer> book = new HashMap<String, Integer>();
        book.put("I", 1);
        book.put("V", 5);
        book.put("X", 10);
        book.put("L", 50);
        book.put("C", 100);
        book.put("D", 500);
        book.put("M", 1000);
        int ans = 0;
        for (int i = 0; i < s.length(); i++){
            if (i < s.length() - 1 && book.get(s.substring(i, i + 1)) < book.get(s.substring(i + 1, i + 2))){
                ans -= book.get(s.substring(i, i + 1));
            }
            else{
                ans += book.get(s.substring(i, i + 1));
            }
        }
        return ans;
    }

    public static int romanToInt2(String s){
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            switch (s.charAt(i)){
                case 'M' -> num = 1000;
                case 'D' -> num = 500;
                case 'C' -> num = 100;
                case 'L' -> num = 50;
                case 'X' -> num = 10;
                case 'V' -> num = 5;
                case 'I' -> num = 1;
            }
            if (num * 4 < ans){
                ans -= num;
            } else{
                ans += num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt2("III"));
        System.out.println(romanToInt2("LVIII"));
        System.out.println(romanToInt2("MCMXCIV"));
    }
}
