package n7_8;

public class TestPrintable {
    public static void main(String[] args) {
        Printable[] printables = new Printable[5];
        printables[0]=new Magazine("журнал 1");
        printables[1]=new Book("книга 1");
        printables[2]=new Magazine("журнал 2");
        printables[3]=new Book("книга 2");
        printables[4]=new Magazine("журнал 3");
        Magazine.printMagazines(printables);
        Book.printBook(printables);
    }

}
