package n6;

public class TestString {
    public static void main(String[] args) {
        String string = "qwertyuiop[]asdfghjkl;'zxcvbnm,./";
        ProcessString ps = new ProcessString();
        System.out.println(ps.unevenChar(string));
        System.out.println(ps.nimberOfChar(string));
        System.out.println(ps.invert(string));
    }
}
