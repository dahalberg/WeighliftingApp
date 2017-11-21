import java.util.Scanner;

public class FrontSquat implements PrimaryLowerBody
{
    public FrontSquat()
    {

    }
    
    public void primaryLowerBody(int max,int weekx)
    {
        int maxFS;
        int week;
        maxFS=max;
        week=weekx;
        PercentageCalculator percentage = new PercentageCalculator();
        
        System.out.println("1A. FRONT SQUAT: 5x5");
        System.out.println(percentage.percent(maxFS,.5,week) + ", " +
                           percentage.percent(maxFS,.6,week) + ", " +
                           percentage.percent(maxFS,.7,week) + ", " +
                           percentage.percent(maxFS,.75,week) + ", " +
                           percentage.percent(maxFS,.8,week));

                
    }
}
