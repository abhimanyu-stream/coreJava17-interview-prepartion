package com.java17.interview.prepartion;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestions1 {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap();
        map.put("Priyanka", "10");
        map.put("Priyanka", "15");// overriding previous one
        System.out.println(map.get("Priyanka"));// 15
        map.remove("Priyanka");// it will reomve obkect
        System.out.println(map.get("Priyanka"));// null

        try{
            int c=10;
            int a= c/0;
        }catch(NullPointerException n){
            System.out.println("nullpointer"+ n);
        }
        catch(Exception n){
            System.out.println("Exception");
        }
        //catch(ArithmeticException n){
            //System.out.println("AirthmaticException");
       // }
        /**Exception 'java.lang.ArithmeticException' has already been caught
         * catch(ArithmeticException n){
         *             System.out.println("AirthmaticException");
         *         }
         */

    }

}
class A{




}
