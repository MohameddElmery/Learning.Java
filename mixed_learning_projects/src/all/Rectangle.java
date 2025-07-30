package all;

public class Rectangle
{

    public static void main(String[] args)
    {
        Rectangle r1, r2;
        r1 = new Rectangle(10, 20);
        r2 = new Rectangle(r1);

        r2.setLength(30);
        r2.setWidth(40);
/*         if(r1.compare(r2))
        System.out.println("they are equal");
        else
        System.out.println("they are not equal");

 */





        System.out.println("the r2 Length = " + "\n" + r1.getLength());

        System.out.println("the r2 Width =" + "\n" + r1.getWidth());
    }


    private double length;
    private double width;


    public static int changeValue(int c)
    {
        Rectangle.changeValue(5,6);
        c += 50;
        return c ;
    }

    public static int changeValue(int c, int b)
    {
        
        c = b + 50;
        return c ;
    }

    public Rectangle()
    {
        //this(5);
        this.add(5,6);
        Rectangle.changeValue(5);
        System.out.println("===================");
        
        this.add(0, 0);
    }

    public Rectangle(int X)
    {
        //this();
        //this.add(5,6);
        for(int i = X ; i<5; i++)
        {
            System.out.println(X);
        }
    }

    public Rectangle(int X, int Y)
    {
        setLength(X);
        setWidth(Y);
    }

    public Rectangle(Rectangle r1)
    {
        this.setLength(r1.getLength());
        this.setWidth(r1.getWidth());
    }

    public boolean compare (Rectangle X)
    {
        if (this.getLength() == X.getLength() && this.getWidth() == X.getWidth())
        return true;
        else
        return false;
    }

    public Rectangle roomSum(Rectangle r1, Rectangle r2)
    {
        Rectangle rtot = new Rectangle();
        rtot.length = r1.length + r2.length;
        rtot.width = r1.width + r2.width;

        return rtot;

    }

    public Rectangle add(Rectangle r2)
    {
        Rectangle r3 = new Rectangle();

        //r3.length = this.length + r2.length;
        //r3.width = this.width +  r2.width;

        r3.setLength(this.getLength() + r2.getLength());
        r3.setWidth(this.getWidth() + r2.getWidth());

        return r3;
    }

    public int add(int num1, int num2)
    {
        this.setLength(num2);
        Rectangle.changeValue(num2);
        Rectangle.changeValue(num2);
        return num1 + num2;
    }

    public void modifyObject(Rectangle r1, Rectangle r2)
    {
        //r.length = 67;
        //this();
        r1.setLength(10);
        r1.setWidth(20);
        r2.setLength(30);
        r2.setWidth(40);
    }

    public void setLength(double X)
    {
        length = X;
    }

    public void setWidth(double Y)
    {
        width = Y;
    }

    public float getLength()
    {
        return (float)length;
    }

    public float getWidth()
    {
        return (float)width;
    }

    public float getArea()
    {
        return (float)(length * width);
    }

    public double getNationality()
    {
        return length * width;
    }

}