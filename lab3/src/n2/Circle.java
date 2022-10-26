package n2;

public class Circle {
    private Point center;
    private double r;

    Circle(double x, double y, double r) {
        this.r = r;
        center = new Point(x, y);
    }

    public double getR() {
        return r;
    }

    public double getX() {
        return center.getX();
    }

    public double getY() {
        return center.getY();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", center: " + center.toString() +
                '}';
    }
}
