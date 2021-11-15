package com.exersices.horstmann.chapter3;
//3.2
//Continue with the preceding exercise and provide a method Measurable
//largest(Measurable[] objects). Use it to find the name of the employee with
//the largest salary.

public class Employee implements Measurable {

    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }






    @Override
    public String toString() {
        return "Employee[ " +
                "name = '" + name + '\'' +
                ", salary = " + salary +
                ']';
    }

    public String getName() {
        return name;
    }
}
