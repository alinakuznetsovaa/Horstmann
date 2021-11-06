package Horstmann.chapter4;

public class Line extends Shape {
    private PointForShape to;

    public Line(PointForShape from, PointForShape to)
    {
        super(from);
        this.to = to;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public PointForShape getCenter() {
        point = new PointForShape((this.point.x+to.x)/2, (this.point.y+to.y)/2);
        return point;
    }
}
