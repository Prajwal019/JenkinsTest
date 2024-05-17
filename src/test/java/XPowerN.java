import java.util.Scanner;

public class XPowerN
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of X");
        int x=s.nextInt();
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        int prod=1;
        while(n>0)
        {
            prod=prod*x;
            n--;
        }
        System.out.println("Result: "+prod);
    }
}
