package all;

public class Employee extends Person
{
    private int empID;
    private String name;
    private String depart;
    private double salary;
    private double bonus;
    private boolean resident;

    public Employee()
    {
    empID = 0;
    name = null;
    depart = null;
    salary = 0;
    bonus = 0;
    resident = false;

    }
    public Employee(int X,String Y)
    {
        empID = X;
        name = Y;
    }
    public Employee(int X, String Y, boolean Z)
    {
        /* empID = X;
        name = Y; */
        this(X, Y);
        resident = Z;
    }
    public Employee(int X, String Y, String Z, double H, double M, boolean N)
    {
        this(X, Y, N);
        //empID = X;
        //name = Y;
        //depart = Z;
        //salary = H;
        //bonus = M;
        //resident = N;
        this.setDepart(Z);
        this.setSalaryAndBonus(H, M);
    }

    public void setSalary(double X)
    {
        salary = X;
    }
    public void setSalaryAndBonus(double X, double Y)
    {
        salary = X;
        bonus = Y;
    }
    public void setDepart(String X)
    {
        depart = X;
    }
    public void setEmpID(int X)
    {
        empID = X;
    }
    public void printEmpData()
    {
        System.out.println("the Employee ID is: " + "\n" + empID);
        System.out.println("the Employee Name is: "+ "\n" + name);
        System.out.println("the Employee Depart is: "+ "\n" + depart);
        System.out.println("the Employee Salary is: "+ "\n" + salary);
        System.out.println("the Employee Bonus is: "+ "\n" + bonus);
        System.out.println("the Employee Resident is: "+ "\n" + resident);
        /* System.out.println("the Employee ID is: "+ "\n" + );
        System.out.println("the Employee ID is: "+ "\n" + );
        System.out.println("the Employee ID is: "+ "\n" + );
        System.out.println("the Employee ID is: "+ "\n" + ); */
    }
}
