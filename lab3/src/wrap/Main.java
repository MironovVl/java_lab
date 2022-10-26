package wrap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double d1 = Double.valueOf(sc.next());
        Double d2 = Double.parseDouble("20.123456789");
        System.out.println(d1);
        System.out.println(d2);

        int i1 = d2.intValue();
        System.out.println("int "+ i1);

        byte b1 = d2.byteValue();
        System.out.println("bute "+b1);

        short s1 = d2.shortValue();
        System.out.println("short "+s1);

        float f1 = d2.floatValue();
        System.out.println("float "+f1);

        String d = Double.toString(d2);
        System.out.println("String "+d);

    }
}
