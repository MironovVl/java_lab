package n6_9;

public class Shop implements Printable {
    private String title;

    Shop(String title){
        this.title=title;
    }
    @Override
    public void print() {
        System.out.println("shop: "+title);
    }
}
