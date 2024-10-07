package com.java17.interview.prepartion;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ValidParenthesesCheck {

    public static void main(String[] args) {

        SpringApplication.run(ValidParenthesesCheck.class, args);

        String str1 = "()";
        System.out.println(isValidParentheses(str1));
        String str2 = "(]";
        System.out.println(isValidParentheses(str2));
        String str3 = "[{()}]";
        System.out.println(isValidParentheses(str3));
        String str4 = "()[]{}";
        System.out.println(isValidParentheses(str4));





    }


    public static boolean isValidParentheses(String str) {


        Stack<Character> stack = new Stack<>();

        for(Character c:str.toCharArray()){

            if(c == '(' || c == '{' || c == '['){

                stack.push(c);

            }else if(c == ')' || c == '}' || c == ']'){

                if(stack.isEmpty())
                    return  false;


                Character top = stack.pop();
                if(c == ')' && top != '('){
                    return false;
                }
                if(c == '}' && top != '{'){
                    return false;
                }
                if(c == ']' && top != '['){
                    return false;
                }


            }



        }


        return  stack.isEmpty();
    }

}
