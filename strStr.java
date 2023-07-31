package Leetcode;

public class strStr {
    public static int strStr(String haystack, String needle){
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        //String a = "sadd", b = "sad";
        //System.out.println(a == b);
        System.out.println(strStr(haystack, needle));

    }
}
