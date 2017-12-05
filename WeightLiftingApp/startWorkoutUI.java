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
    private JButton start;
    private JLabel error;
    private int day;
    private int week;
    private boolean dayIsNum;
    private boolean weekIsNum;
    StringMethods sm = new StringMethods();
    
    
    public StartWorkoutUI()
    {
        screen = new JFrame("WeightLiftingApp");
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(7,1,10,10));
        
        dayL = new JLabel("What day are you on?",JLabel.CENTER);
        weekL = new JLabel("What week are you on?",JLabel.CENTER);
        dayTF = new JTextField(10);
        weekTF = new JTextField(10);
        enter = new JButton("Enter");
        start = new JButton("Start Workout");
        error = new JLabel();
        
        enter.addActionListener(new enterButton());
        start.addActionListener(new startButton());
        
        screen.add(dayL);
        screen.add(dayTF);
        screen.add(weekL);
        screen.add(weekTF);
        screen.add(enter);
        screen.add(start);
        screen.add(error);
        
        screen.setVisible(true);
    }
    
    public static void display()
    {
        
    }
    
    public static void main(String[] args)
    {
        new StartWorkoutUI();
    }
    
    private class enterButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            dayIsNum=sm.isStringANum(dayTF.getText());
            weekIsNum=sm.isStringANum(weekTF.getText());
            
            if (dayIsNum && weekIsNum)
            {
                day = Integer.valueOf(dayTF.getText());
                week = Integer.valueOf(weekTF.getText());
            }
            else
            {
                error.setText("Please enter a number for day and week");
            }
        }
    }
    
    private class startButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            BuildProgram lift = new BuildProgram();
            lift.createWorkout(day,week);
        }
    }
    
    
    
    
    
}
