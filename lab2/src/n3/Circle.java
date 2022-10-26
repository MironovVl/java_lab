package n3;

public class Circle {
    public Point center;
    public double r;

    Circle(double x, double y, double r){
        this.r=r;
        center = new Point(x,y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerX=" + center.getX() + ", centerY=" + center.getY() +
                ", r=" + r +
                '}';
    }
}
