package abstractionUsingClass;

public class Square extends Shape
{
    long side;
    public Square(String color,long side)
    {
        super(color);
        this.side=side;
    }

    @Override
    double area()
    {
        return Math.multiplyExact(side,4);
    }

    @Override
    String info()
    {
        return "Hi I'm "+super.color+" square with total area "+area();
    }
}
