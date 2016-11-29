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

    private double xPos,yPos,width,height;
    private Suits suit;
    private Value value;
    private Rectangle2D.Double rectangle;


    public Card(Suits suit, Value value){
        this.suit = suit;
        this.value = value;
        xPos = 100;
        yPos = 100;
        width = 50;
        height = 100;
        rectangle = new Rectangle2D.Double(xPos,yPos,width,height);
    }

    private void drawCard(){

    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        g2d.setColor(new Color(255,255, 255));
        g2d.fill(rectangle);
        g2d.setColor(new Color(0,0,0));
        g2d.draw(rectangle);
        rectangle.setFrame(xPos,yPos,width,height);
    }

    @Override
    public void update(double dt) {

    }
}
