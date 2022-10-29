package n1;

public class Main {
    public static void main(String[] args) {
        n1.Rectangle r1 = new n1.Rectangle();
        n1.Circle c1 = new n1.Circle();
        r1.setA(2);
        r1.setB(5);
        c1.setR(10);
        System.out.println(r1.getTupe());
        System.out.println(r1.toString());
        System.out.println(c1.toString());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
    }
}
