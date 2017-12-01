import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class TestProgram
{
    private JFrame screen;
    private Polygon startButton;
    private Polygon startWorkout;
    private Polygon editAccount;
    private Polygon logOut;
    private Polygon day1;
    private Polygon day2;
    private Polygon day3;
    
    public TestProgram()
    {
        Screen();
        initial();
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new TestProgram();
            }
        });                
    }
    
    public void Screen()
    {
        screen = new JFrame();
        screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen.setVisible(true);
    }
    
    public void initial()
    {
        int xStart[]={200,400,400,200};
        int yStart[]={450,450,550,550};
        
        startButton=new Polygon(xStart,yStart,xStart.length);
        
        JPanel init = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.black);
                g.fillPolygon(startButton);
                g.drawPolygon(startButton);
            }
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(600,700);
            }
        };
        
        MouseAdapter ma = new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {
                if (startButton.contains(me.getPoint()))
                {
                    init.setVisible(false);
                    option();
                }
            }
        };
        
        init.addMouseListener(ma);
        screen.add(init);
        screen.pack();
    }
    
    
    public void option()
    {
        int xWorkout[] = {200,400,400,200};
        int yWorkout[] = {250,250,350,350};
        int xAccount[] = {200,400,400,200};
        int yAccount[] = {400,400,500,500};
        int xLogOut[] = {200,400,400,200};
        int yLogOut[] = {550,550,650,650};
        
        startWorkout = new Polygon(xWorkout,yWorkout,xWorkout.length);
        editAccount = new Polygon(xAccount,yAccount,xAccount.length);
        logOut = new Polygon(xLogOut,yLogOut,xLogOut.length);
        
        JPanel opt = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.black);
                g.fillPolygon(startWorkout);
                g.fillPolygon(editAccount);
                g.fillPolygon(logOut);
                g.drawPolygon(startWorkout);
                g.drawPolygon(editAccount);
                g.drawPolygon(logOut);
            }
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(600,700);
            }
        };
        
        MouseAdapter ma = new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {
                if (startWorkout.contains(me.getPoint()))
                {
                    opt.setVisible(false);
                    Program();
                }
                if (editAccount.contains(me.getPoint()))
                {
                    opt.setVisible(false);
                    Settings();
                }
                if (logOut.contains(me.getPoint()))
                {
                    screen.setVisible(false);
                }
            }
        };
        
        opt.addMouseListener(ma);
        screen.add(opt);
        screen.pack();
    }

    public void Program()
    {
        BuildProgram lift = new BuildProgram();
        
        
        int xDay1[] = {200,400,400,200};
        int yDay1[] = {250,250,350,350};
        int xDay2[] = {200,400,400,200};
        int yDay2[] = {400,400,500,500};
        int xDay3[] = {200,400,400,200};
        int yDay3[] = {550,550,650,650};
        
        day1= new Polygon(xDay1,yDay1,xDay1.length);
        day2= new Polygon(xDay2,yDay2,xDay2.length);
        day3= new Polygon(xDay3,yDay3,xDay3.length);
        
        JPanel pro = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.blue);
                g.fillPolygon(day1);
                g.fillPolygon(day2);
                g.fillPolygon(day3);
                g.drawPolygon(day1);
                g.drawPolygon(day2);
                g.drawPolygon(day3);
            }
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(600,700);
            }
        };
        
        MouseAdapter ma = new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {
                int day = 0;
                if (day1.contains(me.getPoint()))
                {
                    day=1;
                }
                if (day2.contains(me.getPoint()))
                {
                    day=2;
                }
                if (day3.contains(me.getPoint()))
                {
                    day=3;
                }
            }
        };
        
        pro.addMouseListener(ma);
        screen.add(pro);
        screen.pack();        
    }
    
    public void Settings()
    {
        System.out.println("hello!");
    }
    
    
    
}
