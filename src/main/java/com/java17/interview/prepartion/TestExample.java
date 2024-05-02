package com.java17.interview.prepartion;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestExample {


    public static void main(String[] args) {
        SpringApplication.run(TestExample.class,args);
        callInternalMethod(null);

    }
    public static void callInternalMethod(String A) {

        System.out.println("Inside String");

    }

    public static void callInternalMethod(Object A) {

        System.out.println("Inside Object");

    }

}
