package Model;

import View.DrawableObject;
import View.DrawingPanel;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * Created by gast05 on 28.11.2016.
 */
public class Card implements DrawableObject {

    private double xPos,yPos,width,height;
    private int fontSize;
    private Suits suit;
    private Value value;
    private RoundRectangle2D.Double rectangle;
    private boolean revealed;


    public Card(double xPos,double yPos,Suits suit, Value value){
        this.suit = suit;
        this.value = value;
        this.xPos = xPos;
        this.yPos = yPos;
        width = 250;
        height = 400;
        fontSize = 50;
        revealed = false;

        rectangle = new RoundRectangle2D.Double(xPos,yPos,width,height,10,20);
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        g2d.setColor(new Color(255, 255, 255));
        g2d.fill(rectangle);
        g2d.setColor(new Color(0, 0, 0));
        g2d.draw(rectangle);
        rectangle.setFrame(xPos, yPos, width, height);

        if(revealed) {
            g2d.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            int widthOfText = g2d.getFontMetrics().stringWidth(value.getValue());

            g2d.drawString(suit.getSymbol(), (int) (xPos), (int) (yPos) + 40);
            g2d.drawString(suit.getSymbol(), (int) (xPos) + 210, (int) (yPos) + 399);

            g2d.drawString(value.getValue(), (int) (xPos + width - widthOfText), (int) (yPos) + 40);
            g2d.drawString(value.getValue(), (int) (xPos) + 2, (int) (yPos) + 399);
        }
    }

    @Override
    public void update(double dt) {

    }

    public void turnCard(double xPos, double yPos){
        this.xPos = xPos;
        this.yPos = yPos;
        revealed = !revealed;
    }
}
