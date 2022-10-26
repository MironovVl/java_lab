package n2;

public class Skirt extends Clothes implements WomenClothing {
    Skirt(String color, Atelier.Size size, int cost) {
        super(color, size, cost);
    }

    @Override
    public void dressWoman() {
        System.out.println("женская юбка");
    }

    @Override
    public String toString() {
        return "Skirt: " + super.toString();
    }
}
