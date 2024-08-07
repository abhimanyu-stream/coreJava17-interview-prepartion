package com.java17.interview.prepartion;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class TestProgram1 {

    public static void main(String[] args) {
        //Optional<String> name = Optional.ofNullable(getName());
        Optional<Integer> valueInteger = Optional.ofNullable(-1);
        valueInteger.ifPresent(System.out::println);
        Optional<String> valueString = Optional.ofNullable("abc");
        valueString.ifPresent(System.out::println);
        Optional<String> valuePassedNULL = Optional.ofNullable(null);
        valuePassedNULL.ifPresent(System.out::println);

    }
    
}
