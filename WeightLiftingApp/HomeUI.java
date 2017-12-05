import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeUI
{
    private JFrame screen;
    private JLabel title;
    private JButton startWorkout;
    private JButton options;
    private JButton logOut;
    Clicked click = new Clicked();
    Person p = new Person();
    
    
    public HomeUI()
    {
        screen = new JFrame("WeightLiftingApp");
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(4,1,10,10));
        
        title = new JLabel("Welcome! Please select an option.",JLabel.CENTER);
        startWorkout = new JButton("Start Workout");
        options = new JButton("Settings");
        logOut = new JButton("Log Out");
        
        startWorkout.addActionListener(new startButton());
        options.addActionListener(new optionButton());
        logOut.addActionListener(new logOutButton());
        
        screen.add(title);
        screen.add(startWorkout);
        screen.add(options);
        screen.add(logOut);
        
        screen.setVisible(true);
    }
    
    public void display() 
    {
        
    }
    
    public static void main(String[] args) 
    {
        new HomeUI();
    }
    
    private class startButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new StartWorkoutUI();
            screen.setVisible(false);
        }
    }
    
    private class optionButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new SettingsUI();
            screen.setVisible(false);
        }
    }
    
    private class logOutButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println(p.getMaxFS());
        }
    }
    
}
