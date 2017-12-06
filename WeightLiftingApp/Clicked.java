
public class Clicked
{
    boolean workoutButton = false;
    boolean settingsButton = false;
    boolean exitButton = false;
    boolean enterButton = false;
    
    public Clicked()
    {
    }
    
    public void setToTrue(String string)
    {
        if (string.equals("workout"))
        {
            workoutButton = true;
        }
        
    }
    
    public boolean getBoolean(String string)
    {
        if (string.equals("workout"))
        {
            return workoutButton;
        }
        
        return false;
    }
    
    public void reset()
    {
        workoutButton = false;
        settingsButton = false;
        exitButton = false;
        enterButton = false;
    }
    
    public boolean isClicked()
    {
        if (!(workoutButton && settingsButton && exitButton && enterButton))
            return false;
        else
            return true;
    }
}
