package com.exersices.horstmann.chapter4;

import com.exersices.horstmann.chapter2.Point;

public class Circle extends Shape implements Cloneable{
    private double radius;

    public Circle(Point center, double radius)
    {
        super(center);
        this.radius = radius;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }


    @Override
    public Point getCenter() {
        return point;
    }
}


