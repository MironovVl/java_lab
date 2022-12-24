import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTester {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        scanner.close();
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            System.out.println("ОК");
        } else {
            System.out.println("Неверная строка");
        }
    }
}
