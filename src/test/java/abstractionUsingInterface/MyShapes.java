package abstractionUsingInterface;

public class MyShapes
{
    public static void main(String[] args)
    {
        Circle circle=new Circle("Red",4);
        System.out.println(circle.info());

        Square square=new Square("Yellow",5);
        System.out.println(square.info());
    }
}