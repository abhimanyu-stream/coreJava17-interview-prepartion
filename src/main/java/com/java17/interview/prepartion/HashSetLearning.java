package com.java17.interview.prepartion;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class HashSetLearning {

    public static void main(String[] args) {
        SpringApplication.run(HashSetLearning.class,args);

        Set<User> setOfUser = new HashSet<>();

        User user1 = new User("Abhimanyu", 20);
        User user2 = new User("Abhimanyu", 20);

        setOfUser.add(user1);
        setOfUser.add(user2);
        System.out.println(setOfUser.size());

        
    }
}

class User{
   private  String name;
   private int  age;

   public User(){}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
