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
    private int startClicked=0;
    
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
        
        JPanel p = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                if (startClicked==0)
                {
                    g.setColor(Color.blue);
                    g.fillPolygon(startButton);
                    g.drawPolygon(startButton);
                }
                else if (startClicked==1)
                {
                    g.dispose();
                }
                repaint();
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
                    startClicked=1;
                }
            }
        };
        
        p.addMouseListener(ma);
        screen.add(p);
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
        
        JPanel m = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.blue);
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
                super.mouseClicked(me);
                if (startWorkout.contains(me.getPoint()))
                {
                    BuildProgram build = new BuildProgram();
                    
                    
                    System.out.println("jello");
                }
                if (editAccount.contains(me.getPoint()))
                {
                    
                }
                if (logOut.contains(me.getPoint()))
                {
                    
                }
            }
        };
        
        m.addMouseListener(ma);
        screen.add(m);
        screen.pack();
        
        
    }

    
    
}
