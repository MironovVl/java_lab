package n13;

import java.util.Scanner;

public class Main {
    public static void uneven(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        if (n==0)return;
        System.out.println(n);
        odd();
    }
    public static void odd(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        if (n==0)return;
        uneven();
    }

    public static void main(String[] args) {
        uneven();
    }
}
