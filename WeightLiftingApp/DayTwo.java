import java.util.Scanner;


public class DayTwo extends Workout
{
    public DayTwo(int week)
    {
        super(week);
        this.lowerBody = new HangClean();
        this.U1 = new WTPushUp();
    }

    public void display()
    {
        int maxHC;
        int maxDB;
        Scanner in = new Scanner(System.in);
        PercentageCalculator percentage = new PercentageCalculator();
        
        System.out.println("Enter your max hang clean weight: ");
        maxHC = in.nextInt();
        System.out.println("Here is your workout.");
        lowerBody.primaryLowerBody(maxHC,week);
        U1.upper1(week);
        
        
        
    }
}
