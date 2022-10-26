package n2;

public class Tie extends Clothes implements MenClothing {

    Tie(String color, Atelier.Size size, int cost) {
        super(color, size, cost);
    }

    @Override
    public void dressMan() {
        System.out.println("мужской галстук");
    }

    @Override
    public String toString() {
        return "Tie: " + super.toString();
    }
}
