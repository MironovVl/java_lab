package n2;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Math.random;

public class Tecter {
    private int n = 10;
    Circle[] circles = new Circle[n];

    public void createArr() {
        for (int i = 0; i < n; i++) {
            circles[i] = new Circle(random() * 1000, random() * 1000, random() * 1000);
        }
    }

    public void sortArr() {
        Arrays.sort(circles, Comparator.comparingDouble(Circle::getR));
    }

    @Override
    public String toString() {
        String res = "Circles:\n";
        for (int i = 0; i < n; i++) {
            res += circles[i].toString() + "\n";
        }
        return res;
    }

    public static void main(String[] args) {
        Tecter t = new Tecter();
        t.createArr();
        t.sortArr();
        System.out.println(t.toString());
    }
}
