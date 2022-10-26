package n6;

import java.util.Comparator;

import static java.lang.Math.PI;

public class Circle implements Comparable<Circle> {
    private double x;
    private double y;
    private double r;
    Circle(double x, double y ,double r){
        this.r=r;
        this.x=x;
        this.y=y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getR() {
        return r;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double length(){
        return r*2*PI;
    }

    public double area(){
        return PI*r*r;
    }
    @Override
    public int compareTo(Circle c1){
        if (c1.r>this.r){
            System.out.print("<");
        }
        else if(c1.r<this.r){
            System.out.print(">");
        }
        else {
            System.out.print("=");
        }
        return 0;
    }
}
