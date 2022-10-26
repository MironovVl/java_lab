package n1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 10;
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextDouble() + rand.nextInt(1000);
            if (rand.nextInt(2) == 1) {
                a[i] *= -1;
            }
        }
        System.out.println("Random:");
        System.out.println(Arrays.toString(a));


        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Math.random:");


        double[] a2 = new double[n];

        for (int i = 0; i < n; i++) {
            a2[i] = Math.random() + Math.random() * 1000;
            if (rand.nextInt(2) == 1) {
                a2[i] *= -1;
            }

        }
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
    }
}
