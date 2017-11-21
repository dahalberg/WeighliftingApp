
public abstract class Workout implements PrimaryLowerBody,Upper1,SubSet1,Upper2,SubSet2,Core
{
    PrimaryLowerBody lowerBody;
    Upper1 U1;
    SubSet1 S1;
    Upper2 U2;
    SubSet2 S2;
    Core core;
    int day;
    int week;
    int max;
        
    public Workout(int week)
    {
        this.week=week;
    }
    public void primaryLowerBody(int max, int week)
    {
        this.lowerBody.primaryLowerBody(max,week);
    }
    public void upper1(int week)
    {
        this.U1.upper1(week);
    }
    public void subset1()
    {
        this.S1.subset1();
    }
    public void upper2()
    {
        this.U2.upper2();
    }
        public void subset2()
    {
        this.S2.subset2();
    }
    public void coreWork()
    {
        this.core.coreWork();
    }
    public abstract void display();
    public int getWeek()
    {
        return week;
    }
}
