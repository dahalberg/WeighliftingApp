import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.util.Scanner;



public class Tester
{
    public String q;
    private JFrame screen;
    private JLabel jl;
    private JButton jb;
    private JTextField jt;
    
    
    public Tester() {
        program();
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
     
    public static void main(String[] args) {
        new Tester();
    }
    
    public void program() {
        screen = new JFrame("Window");
        
        screen.setSize(500,500);
        
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new FlowLayout());
        
        jl = new JLabel("Please enter a number:");
        jb = new JButton("Enter");
        jt = new JTextField(15);
        
        screen.add(jl);
        screen.add(jt); 
        screen.add(jb);
        
        screen.setVisible(true);
        
        
    }

    
 
}
