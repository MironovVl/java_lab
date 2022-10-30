package n6_9;

import java.util.ArrayList;
import java.util.List;

public class TestPrintable {
    public static void main(String[] args) {
        Book b1 =new Book("Война и Мир");
        Shop s1 = new Shop("гастроном");
        b1.print();
        s1.print();


        List<Book> books = new ArrayList<Book>();
        for (int i =0;i<5;i++) {
            books.add(new Book("книга " + (i+1)));
        }
        for (int i =0;i<5;i++) {
            books.get(i).print();
        }
    }

}
