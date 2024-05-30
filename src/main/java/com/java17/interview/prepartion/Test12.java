package com.java17.interview.prepartion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.Character.*;

public class Test12 {
    public static void main(String[] args) {

        String str = "JavaJavaEE";
        //System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        char c =  str.chars()
                .mapToObj( i->Character.toLowerCase(Character.valueOf((char)i)))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                        .entrySet().stream()
                        .filter(entry->entry.getValue() > 1L)
                        .map(entry-> entry.getKey())
                        .findFirst().get();


        System.out.println(c);
       /* char c1 = str.chars()
                .mapToObj( i->Character.toLowerCase(Character.valueOf((char)i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue() > 1L).
                map(entry-> entry.getKey())
                .findFirst().get();
        System.out.println(c1);*/

    }
}
