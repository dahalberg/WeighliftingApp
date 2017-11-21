

public class DBChestPress implements Upper1
{

    public DBChestPress()
    {

    }
    
    public void upper1(int weekx)
    {
        int week;
        week=weekx;
        
        PercentageCalculator percentage = new PercentageCalculator();
        
        System.out.println("2A. DUMBBELL CHEST PRESS: 4x6");
        System.out.println(percentage.percent(60,.8,week) + ", " +
                           percentage.percent(60,.85,week) + ", " +
                           percentage.percent(60,.9,week) + ", " +
                           percentage.percent(60,.9,week));
    }
    
}
