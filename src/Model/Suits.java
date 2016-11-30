package Model;

/**
 * Created by gast05 on 28.11.2016.
 */
public enum Suits {
    SPADES("♠"),
    CLUBS("♣"),
    DIAMONDS("♦"),
    HEARTS("♥");
    private String suit;

    Suits(String symbol){
        this.suit = symbol;
    }

    public String getSuit(){
        return suit;
    }
}
