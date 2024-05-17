import java.util.Arrays;
import java.util.Scanner;

public class TestAnagram
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter the first word");
        String first=s.next();
        System.out.println("Please Enter the second word");
        String second=s.next();
        int count =0;

        char ch1[]=first.toLowerCase().toCharArray();
        char ch2[]=second.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(first.length()!=second.length())
        {
            System.out.println("The given words are not Anagram");
        }
        else
        {
            for(int i=0;i<ch1.length;i++)
            {
                if(ch1[i]==ch2[i])
                {
                    count++;
                }
            }
            if(count==first.length())
            {
                System.out.println("The given words are Anagram");

            }
            else
            {
                System.out.println("The given words are not Anagram");
            }
        }

    }
}
