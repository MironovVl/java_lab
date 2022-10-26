package n4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("Вводите числа. 0 - последнее число");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        do{
            a = sc.nextInt();
            sum+=a;
            if (a==0)break;
            if (a>max){
                max = a;
            }
            if (a<min){
                min = a;
            }
        }while (true);
        System.out.println("сумма: "+sum);
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
}
