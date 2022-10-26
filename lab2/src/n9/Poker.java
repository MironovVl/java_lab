package n9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<Card>();
        for (int i=2; i<16; i++){
            cards.add(new Card("diamonds",i));
            cards.add(new Card("clubs",i));
            cards.add(new Card("hearts",i));
            cards.add(new Card("spades",i));
        }

        int plaers = 4;
        int numberCard;
        int quantityCard=56;
        Random random = new Random();
        for(int j=0;j<plaers;j++){
            for (int i = 0; i<5;i++) {
                numberCard = random.nextInt(quantityCard);
                quantityCard--;
                cards.get(numberCard).printCard();
                cards.remove(numberCard);
            }
            System.out.println();
            System.out.println();
        }
    }
}
