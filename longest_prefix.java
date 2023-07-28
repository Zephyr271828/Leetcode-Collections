package Leetcode;

import java.util.Arrays;

public class longest_prefix {

    public static String longestCommonPrefix(String[] strs){
        int min_len;

        min_len = strs[0].length();
        for (String str : strs){
            if (str.length() < min_len){
                min_len = str.length();
            }
        }
        for (int i = 0; i < min_len; i++){
            Character ch = strs[0].charAt(i);
            for (String str : strs){
                if (str.charAt(i) != ch){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, min_len);
    }

    public static String longestCommonPrefix2(String[] strs){
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[-1];
        
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            } else{
                return s1.substring(0, i);
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix2(new String[] {"dog","racecar","car"}));
    }
}
