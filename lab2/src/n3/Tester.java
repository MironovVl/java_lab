package n3;

import java.lang.reflect.Array;

public class Tester {
    private Circle c1 = new Circle(1,2,3);
    private Circle c2 = new Circle(10,20,30);
    public Circle [] c = {c1, c2};
    public int leight = c.length;




    public static void main(String[] args) {
        Tester t1 = new Tester();
        System.out.println(t1.c[0].toString());
    }

}
