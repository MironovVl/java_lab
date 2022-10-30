package n6_9;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title=title;
    }

    @Override
    public void print() {
        System.out.println("book: "+title);
    }
}
