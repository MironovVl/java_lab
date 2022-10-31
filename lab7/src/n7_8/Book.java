package n7_8;

public class Book implements Printable {
    private String label;

    Book(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Book{" +
                "label='" + label + '\'' +
                '}';
    }

    public static void printBook(Printable[] printables) {
        for (Printable pr : printables) {
            if (pr instanceof Book) {
                System.out.println(pr.toString());
            }
        }
    }
}
