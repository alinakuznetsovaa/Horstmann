package Horstmann.chapter4;

public class Circle extends Shape {
    private double radius;

    public Circle(PointForShape center, double radius)
    {
        super(center);
        this.radius = radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public PointForShape getCenter() {
        return point;
    }
}


