package com.java17.interview.prepartion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class UseFilterFindGreaterThan30ToUpperCase {

    public static void main(String[] args) {

        SpringApplication.run(UseFilterFindGreaterThan30ToUpperCase.class, args);

        List<Office> listOfOffice = new ArrayList<>();

        Office officeDelhi = new Office("Delhi", 30);
        Office officePune = new Office("Pune", 31);

        listOfOffice.add(officeDelhi);
        listOfOffice.add(officePune);


        listOfOffice.stream().filter(office -> office.getAge() > 30).collect(Collectors.toList()).stream().map(Office-> Office.getLocation().toUpperCase()).forEach(System.out::println);

    }



}
class Office{

    private String location;
    private int age;

    public Office(String location, int age) {
        this.location = location;
        this.age = age;
    }

    public String getLocation() {
        return location;
    }



    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Office{" +
                "location='" + location + '\'' +
                ", age=" + age +
                '}';
    }
}
