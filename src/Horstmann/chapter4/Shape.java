package Horstmann.chapter4;

public abstract class Shape {
    protected PointForShape point;

    public Shape(){
        point = new PointForShape();
    }

    public Shape(PointForShape point)
    {
        this.point = point;
    }

    public void moveBy(double dx, double dy)
    {
        point.x += dx;
        point.y += dy;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract PointForShape getCenter();
}
