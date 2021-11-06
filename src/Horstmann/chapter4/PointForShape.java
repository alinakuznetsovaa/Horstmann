package Horstmann.chapter4;

public class PointForShape {
    protected double x;
    protected double y;

    public PointForShape(){
        x = 0.0;
        y = 0.0;
    }

    public PointForShape(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
