package Control;

import Model.*;
import View.*;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by gast05 on 28.11.2016.
 */
public class StackHandler implements InteractableObject {
    private Stack<Card> stackOfUnrevealed;
    private Stack<Card> stackOfRevealed;
    private final static int Anzahl = 52;

    public StackHandler(MainFrame frame){
        stackOfUnrevealed = new Stack<Card>();
        stackOfRevealed = new Stack<Card>();
    }

    public void createCards(){

    }

    @Override
    public void keyPressed(int key) {

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
}
