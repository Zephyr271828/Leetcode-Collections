package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class valid_parentheses {
    public static boolean isValid(String s){
        ArrayList<Character> lst = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '(' -> lst.add('(');
                case '[' -> lst.add('[');
                case '{' -> lst.add('{');
                case ')' -> {
                    if (lst.isEmpty() || lst.get(lst.size() - 1) != '('){
                        return false;
                    } else{
                        lst.remove(lst.size() - 1);
                    }
                }
                case ']' -> {
                    if (lst.isEmpty() || lst.get(lst.size() - 1) != '['){
                        return false;
                    } else{
                        lst.remove(lst.size() - 1);
                    }
                }
                case '}' -> {
                    if (lst.isEmpty() || lst.get(lst.size() - 1) != '{'){
                        return false;
                    } else{
                        lst.remove(lst.size() - 1);
                    }
                }
            }
        }
        return (lst.isEmpty());
    }

    public static boolean isValid2(String s){
        Stack<Character> stack = new Stack<Character>();
        // you can use the stack class in Java to make the code simpler
        for (char c : s.toCharArray()){ // here we convert the string to an arraylist of char's
            switch(c){
                case '(' -> stack.push(')');
                case '[' -> stack.push(']');
                case '{' -> stack.push('}');
                default ->{
                    if (stack.isEmpty() || stack.pop() != c){ // note the stack pushes the closing brackets, which is clever
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    // "->" and ":" are different syntaxes you can use in a switch structure
    // "->" is more updated and does not need "break" statement anymore
    // furthermore, "->" achieves better time and space efficiency in this case

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid2(s));
    }
}
