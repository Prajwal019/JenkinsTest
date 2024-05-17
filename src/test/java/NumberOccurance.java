import org.testng.annotations.Test;

import java.util.Scanner;

public class NumberOccurance
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number exceeding 6 digits");
        long num = s.nextLong();
        System.out.println("Enter the number you want to find occurrence");
        int value = s.nextInt();
        int count = 0;
        while (num > 0)
        {
            long rem = num % 10;
            if (rem == value)
            {
                count++;
            }
            num = num / 10;
        }
        System.out.println(value + ": " + count);
    }
}
