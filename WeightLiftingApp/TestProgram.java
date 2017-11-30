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
    private JFrame startScreen;
    private JFrame optionScreen;
    private Polygon startButton;
    private Polygon startWorkout;
    private Polygon editAccount;
    private Polygon logOut;
    
    public TestProgram()
    {
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
    
    
    public void initial()
    {
        startScreen = new JFrame();
        startScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        int xStart[]={200,400,400,200};
        int yStart[]={450,450,550,550};
        
        
        startButton=new Polygon(xStart,yStart,xStart.length);
        
        JPanel p = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.blue);
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
                    //option();
                    startScreen.setVisible(false);
                }
            }
        };
        
        p.addMouseListener(ma);
        startScreen.add(p);
        startScreen.pack();
        startScreen.setVisible(true);
    }
}
