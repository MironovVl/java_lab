package format;

import java.util.Formatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double [] x = new double[20];
        boolean flag = true;
        Random rand = new Random();
        Formatter formatter = new Formatter();
        for (int i = 0; i < 20; i++) {
            x[i] = Math.random()*100;
            formatter.format("%6.3f%n",  x[i]);
        }

        System.out.println(formatter);
    }
}



