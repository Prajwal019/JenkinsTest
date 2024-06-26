package abstractionUsingInterface;

public class Circle implements Shape
{
    String color;
    double radius;

    public Circle(String color,double radius)
    {
        this.color=color;
        this.radius=radius;
    }
    @Override
    public String color()
    {
        return color;
    }

    @Override
    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String info()
    {
        return "Hi I'm "+color()+" circle with total area "+area();
    }
}
