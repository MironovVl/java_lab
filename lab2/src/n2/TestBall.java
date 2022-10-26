package n2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10, 20);
        Ball b2 = new Ball();
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        b2.setX(5);
        b2.setY(10);
        System.out.println(b2.toString());
        b2.setXY(2.5, 5.5);
        System.out.println(b2.toString());
        b2.move(1,6.5);
        System.out.println(b2.toString());
    }
}
