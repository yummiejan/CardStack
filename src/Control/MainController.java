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
        handler = new StackHandler(frame);

    }
}
