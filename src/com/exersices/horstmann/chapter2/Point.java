package com.exersices.horstmann.chapter2;
//2.5
//Implement an immutable class Point that describes a point in the plane.
//Provide a constructor to set it to a specific point, a no-arg constructor to
//set it to the origin, and methods getX, getY, translate, and scale. The translate
//method moves the point by a given amount in x- and y-direction. The
//scale method scales both coordinates by a given factor. Implement these
//methods so that they return new points with the results.

public final class Point {
    private final double x;
    private final double y;

    public Point(){
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double amount1, double amount2){
        return new Point(x+amount1,y+amount2);
    }

    public Point scale(double coeff){
        return new Point(x*coeff,y*coeff);
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
