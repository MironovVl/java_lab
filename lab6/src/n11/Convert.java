package n11;

import java.util.ArrayList;

public class Convert implements Convertable {

    @Override
    public ArrayList<Double> convert(double oldData) {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(oldData+273.15);
        list.add(oldData*1.8+32);
        return list;
    }
}
