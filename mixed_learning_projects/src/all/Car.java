package all;

public class Car
{
    private String make;
    private int yearModel;

    public void setMake(String X)
    {
        if(X =="Honda" || X == "BMW")
            make = X;
        else
            System.out.println("the maker is not found");
    }

    public void setYearModel(int X)
    {
        if (X > 2010 && X < 2026)
            yearModel = X;
        else
            System.out.println("the model is not found");

    }

    public String getMake()
    {
        return make;
    }

    public int getYearModel()
    {
        return yearModel;
    }


}
