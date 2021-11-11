package com.exersices.Horstmann.chapter4;

import com.exersices.Horstmann.chapter2.Point;

public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to)
    {
        super(from);
        this.to = new Point(to.getX(), to.getY());
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }

    @Override
    public Point getCenter() {
        return new Point((this.point.getX()+to.getX())/2, (this.point.getY()+to.getY())/2);
    }
}
