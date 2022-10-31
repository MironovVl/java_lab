package n7_8;

public class Magazine implements Printable {
    private String label;

    Magazine(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "label='" + label + '\'' +
                '}';
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable pr : printables) {
            if (pr instanceof Magazine) {
                System.out.println(pr.toString());
            }
        }
    }

}
