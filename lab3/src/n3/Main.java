package n3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[4];
        boolean flag = true;
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            x[i] = rand.nextInt(90) + 10;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(x[i] + ", ");
            if (x[i] >= x[i + 1]) {
                flag = false;
            }
        }

        System.out.println(x[3]);

        if (flag == true) {
            System.out.println("массив строго возрастающей");
        } else {
            System.out.println("массив не является строго возрастающим");
        }
    }
}
