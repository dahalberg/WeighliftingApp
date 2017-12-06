import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Thread;

public class TestRunner
{
    BaseUI base = null;
    HomeUI home = new HomeUI();
    StartWorkoutUI start = new StartWorkoutUI();
    SettingsUI settings = new SettingsUI();

    boolean update;

    public TestRunner()
    {
        for (int i=0;i<1000;i++)
        {
            do
            {
                run();
            }while(!update);
            update=false;
        }
    }

    public static void main(String[] args)
    {
        new TestRunner();
    }

    public BaseUI run()
    {
        
        
        
        home.display();
        update=true;
        return null;
    }
}
