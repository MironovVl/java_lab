package n2;

import java.util.ArrayList;

public class Atelier implements MenClothing,WomenClothing{

    public ArrayList<Clothes> clothes;

    @Override
    public void dressMan() {
        for (Clothes cl :clothes){
            if (cl instanceof MenClothing){
                ((MenClothing) cl).dressMan();
                System.out.println(cl.toString());
            }
        }
    }

    @Override
    public void dressWoman() {
        for (Clothes cl :clothes){
            if (cl instanceof WomenClothing){
                ((WomenClothing) cl).dressWoman();
                System.out.println(cl.toString());
            }
        }
    }

    enum Size {
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);
        private final int euroSize;

        Size(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() {
            return euroSize;
        }
    }

    Atelier(){
        clothes=new ArrayList<>();
        TShirt tShirt = new TShirt("white", Size.S, 1000);
        Pants pants = new Pants("black", Size.L, 1200);
        Skirt skirt = new Skirt("blue", Size.S, 1500);
        Tie tie = new Tie("brown", Size.XS, 600);
        clothes.add(tShirt);
        clothes.add(pants);
        clothes.add(skirt);
        clothes.add(tie);
        dressMan();
        dressWoman();
    }
}
