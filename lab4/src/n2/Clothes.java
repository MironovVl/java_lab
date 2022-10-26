package n2;

public abstract class Clothes {
    String color;
    Atelier.Size size;
    int cost;
    boolean isMen;

    public int getCoast() {
        return cost;
    }

    public Atelier.Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    Clothes(String color, Atelier.Size size, int cost) {
        this.cost = cost;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }
}
