package n2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    Pants(String color, Atelier.Size size, int cost) {
        super(color, size, cost);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны мужские");
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны женские");
    }

    @Override
    public String toString() {
        return "Pants: " + super.toString();
    }
}
