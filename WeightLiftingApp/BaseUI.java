import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public abstract class BaseUI
{
    
    public BaseUI()
    {
    }
    
    abstract void display();
    
    private abstract class Button implements ActionListener
    {
        public abstract void actionPerformed(ActionEvent e);
    }
    
    abstract boolean isClicked();
}
