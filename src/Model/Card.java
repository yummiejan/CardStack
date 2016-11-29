package Model;

import View.DrawableObject;
import View.DrawingPanel;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by gast05 on 28.11.2016.
 */
public class Card implements DrawableObject {

    private double xPos,yPos,width,height;
    private int fontSize;
    private Suits suit;
    private Value value;
    private Rectangle2D.Double rectangle;


    public Card(double xPos,double yPos,Suits suit, Value value){
        this.suit = suit;
        this.value = value;
        this.xPos = xPos;
        this.yPos = yPos;
        width = 250;
        height = 400;
        fontSize = 50;

        rectangle = new Rectangle2D.Double(xPos, yPos, width, height);
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        g2d.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
        g2d.setColor(new Color(255,255, 255));
        g2d.fill(rectangle);
        g2d.setColor(new Color(0,0,0));
        g2d.draw(rectangle);
        rectangle.setFrame(xPos,yPos,width,height);
        switch(suit){
            case SPADES:
                g2d.drawString("\u2660",(int)(xPos),(int)(yPos)+40);
                g2d.drawString("\u2660",(int)(xPos)+210,(int)(yPos)+399);
                break;
            case CLUBS:
                g2d.drawString("\u2663",(int)(xPos),(int)(yPos)+40);
                g2d.drawString("\u2663",(int)(xPos)+210,(int)(yPos)+399);
                break;
            case DIAMONDS:
                g2d.drawString("\u2666",(int)(xPos),(int)(yPos)+40);
                g2d.drawString("\u2666",(int)(xPos)+210,(int)(yPos)+399);
                break;
            case HEARTS:
                g2d.drawString("\u2665",(int)(xPos),(int)(yPos)+40);
                g2d.drawString("\u2665",(int)(xPos)+210,(int)(yPos)+399);
                break;
        }
        switch(value){
            case ACE:
                g2d.drawString("A",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case TWO:
                g2d.drawString("2",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case THREE:
                g2d.drawString("3",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case FOUR:
                g2d.drawString("4",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case FIVE:
                g2d.drawString("5",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case SIX:
                g2d.drawString("6",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case SEVEN:
                g2d.drawString("7",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case EIGHT:
                g2d.drawString("8",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case NINE:
                g2d.drawString("9",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case TEN:
                g2d.drawString("10",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case JACK:
                g2d.drawString("J",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case QUEEN:
                g2d.drawString("Q",(int)(xPos)+110,(int)(yPos)+215);
                break;
            case KING:
                g2d.drawString("K",(int)(xPos)+110,(int)(yPos)+215);
                break;
        }
    }

    @Override
    public void update(double dt) {

    }
}
