import org.testng.annotations.Test;

public class TestSample
{
    @Test
    public void testAlphaOccurrence()
    {
        String s = "abcabcddcaddaaa";

        for (int i = 0; i < s.length(); i++)
        {
            int count = 0;
            char ch[] = s.toCharArray();
            for (int j = 0; j < ch.length; j++)
            {
                if (ch[j] == ch[i])
                {
                    if (j < i)
                    {
                        break;
                    }
                    count++;
                }
            }
            if (count > 0)
            {
                System.out.print(ch[i] + "" + count);
            }
        }
        System.out.println();
    }

    @Test
    public void testBubbleSort()
    {
        int a[] = {4, 2, 5, 1, 6, 8, 7, 9, 3};

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length - 1; j++)
            {
                if (a[j] < a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    @Test
    public static void printAlphabets()
    {
        String input = "a3b2c1z5";
        String output = "";

        for (int i = 0; i < input.length(); i = i + 2)
        {
            char ch = input.charAt(i);
            // Assuming single digit count (0-9), convert char to int
            int count = input.charAt(i + 1) - '0';
            for (int j = 0; j < count; j++)
            {
                output = output + ch;
            }
        }
        System.out.println(output);
    }
}