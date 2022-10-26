package n8;

public class Main {
    public static void main(String[] args) {
        String [] strings = {"line1", "line2","line3","line4","line5","line6"};
        String tmp;
        for (int i = 0;i<strings.length/2;i++){
            tmp = strings[strings.length-i-1];
            strings[strings.length-i-1]=strings[i];
            strings[i]=tmp;
        }
        for (int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
