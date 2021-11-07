package com.exersices.Horstmann.chapter4;

import com.exersices.Horstmann.chapter2.Point;

public class Circle extends Shape {
    private double radius;

    public Circle(Point center, double radius)
    {
        super(center);
        this.radius = radius;
    }

    @Override
    public Circle clone(){
        return new Circle(point, radius);
    }


    @Override
    public Point getCenter() {
        return point;
    }
}


