package n2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    TShirt(String color, Atelier.Size size, int cost) {
        super(color, size, cost);
    }

    @Override
    public void dressMan() {
        System.out.println("Футблка мужская");
    }

    @Override
    public void dressWoman() {
        System.out.println("Футблка женская");
    }

    @Override
    public String toString() {
        return "Tshirt: "+ super.toString();
    }
}
