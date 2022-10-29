package n3;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.println(fullName + " move");
    }

    public void talk() {
        System.out.println(fullName + " talk");
    }

    Person() {
        fullName = "defult fullName";
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

}
