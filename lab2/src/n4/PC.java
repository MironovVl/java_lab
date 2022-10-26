package n4;

public class PC {
    private String name;
    private int cost;
    PC(String name, int cost){
        this.name=name;
        this.cost=cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
