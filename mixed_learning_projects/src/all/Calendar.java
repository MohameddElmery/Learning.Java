package all;

public class Calendar
{

    private int week;
    private Day workDay;



    public Calendar()
    {
        System.out.println("this is the Calendar class");
        System.out.println("===============");
        System.out.println(getWorkDay());
    }

    public void setWeek(int X)
    {
        week = X;
    }

    public int getWeek()
    {
        return week;
    }

    public void setWorkDay(Day X)
    {
        workDay = X;
    }

    public Day getWorkDay()
    {
        //setWorkDay(Day.MONDAY);
        return workDay;
    }


}
