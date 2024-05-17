package abstractionUsingClass;

public class MyShapes
{
    public static void main(String[] args)
    {
        Circle circle=new Circle("Green",2);
        System.out.println(circle.info());

        Square square=new Square("Cyan",5);
        System.out.println(square.info());
    }
}
