package n1;

public class Shape {
    public String getTupe(){
        return this.getClass().getSimpleName();
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
