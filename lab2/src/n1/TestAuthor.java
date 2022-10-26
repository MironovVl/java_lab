package n1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Vova","test@mail.ru",'m');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        a1.setEmail("test2@mail.ru");
        System.out.println(a1.toString());
    }
}
