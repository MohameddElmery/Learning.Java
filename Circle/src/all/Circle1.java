package all;

public class Circle1
{
    //attributes
    private double radius = 1;

    //constructors
    public Circle1()
    {
        System.out.println("I am the class \"Circle1\"");
    }

    public Circle1(double X)
    {
        radius = X;
    }

    //setter
    public void setRadius(double X)
    {
        radius = X;
    }

    //getters
    public double getArea()
    {
        return radius *radius * Math.PI;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
