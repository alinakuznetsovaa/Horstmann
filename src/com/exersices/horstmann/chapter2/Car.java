package com.exersices.horstmann.chapter2;


import static java.lang.Math.*;

//2.9
//Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of
//miles, to add a given number of gallons to the gas tank, and to get the
//current distance from the origin and fuel level. Specify the fuel efficiency
//(in miles/gallons) in the constructor.

public class Car {
    private double x;
    private double fuelLevel = 100;
    private double fuelEff;

    private Car(double fuelEff,double fuelLevel){
        x = 0;
        this.fuelEff = fuelEff;
        this.fuelLevel = fuelLevel;
    }

    public void toDrive(double miles){
        if (fuelLevel <= 0)
            System.out.println("Fuel Level is low");

        x += miles;
        fuelLevel -= fuelEff*miles;

    }

    public void addGallons(double g){
        fuelLevel += g;
        if (fuelLevel > 100)
            fuelLevel=100;

    }

    public double getDistance() {
      return abs(x);
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
