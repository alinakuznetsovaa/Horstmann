package Horstmann.chapter2;
//2.5
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
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
