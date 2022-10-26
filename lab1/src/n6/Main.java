package n6;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            String str = String.format("%1$6.5f", 1./i);
            System.out.println(str);
        }
    }
}
