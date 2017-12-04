import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SettingsUI
{
    private JFrame screen;
    private JLabel liftL;
    private JLabel weightL;
    private JLabel error;
    private JTextField liftTF;
    private JTextField weightTF;
    private JButton save;

    public int maxFS;
    public int maxHC;
    public int maxDL;
    
    public SettingsUI()
    {
        JFrame screen = new JFrame("WeightLiftingApp");
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(6,1,10,10));
        
        liftL = new JLabel("What lift would you like to change?");
        weightL = new JLabel("Enter weight");
        error = new JLabel();
        liftTF = new JTextField(10);
        weightTF = new JTextField(10);
        save = new JButton("Save");
        
        save.addActionListener(new saveButton());
        
        screen.add(liftL);
        screen.add(liftTF);
        screen.add(weightL);
        screen.add(weightTF);
        screen.add(save);
        screen.add(error);
        
        
        screen.setVisible(true);
    }

    public static void main(String[] args)
    {
        new SettingsUI();
    }
    
    private class saveButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //need to save new weights
            
            new TestProgram2();
        }
    }
    
    
    
    
    
    
    
    
    
    public void setMaxFS(int maxFS)
    {
        this.maxFS = maxFS;
    }
    public int getMaxFS()
    {
        return maxFS;
    }    
    public void setMaxHC(int maxHC)
    {
        this.maxHC = maxHC;
    }
    public int getMaxHC()
    {
        return maxHC;
    }   
    public void setMaxDL(int maxDL)
    {
        this.maxDL = maxDL;
    }
    public int getMaxDL()
    {
        return maxDL;
    }
}
