package com.exersices.Horstmann.chapter4;

import com.exersices.Horstmann.chapter2.Point;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height)
    {
        super(topLeft);
        this.width=width;
        this.height=height;
    }

    @Override
    public Rectangle clone(){
        return new Rectangle(point, width, height);
    }


    @Override
    public Point getCenter() {
        return new Point(this.point.getX()+width/2, this.point.getY()-height/2);

    }
}
