package all;

public class Circle
{
    double radius;


    public Circle()
    {
        //Person.getNationality();
    }


    Circle(double X)
    {
        radius = X;
    }

    float getRadius()
    {
        return (float)(radius);
    }
    public float getArea()
    {
        return (float)radius * (float)radius *(float) Math.PI;
    }

    
    public float getPerimeter()
    {
        return (float)(2 * Math.PI * radius);
    }
    double changeRadius(double X)
    {
        return radius = X;
    }




}
