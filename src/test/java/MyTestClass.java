class MySuperClass
{
    String superClassString = "SuperClassStringVariable";

    public MySuperClass()
    {
        System.out.println("SuperClassNoParameterConstructor");
    }

    public MySuperClass(String superClassConstructor)
    {
        System.out.println(superClassConstructor);
    }

    public void superClassMethod()
    {
        System.out.println("SuperClassStringMethod");
    }

}

class MySubClass extends MySuperClass
{
    String subClassString = "SubClassStringVariable";

    public MySubClass()
    {
        System.out.println("SubClassConstructor");
    }

    public void subClassMethod()
    {
        System.out.println("SubClassStringMethod");
    }

}

public class MyTestClass
{
    public static void main(String[] args)
    {
        MySubClass mySubClass = new MySubClass();
        mySubClass.superClassMethod();
        System.out.println(mySubClass.superClassString);
        mySubClass.subClassMethod();
        System.out.println(mySubClass.subClassString);
    }
}