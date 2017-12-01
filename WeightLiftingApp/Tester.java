import java.util.Scanner;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.*;



public class Tester
{
    public String q;
    private JFrame screen;
    
    
    public Tester()
    {

    }

    public void systemCloser()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Do you want to close this window?");
        q = in.next();
        if (q.equals("yes"))
        {
            System.exit(10);
            //this does not close the program, just puts in behind another
            //screen
        }
        else
        {
            System.out.println("Window is open");
        }
    }
    
    public void labelTesting()
    {
        screen = new JFrame();
        screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen.setVisible(true);
        
        JPanel panel = new JPanel()
        {
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(1000,700);
            }
        };
        
        screen.add(panel);
        screen.pack();
        
    }
    
}
