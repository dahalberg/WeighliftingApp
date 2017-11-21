import java.util.Scanner;


public class Option
{
    public Option()
    {

    }
    
    public void optionDisplay()
    {
        Scanner opt = new Scanner(System.in);
        BuildProgram buildProgram = new BuildProgram();
        RunProgram logout = new RunProgram();
        Option newOption = new Option();
        int option;
        int counter = 0;
        int day;
        int week;
        
        if (counter==0)
        {
            System.out.println("Please select an option:");
        }
        else
        {
            System.out.println("Please select another option:");
        }
        System.out.println("1. START WORKOUT");
        System.out.println("2. EDIT ACCOUNT");
        System.out.println("3. LOG OUT");
        option=opt.nextInt();        
        if (option==1)
        {
            Scanner chooseDay = new Scanner(System.in);
            Scanner chooseWeek = new Scanner(System.in);
            System.out.println("What day are you on?");
            day=chooseDay.nextInt();
            if (day==1)
            {
                System.out.println("What week are you on?");
                week=chooseWeek.nextInt();
                Workout workout = buildProgram.createWorkout(1,week);
            }
            else if (day==2)
            {
                System.out.println("What week are you on?");
                week=chooseWeek.nextInt();
                Workout workout = buildProgram.createWorkout(2,week);
            }
            else if (day==3)
            {
                System.out.println("What week are you on?");
                week=chooseWeek.nextInt();
                Workout workout = buildProgram.createWorkout(3,week);
            }
            else
            {
                System.out.println("You have completed your workouts for the week");
            }
        }
        else if (option==2)
        {
            System.out.println("helloworld");
        }
        else if (option==3)
        {
            //logout.run();   
        }
        else
        {
            counter++;
            newOption.optionDisplay();
        }
    }
}
