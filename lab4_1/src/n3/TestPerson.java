package n3;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 =new Person("Иван Иванов",20);
        p1.move();
        p2.talk();
    }
}
