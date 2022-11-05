package n12;

import java.util.Scanner;

public class Main {

    public static void sequence(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        if (n==0)return;
        if (n%2==1){
            System.out.println(n);
        }
        sequence();
    }
    public static void main(String[] args) {
        sequence();
    }
}
