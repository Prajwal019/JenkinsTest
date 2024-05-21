import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Practice2
{
    @Test
    public void stringLowerToUpperCaseAndViceVersa()
    {
        String a = "aPplE";
        String b = "";
        char[] ch = a.toCharArray();
        for (int i = 0; i < a.length(); i++)
        {
            if (ch[i] >= 65 && ch[i] <= 90)
            {
                ch[i] = (char) (ch[i] + 32);
            } else
            {
                ch[i] = (char) (ch[i] - 32);
            }
            b = b + ch[i];
        }
        System.out.println(b);
    }

    @Test
    public void stringImmutability()
    {
        String a = "Hello";
        String b = "World";
        System.out.println(a);
        System.out.println(b);
        String c = a.concat(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void arithmeticExceptionProgram()
    {
        try
        {
            int a = 10;
            int b = 0;
            int div = a / b;
            System.out.println(div);
        } catch (Exception e)
        {
            String msg = e.getMessage();
            System.out.println(msg);
            e.printStackTrace();
        }

    }

    @Test
    public void countDigitsInANumber()
    {
        int a = 35678987;
        int count = 0;
        while (a > 0)
        {
            a = a / 10;
            count++;
        }
        System.out.println(count);
    }

    @Test
    public void anagram()
    {
        String s1 = "they see";
        String s2 = "the eyes";
        if (s1.length() == s2.length())
        {
            char ch1[] = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch2);
            Arrays.sort(ch1);
            if (Arrays.equals(ch1, ch2))
            {
                System.out.println("The given words are anagram");
            } else
            {
                System.out.println("Not an anagram");
            }
        } else
        {
            System.out.println("Not an anagram");
        }
    }

    @Test
    public void wordOccurrence()
    {
        testWordOccurrence("Manufactured");
    }

    public void testWordOccurrence(String s)
    {
        System.out.println("Length: " + s.length());
        for (int i = 0; i < s.length(); i++)
        {
            int count = 0;
            char ch[] = s.toLowerCase().toCharArray();
            for (int j = 0; j < s.length(); j++)
            {
                if (ch[i] == ch[j])
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
                System.out.println(ch[i] + ": " + count);
            }
        }
    }

    @Test
    public void sentenceOccurrence()
    {
        testSentenceOccurrence("Every Ambition Needs Preparation");
    }

    public void testSentenceOccurrence(String s)
    {
        String s1[] = s.split(" ");
        String temp = "";
        for (int i = s1.length - 1; i >= 0; i--)
        {
            temp = temp + s1[i] + " ";
        }
        System.out.println(temp);
    }

    @Test
    public void sentenceOccurrences()
    {
        String str = "Java is a java programing a java language programing java programing";

        String s1[] = str.toLowerCase().split(" ");
        for (int i = 0; i < s1.length; i++)
        {
            int count = 0;
            for (int j = 0; j < s1.length; j++)
            {
                if (s1[i].equals(s1[j]))
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
                System.out.println(s1[i] + ": " + count);
            }
        }
    }

    @Test
    public void UpperAndLowercase()
    {
        String str = "uNiverSiTY";
        String temp = "";
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
        {
            if (ch[i] >= 65 && ch[i] <= 90)
            {
                ch[i] = (char) (ch[i] + 32);
            } else
            {
                ch[i] = (char) (ch[i] - 32);
            }
            temp = temp + ch[i];
        }
        System.out.println(temp);
    }

    @Test
    public void alphabetOccurrence()
    {
        String str = "abcabcddcadd";
        char ch[] = str.toCharArray();
        ArrayList<Character> ls = new ArrayList<>();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < ch.length; i++)
        {
            ls.add(ch[i]);
            hs.add(ch[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (Character q : hs)
        {
            int count = 0;
            for (int i = 0; i < ls.size(); i++)
            {
                if (q == ls.get(i))
                {
                    count++;
                }
            }
            sb.append(q).append(count);
        }
        System.out.println(sb);
    }

    @Test
    public void reverseString()
    {
        String str = "I Am Not String";
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(" ", ""));
        sb.reverse();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] == ' ')
            {
                sb.insert(i, ' ');
            }
        }
        System.out.println(sb);
    }

    @Test
    public void testP()
    {
        String name = "Paani %s %s %s";
        String name2 = String.format(name, "Pavani", "Kadappa", "Sniper");
        System.out.println(name2);
    }

    @Test
    public void fibnocci()
    {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++)
        {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }

    @Test
    public void fib()
    {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= 10; i++)
        {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }

    @Test
    public void testWordOccurrence1()
    {
        String s = "aaaaabbbbbbbbbccccccccccddddd";
        char ch[] = s.toCharArray();
        ArrayList<Character> ls = new ArrayList<>();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < ch.length; i++)
        {
            ls.add(ch[i]);
            hs.add(ch[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : hs)
        {
            int count = 0;
            for (int i = 0; i < ch.length; i++)
            {
                if (c == ls.get(i))
                {
                    count++;
                }
            }
            sb.append(c).append(count);
        }
        System.out.println(sb);
    }

    @Test
    public void testSwap2Arrays()
    {
        String s1 = "Believe";
        String s2 = "Halfway";

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void testReverseArrayFromRequiredIndex()
    {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 6;
        int end = a.length - 1;
        while (start < end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        for (int i = a.length - 1; i >= 0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }

    @Test
    public void testDate()
    {
        String s = "18-12-2024";
        // Parse the input string to local date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(s, formatter);

        // Format the Localdate to desired output format
        String output = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(output);
    }

    @Test
    public void toPrintLocalSystemDate()
    {
        LocalDate currentDate = LocalDate.now();
        String localCurrentDate = currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("The current date of the system is : " + localCurrentDate);

        String newFormat = currentDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(newFormat);
    }

    @Test
    public void toPrintFormattedDate()
    {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        String formattedDate = dateFormat.format(currentDate);
        System.out.println("CurrentDate: " + formattedDate);
    }

    @Test
    public void testAdvanceDate()
    {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(20);
        String presentDay = currentDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        String futureDay = futureDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(presentDay);
        System.out.println(futureDay);
    }

    @Test
    public void testReverseArrayFromReqIndex()
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 5; // Index to start printing from

        // Print the rotated array
        for (int i = index; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < index; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    @Test
    public void testReversingSentence()
    {
        String s = "We are Indians";
        String[] s1 = s.split(" ");
        String temp = "";
        for (int i = s1.length - 1; i >= 0; i--)
        {
            char ch[] = s1[i].toCharArray();
            for (int j = ch.length - 1; j > 0; j--)
            {
                temp = temp + ch[j];
                if (j == 0)
                {
                    temp = temp + " ";
                }
            }
        }
        System.out.println(temp);
    }

    @Test
    public void testList()
    {
        String[] s = {"India", "Morocco", "America", "Itally", "Aantigua", "Nepall", "Mallayssia"};
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < s.length; i++)
        {
            char ch[] = s[i].toLowerCase().toCharArray();

            for (int j = 0; j < ch.length - 1; j++)
            {
                if (ch[j] == ch[j + 1])
                {
                    ls.add(s[i] + "----------->" + ch[j]);
                }
            }
        }
        for (String country : ls)
        {
            System.out.println(country);
        }
    }

    @Test
    public void testPrintAlpha()
    {
        String s = "a3b4c5";
        String output = "";
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i = i + 2)
        {
            int count = ch[i + 1] - '0';
            for (int j = 0; j < count; j++)
            {
                output = output + ch[i];
            }
        }
        System.out.println(output);
    }

    @Test
    public void sumOfNumbersInGivenString()
    {
        String s="fg2jj3kl5khj6";
        char ch[]=s.toCharArray();
        int sum=0;
        for (int i=0;i<ch.length;i++)
        {
            if (ch[i]>='0'&& ch[i]<='9')
            {
                System.out.println(ch[i]);
                sum=sum+ch[i]-48;
            }
        }
        System.out.println(sum);
    }
}
