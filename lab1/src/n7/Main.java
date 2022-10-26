package n7;

public class Main {
    public long factorial(int a){
        if (a<=1)return 1;
        long res = 1;
        for (int i = 1;i<=a;i++){
            res*=i;
        }
        return res;
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        System.out.println(m1.factorial(20));
    }
}
