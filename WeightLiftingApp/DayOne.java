import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;


public class DayOne extends Workout
{
    private JFrame screen;
    private JLabel lowerB;
    private JLabel u1;
    private JLabel s1;
    private JLabel u2;
    private JLabel s2;
    
    public DayOne(int week)
    {
        super(week);
        this.lowerBody = new FrontSquat();
        this.U1 = new DBChestPress();
        this.S1 = new SBLegCurl();
        this.U2 = new WTPullUps();
        this.S2 = new ChestSupportT();
    }
    
    public void display()
    {
        // int maxFS;
        // Scanner in = new Scanner(System.in);
        // PercentageCalculator percentage = new PercentageCalculator();
        
        // System.out.println("Enter your max front squat weight: ");
        // maxFS = in.nextInt();
        // System.out.println("Here is your workout.");
        // lowerBody.primaryLowerBody(maxFS,week);
        // U1.upper1(week);
        // S1.subset1();
        // U2.upper2();
        // S2.subset2();
        // System.out.println("4A. DEADBUGS: 2x10ea");
        // System.out.println("4B. BAND ANTIROTATION: 2x10ea");
                  
        screen = new JFrame();
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(10,1,10,10));
        
        lowerB = new JLabel(Integer.toString(lowerBody.primaryLowerBody(200,1)));
        
        screen.add(lowerB);
        
        screen.setVisible(true);
    }

    
}
