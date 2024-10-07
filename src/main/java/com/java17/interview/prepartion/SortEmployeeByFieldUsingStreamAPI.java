package com.java17.interview.prepartion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeByFieldUsingStreamAPI {

    public static void main(String[] args) {

        List<EYmployee> listOfEY = new ArrayList<>();
        EYmployee e1 = new EYmployee("ey", 680000.0);
        EYmployee e2 = new EYmployee("ep", 200000.0);
        EYmployee e3 = new EYmployee("ec", 10000.0);
        listOfEY.add(e1);
        listOfEY.add(e2);
        listOfEY.add(e3);
        listOfEY.stream().sorted(Comparator.comparing(EYmployee::getName)).collect(Collectors.toList());// By Name, natural order
        System.out.println("By Name :" + listOfEY);
        listOfEY = listOfEY.stream().sorted(Comparator.comparingDouble(EYmployee::getSalary).reversed()).collect(Collectors.toList());// By Salary
        System.out.println("By Salary :"+listOfEY);
        listOfEY = listOfEY.stream().sorted((o1, o2)-> (int)(0.0)).collect(Collectors.toList());// By Salary
        System.out.println("By Salary :"+listOfEY);

    }
}

class EYmployee{

    private String name;
    private Double salary;

    public EYmployee(){}
    public EYmployee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EYmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
