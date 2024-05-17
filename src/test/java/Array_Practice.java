
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice
{
    @Test
    public void createArray1()
    {
        int [] a={1,2,3,4,5};
        System.out.println(a);
        System.out.println("size: "+a.length);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(a[4]);
    }

    @Test
    public void createArray2()
    {
        int [] a= new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        System.out.println(a);
        System.out.println(a[4]);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    @Test
    public void createArray3()
    {
        int [] a= new int[5];
        int b=1;
        for (int i=0;i<a.length;i++)
        {
            a[i]=b;
            b++;
        }
        for (int j=0;j<a.length;j++)
        {
            System.out.println(a[j]);
        }
    }

    @Test
    public void arrayFromUser()
    {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        System.out.println("Enter the value of array of size: " + size);
        int[] a = new int[size];

        for (int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(int j=0;j<a.length;j++)
        {
            System.out.println("Entered array elements are: "+ a[j]);
        }
    }
    @Test
    public void sumArray()
    {
        int [] a= new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        System.out.println(a);
        System.out.println(a[4]);
        int sum=0;
        System.out.println("The array elements are: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for (int j=0;j<a.length;j++)
        {
            sum=sum+a[j];
        }
        System.out.println("The array elements are:"+sum);
    }
    @Test
    public void averageOfArray()
    {
        int [] a= new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        System.out.println(a);
        System.out.println(a[4]);
        int sum=0;
        System.out.println("The array elements are: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for (int j=0;j<a.length;j++)
        {
            sum=sum+a[j];
        }
        System.out.println("The average of array elements is:"+sum/a.length);
    }

    @Test
    public void printOddIndexedArray()
    {
        int [] a= new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;
        System.out.println("The array elements are: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for (int j=0;j<a.length;j++)
        {
            if(j%2!=0)
            {
                System.out.println(j+": "+a[j]);
            }
        }
    }

    @Test
    public void printEvenIndexedArray()
    {
        int [] a= new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;
        System.out.println("The array elements are: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for (int j=0;j<a.length;j++)
        {
            if(j%2==0)
            {
                System.out.println(j+": "+a[j]);
            }
        }
    }
    @Test
    public void printSumOfEvenIndexedArray()
    {
        int [] a= new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;
        int sum=0;
        System.out.println("The array elements are: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for (int j=0;j<a.length;j++)
        {
            if(j%2==0)
            {
                System.out.println(j+": "+a[j]);
                sum=sum+a[j];
            }
        }
        System.out.println("Sum of even indexed array:"+ sum);
    }

    @Test
    public void printSumOfOddIndexedArray()
    {
        int [] a= new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;
        int sum=0;
        System.out.println("The array elements are: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for (int j=0;j<a.length;j++)
        {
            if(j%2!=0)
            {
                System.out.println(j+": "+a[j]);
                sum=sum+a[j];
            }
        }
        System.out.println("Sum of odd indexed array:"+ sum);
    }

    @Test
    public void anagram()
    {
        String s1 = "Spot";
        String s2 = "PotS";
        if (s1.length()!= s2.length())
        {
            System.out.println("The given Strings are not an anagram");
        }
        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2))
        {
            System.out.println("Given Strings are anagram");
        } else
        {
            System.out.println("Given Strings are not an anagram");
        }
    }

    @Test
    public void wordOccurrence()
    {
        testWordOccurrence("Support");
    }

    public void testWordOccurrence(String s)
    {
        System.out.println(s.length());
        for (int i=0;i<s.length();i++)
        {
            int count=0;
            char ch []=s.toLowerCase().toCharArray();
            for (int j=0;j<s.length();j++)
            {
                if(ch[j]==ch[i])
                {
                    if (j<i)
                    {
                        break;
                    }
                    count++;
                }
            }
            if (count>0)
            {
                System.out.println(ch[i] + ": " + count);
            }
        }
    }
}
