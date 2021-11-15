package com.exersices.horstmann.chapter3;
//3.1
//Provide an interface Measurable with a method double getMeasure() that measures an object in some way. Make Employee implement Measurable. Provide
//a method double average(Measurable[] objects) that computes the average
//measure. Use it to compute the average salary of an array of employees.
public interface Measurable {

    double getMeasure();

    static double average(Measurable[] objects){
        double sum = 0;
        for(int i = 0; i < objects.length; i++)
            sum+=objects[i].getMeasure();

        return sum/objects.length;

    }

    static Measurable largest(Measurable[] objects){
        Employee employee = (Employee) objects[0];
        Employee tmp;
        for(int i = 1; i < objects.length; i++) {
            tmp = (Employee)objects[i];
            if (employee.getMeasure() < tmp.getMeasure())
                employee = tmp;
        }
        return employee;
    }
}
