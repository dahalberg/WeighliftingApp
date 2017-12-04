import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StartWorkoutUI
{
    private JFrame screen;
    private JLabel dayL;
    private JLabel weekL;
    private JTextField dayTF;
    private JTextField weekTF;
    private JButton enter;
    
    private int day;
    private int week;
    
    public StartWorkoutUI()
    {
        screen = new JFrame("WeightLiftingApp");
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(5,1,10,10));
        
        dayL = new JLabel("What day are you on?",JLabel.CENTER);
        weekL = new JLabel("What week are you on?",JLabel.CENTER);
        dayTF = new JTextField(10);
        weekTF = new JTextField(10);
        enter = new JButton("Enter");
        
        enter.addActionListener(new enterButton());
        
        screen.add(dayL);
        screen.add(dayTF);
        screen.add(weekL);
        screen.add(weekTF);
        screen.add(enter);
        
        screen.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new StartWorkoutUI();
    }
    
    private class enterButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            BuildProgram lift = new BuildProgram();
            lift.createWorkout(day,week);
            
        }
    }
    
    public void stringToInt(String s)
    {
        //try-catch statement
        String dayS = dayTF.getText();
        String weekS = weekTF.getText();
        try
        {
            day = Integer.valueOf(dayS);
        }
        catch (Exception e)
        {
            
        }
        try
        {
            week = Integer.valueOf(weekS);
        }
        catch (Exception e)
        {
            
        }
        
    }
    
    
    
}
