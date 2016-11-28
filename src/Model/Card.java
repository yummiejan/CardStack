package Model;

import View.DrawableObject;
import View.DrawingPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by gast05 on 28.11.2016.
 */
public class Card implements DrawableObject {

    private Suits suit;
    private Value value;
    private Rectangle2D.Double rectangle;


    public Card(Suits suit, Value value){
        this.suit = suit;
        this.value = value;
    }

    private void drawCard(){

    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {

    }

    @Override
    public void update(double dt) {

    }
}
