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
    private final int AMOUNT = Suits.values().length * Value.values().length;
    private final double xPosR = 400, xPosU = 100;
    private MainFrame frame;

    public StackHandler(MainFrame frame){
        this.frame = frame;
        stackOfUnrevealed = new Stack<Card>();
        stackOfRevealed = new Stack<Card>();
        createStackOfUnrevealed(100,75);
        frame.getActiveDrawingPanel().addObject(this);
    }

    @Override
    public void keyPressed(int key) {
        if (key == KeyEvent.VK_RIGHT) {
            if (!stackOfUnrevealed.isEmpty()) {
                stackOfRevealed.push(stackOfUnrevealed.top());
                stackOfUnrevealed.top().turnCard(xPosR, 75);
                stackOfUnrevealed.pop();
                frame.getActiveDrawingPanel().removeObject(stackOfRevealed.top());
                frame.getActiveDrawingPanel().addObject(stackOfRevealed.top());
            }
        } else if (key == KeyEvent.VK_LEFT) {
            if (!stackOfRevealed.isEmpty()) {
                stackOfUnrevealed.push(stackOfRevealed.top());
                stackOfRevealed.top().turnCard(xPosU, 75);
                stackOfRevealed.pop();
                frame.getActiveDrawingPanel().removeObject(stackOfUnrevealed.top());
                frame.getActiveDrawingPanel().addObject(stackOfUnrevealed.top());
            }
        }
    }

    @Override
    public void keyReleased(int key) {

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
        Card[] tmpArray = new Card[AMOUNT];
        for (int i = 0; i <Suits.values().length; i++) {
            int tempCounter = (tmpArray.length/Suits.values().length)*i;
            for (int j = 0; j < (tmpArray.length/Suits.values().length); j++) {
                Suits suits = Suits.values()[i];
                Value value = Value.values()[j];
                tmpArray[j+tempCounter]= new Card(xPos,yPos,suits,value);

            }
        }

        for(int i = 0; i < 4766756; ++i){
            int r1 = (int)(Math.random() * AMOUNT - 1);
            int r2 = (int)(Math.random() * AMOUNT - 1);
            Card card = tmpArray[r1];
            tmpArray[r1] = tmpArray[r2];
            tmpArray[r2] = card;
        }

        for (Card c: tmpArray) {
            System.out.println(c.toString());
            frame.getActiveDrawingPanel().addObject(c);
            stackOfUnrevealed.push(c);
        }

    }

    public void shuffle(){

    }

}
