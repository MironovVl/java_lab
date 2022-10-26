package n7;

import java.util.Arrays;
import java.util.Comparator;

public class BookTest {
    Book b1 = new Book("автор1","книга1",1890);
    Book b2 = new Book("автор2","книга2",1980);
    Book b3 = new Book("автор3","книга3",2010);
    Book b4 = new Book("автор4","книга4",2000);
    Book b5 = new Book("автор5","книга5",1990);
    Book [] books = {b1,b2,b3,b4,b5};


    public void sortBooks() {
        Arrays.sort(books, Comparator.comparingInt(Book::getYear));
        Book temp;
        for (int i = 0; i < books.length; i++) {
            for (int j = 1; j < (books.length - i); j++) {
                if (books[j - 1].getYear() > books[j].getYear()) {
                    temp = books[j - 1];
                    books[j - 1] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    public void printBook(Book b){
        System.out.println(b.getAuthor()+" - "+b.getTitle()+" ("+b.getYear()+")");
    }
    public void printList() {
        for (int i = 0; i < books.length; i++) {
            printBook(books[i]);
        }
    }

    public void newBook(){
        printBook(books[books.length-1]);
    }

    private void oldBook() {
        printBook(books[0]);
    }


    public static void main(String[] args) {
        BookTest bt1 = new BookTest();
        bt1.sortBooks();
        System.out.print("самая новая книга: ");
        bt1.newBook();
        System.out.print("самая старая книга: ");
        bt1.oldBook();
        System.out.println("Список книг:");
        bt1.printList();
    }
}
