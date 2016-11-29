package Model;

/**
 * Created by gast05 on 28.11.2016.
 */
public enum Suits {
    SPADES("♠"),
    CLUBS("♣"),
    DIAMONDS("♦"),
    HEARTS("♥");
    private String symbol;

    Suits(String symbol){

    }

    public String getSymbol(){
        return symbol;
    }
}
