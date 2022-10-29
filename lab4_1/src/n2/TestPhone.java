package n2;

public class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone(11111, "A", 0.3);
        Phone p2 = new Phone(22222, "B");
        Phone p3 = new Phone();
        System.out.println(p1.toString() + "\n" + p2.toString() + "\n" + p3.toString());
        System.out.println(p1.getNumber());
        System.out.println(p2.getNumber());
        p1.receiveCall("Иван", 12345);
        p2.receiveCall("Ян");
        p1.sendMessage(new int[]{1, 2, 3, 4, 5});
    }
}
