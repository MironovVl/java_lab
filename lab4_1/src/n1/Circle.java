package n1;

import static java.lang.Math.PI;

public class Circle extends n1.Shape {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * r * PI;
    }

    @Override
    public double getArea() {
        return r * r * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
