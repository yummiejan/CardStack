package Control;

import Model.*;
import View.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by gast05 on 28.11.2016.
 */
public class StackHandler implements InteractableObject {
    private Stack<Card> stackOfUnrevealed;
    private Stack<Card> stackOfRevealed;
    private final static int AMOUNT = Suits.values().length * Value.values().length;
    private MainFrame frame;
    private Card card;

    public StackHandler(MainFrame frame){
        this.frame = frame;
        stackOfUnrevealed = new Stack<Card>();
        stackOfRevealed = new Stack<Card>();
        createStackOfUnrevealed(100,75);
    }

    @Override
    public void keyPressed(int key) {

    }

    @Override
    public void keyReleased(int key) {
        if(key == KeyEvent.VK_RIGHT){
            card.turnCard(400,75);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {

    }

    @Override
    public void update(double dt) {

    }

    public void createStackOfUnrevealed(double xPos, double yPos){
        Card[] tempArray = new Card[AMOUNT];
        for (int i = 0; i <Suits.values().length; i++) {
            int tempCounter = (tempArray.length/Suits.values().length)*i;
            for (int j = 0; j < (tempArray.length/Suits.values().length); j++) {
                Suits suits = Suits.values()[i];
                Value value = Value.values()[j];
                tempArray[j+tempCounter]= new Card(xPos,yPos,suits,value);
            }
        }
        for (Card c: tempArray) {
            frame.getActiveDrawingPanel().addObject(c);
            stackOfUnrevealed.push(c);
        }

    }
}
