package Leetcode;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s){
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                for(int j = i; j >= 0; j--){
                    if (s.charAt(j) == ' ') return i - j;
                }
                return i + 1;
            }
        }
        return 0;
    }   

    public static void main(String[] args) {
        String s = "    ";
        System.out.println(lengthOfLastWord(s));
    }
}
