import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TestRunner
{
    HomeUI home = new HomeUI();
    StartWorkoutUI workout = new StartWorkoutUI();
    SettingsUI settings = new SettingsUI();
    Clicked c = new Clicked();

    
    
    public TestRunner()
    {
        home.display();
    }
    
    public static void main(String[] args)
    {
        new TestRunner();
    }
    
    
    
}
