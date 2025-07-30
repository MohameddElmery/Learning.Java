package all;

public abstract class Animal
{
    String name;
    float age;

    public abstract void sound();


    public final void setName(String X)
    {
        name = X;
    }

    public final String getName()
    {
        return name;
    }

    public final void setAge(float X)
    {
        age = X;
    }

    public final float getAge()
    {
        return age;
    }
}
