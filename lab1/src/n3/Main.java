package n3;

public class Main {
    public static void main(String[] args) {
        int [] a = {0,10,20,30,40,50,60,70,80,90};
        int sum = 0;
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
            sum+=a[i];
        }
        System.out.println("сумма: "+sum);
        System.out.println("Среднее арифметическое: "+(sum/a.length));
    }
}
