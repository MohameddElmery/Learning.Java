package all;

enum Age
{
    TWENTY, THIRTY;
}

public class RegisterForm
{
    private String studentName;
    private Gender studentGender;
    private Course courseName;
    private Semester courseSemester;
    private Age ageNumber;

    RegisterForm()
    {
        studentName = "Elmery";
        System.out.println("=================");
        System.out.println(studentName);


        studentGender = Gender.MALE;
        System.out.println("=================");
        System.out.println(studentGender);


        courseName = Course.ELECTRICAL;
        System.out.println("=================");
        System.out.println(courseName);

        courseSemester = Semester.SECOND;
        System.out.println("=================");
        System.out.println(courseSemester);


        ageNumber = Age.TWENTY;
        System.out.println("=================");
        System.out.println(ageNumber);
        System.out.println("=================");



    }









}
