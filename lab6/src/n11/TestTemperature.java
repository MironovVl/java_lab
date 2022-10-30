package n11;

import java.util.ArrayList;

public class TestTemperature {
    public static void main(String[] args) {
        Convert c1 = new Convert();
        ArrayList<Double> temperature = c1.convert(36.6);
        for (double t :temperature){
            System.out.println(t);
        }
    }
}
