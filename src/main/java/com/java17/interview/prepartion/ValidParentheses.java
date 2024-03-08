package com.java17.interview.prepartion;

import java.util.Stack;

public class ValidParentheses {


    public static void main(String[] args) {
        String str = "()";
        boolean isValid = isValid(str);
        System.out.println(isValid); // true

        str = "()[]{}";
        isValid = isValid(str);
        System.out.println(isValid); // true

        str = "(]";
        isValid = isValid(str);
        System.out.println(isValid); // false

        str = "([)]";
        isValid = isValid(str);
        System.out.println(isValid); // false
    }
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}




