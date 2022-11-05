package n15;

import java.util.Scanner;

public class Main {
    public static void reverseNumber(int n) {
        if (n == 0) return;
        System.out.print(n % 10 + " ");
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        reverseNumber(n);
    }
}
