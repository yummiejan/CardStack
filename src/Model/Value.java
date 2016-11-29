package Model;

/**
 * Created by gast05 on 28.11.2016.
 */
public enum Value {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private String value;

    Value(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
