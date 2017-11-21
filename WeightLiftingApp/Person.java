
public class Person
{
    private String name;
    private int maxFS;
    private int maxHC;
    private int maxDL;
    
    
    public Person(String name, int maxFS, int maxHC, int maxDL)
    {
        this.name=name;
        this.maxFS = maxFS;
        this.maxHC = maxHC;
        this.maxDL = maxDL;
    }
    
    public String getName()
    {
        return name;
    }   
    public int getMaxFrontSquat()
    {
        return maxFS;
    }   
    public int getMaxHangClean()
    {
        return maxHC;
    }    
    public int getMaxDeadLift()
    {
        return maxDL;
    }
    
    


}
