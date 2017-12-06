import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeUI extends BaseUI
{
    private JFrame screen;
    private JLabel title;
    private JButton startWorkout;
    private JButton options;
    private JButton logOut;
    Clicked click = new Clicked();
    Person p = new Person();
    Button b = new Button();
    
    boolean startClicked = false;
    boolean optClicked = false;
    
    
    
    public HomeUI()
    {

    }
    
    public void display() 
    {
        screen = new JFrame("WeightLiftingApp");
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(4,1,10,10));
        
        title = new JLabel("Welcome! Please select an option.",JLabel.CENTER);
        startWorkout = new JButton("Start Workout");
        options = new JButton("Settings");
        logOut = new JButton("Log Out");
        
        
        startWorkout.addActionListener(b);
        options.addActionListener(b);
        logOut.addActionListener(b);
        
        screen.add(title);
        screen.add(startWorkout);
        screen.add(options);
        screen.add(logOut);
        
        screen.setVisible(true);
    }

    public static void main(String[] args)
    {
        new HomeUI();
    }
    
    private class Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==startWorkout)
            {
                startClicked=true;
                System.out.println("works");
            }
            if (e.getSource()==options)
            {
                optClicked=true;
            }
            if (e.getSource()==logOut)
            {
                screen.setVisible(false);
            }
        }
    }

    public boolean isClicked()
    {
        return false;
    }
}
