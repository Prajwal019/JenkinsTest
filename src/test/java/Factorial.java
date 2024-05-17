import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int fact = s.nextInt();
        int prod = 1;
        while (fact > 0)
        {
            prod = prod * fact;
            fact--;
        }
        System.out.println("Result: "+prod);
    }
}
