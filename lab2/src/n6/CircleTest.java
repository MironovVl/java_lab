package n6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1,2,10);
        Circle c2 = new Circle(10,5,8);
        System.out.println("Area = "+c1.area());
        System.out.println("length = "+c1.length());
        System.out.print("c1 ");
        c1.compareTo(c2);
        System.out.println(" c2");
    }
}
