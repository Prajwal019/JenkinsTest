package abstractionUsingInterface;

public class Square implements Shape
{
    String color;
    int sides;

    public Square(String color,int sides)
    {
        this.color=color;
        this.sides=sides;
    }
    @Override
    public String color()
    {
        this.color=color;
        return color;
    }

    @Override
    public double area()
    {
        return Math.multiplyExact(sides,4);
    }

    @Override
    public String info()
    {
        return "Hi I'm "+color()+" circle with total area "+area();
    }
}
