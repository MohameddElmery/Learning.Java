package all;

public class Student extends Person
{
    //attributes
    private int studyLevel;
    private String specialization;
    private float GPA;
    //String nationality;


    //constructors
    public Student()
    {
        //super("Ahmed", 25, "october", "Egypt");
        //super("Elmery", 25.0, "47533, Kleve", "Egyptian" );
        System.out.println("this is the Student class");
        System.out.println("===========================");

    }

    public Student (double a)
    {
        this();
    }

    public Student(String n, double a)
    {
        //super("Elmery", 25.0, "47533, Kleve", "Egyptian" );
        this(25);
        //super.setName(n);
        //super.setAge(a);
    }

    public Student(String n, double a, String ad, String nat)
    {
        
        //super("Elmery", 25.0, "47533, Kleve", "Egyptian" );

        this(n, a);
        //super(n, ad);
        setAddress(ad);
        setNationality(nat);
    }


    //setters
    public void setStudyLevel(int X)
    {
        studyLevel= X;
    }

    public void setSpecialization(String X)
    {
        specialization= X;
    }

    public void setGPA(double X)
    {
        GPA = (float)X;
    }


    //getters
    public int getStudyLevel()
    {
        return studyLevel;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public double getGPA()
    {
        setNationality("Egypt");

        return GPA;
    }

    @Override
    public final void setNationality(String X)
    {
        super.setNationality(X + " & Egypt");

    }


}
