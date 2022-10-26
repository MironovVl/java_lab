package n10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int n = s.split(" +").length;

        System.out.println("Вы ввели "+n+" слов");
    }

}
