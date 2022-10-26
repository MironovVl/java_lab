package n9;

public class Card {
    private String suit;
    private int number;
    Card(String suit, int number){
        this.number=number;
        this.suit=suit;
    }
    public void printCard(){
        System.out.print(suit+" - "+number+";    ");
    }

}
