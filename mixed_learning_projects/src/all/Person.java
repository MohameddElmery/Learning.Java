package all;

public class Person
{
    //attributes
    private String name;
    private double age;
    private String address;
    String nationality;


    //constructors
    public Person()
    {

        System.out.println("this is the Person class check point");

                System.out.println("===========================");

    }

    public Person(String n, double a)
    {
        this("Elmery", 25.0, "47533, Kleve", "Egyptian" );

        name = n;
        age = a;
    }

    public Person(String n, double a, String ad, String nat)
    {
        //System.out.println("this is the Person class");
        //this("Ahmed", 25);
        address = ad;
        nationality = nat;
    }
/*     public Person(String X, String Y)
    {
        name = X;
        address = Y;
    }
 */

    //setters
    public void setName(String X)
    {
        name = X;
    }

    public void setAge(double X)
    {
        age = X;
    }

    public void setAddress(String X)
    {
        address = X;
    }

    public void setNationality(String X)
    {
        
        System.out.println(X);
        System.out.println("===========================");


    }


    //getters
    public String getName()
    {
        return name;
    }

    public double getAge()
    {
        return age;
    }

    public String getAddress()
    {
        return address;
    }

    public  String getNationality()
    {
        return nationality;
    }


}
