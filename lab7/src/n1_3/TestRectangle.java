package n1_3;

public class TestRectangle {
    public static void main(String[] args) {
        MovableRectangle r1 = new MovableRectangle(5, 0, 0, 10, 2, 8);
        System.out.println(r1.toString());
        r1.moveUp();
        r1.moveLeft();
        System.out.println(r1.toString());
        if (r1.speedTest()) {
            System.out.println("OK");
        } else {
            System.out.println("Скорости точек не совпадают");
        }
    }
}
