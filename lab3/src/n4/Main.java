package n4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;

        while (n <= 0) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Введите число больше 0. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }

        int[] x = new int[n];
        int[] y = new int[(n + 1) / 2];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            x[i] = rand.nextInt(n + 1);
            System.out.print(x[i] + "    ");
        }
        System.out.println();

        for (int i = 0; i < (n + 1) / 2; i++) {
            y[i] = x[i * 2];
            System.out.print(y[i] + "    ");
        }

    }
}
