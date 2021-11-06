package Horstmann.chapter4;

import Horstmann.chapter4.PointForShape;
import Horstmann.chapter4.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(PointForShape topLeft, double width, double height)
    {
        super(topLeft);
        this.width=width;
        this.height=height;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public PointForShape getCenter() {
        point = new PointForShape(this.point.x+width/2, this.point.y+height/2);
        return point;
    }
}
