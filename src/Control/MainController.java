package Control;

import View.MainFrame;
import Model.*;

/**
 * Created by gast05 on 28.11.2016.
 */
public class MainController {
    private MainFrame frame;
    private StackHandler handler;

    public MainController(MainFrame frame){
        this.frame = frame;
        handler = new StackHandler(frame);
        Card newCard = new Card(100,75,Suits.SPADES,Value.ACE);
        Card newCard2 = new Card(400,75,Suits.SPADES,Value.ACE);
        frame.getActiveDrawingPanel().addObject(newCard);
        frame.getActiveDrawingPanel().addObject(newCard2);
    }
}
