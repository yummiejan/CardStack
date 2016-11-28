package Model;

import View.DrawableObject;
import View.DrawingPanel;

import java.awt.*;

/**
 * Created by gast05 on 28.11.2016.
 */
public class Card implements DrawableObject {

    private Suits suit;
    private Value value;

    public Card(Suits suit, Value value){
        this.suit = suit;
        this.value = value;
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {

    }

    @Override
    public void update(double dt) {

    }
}
