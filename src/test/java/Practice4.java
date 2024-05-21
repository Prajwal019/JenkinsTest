import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Practice4
{
    @Test
    public static void ListExample()
    {
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        System.out.println("With the help reference");
        System.out.println(ls);
        System.out.println("With the help of for loop");
        for (int i = 0; i < ls.size(); i++)
        {
            System.out.println(ls.get(i));
        }
        System.out.println("With the help of advanced for loop");
        for (int i : ls)
        {
            System.out.println(i);
        }
        System.out.println("With the help of iterator");
        Iterator i = ls.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("With the help of List iterator");
        ListIterator j = ls.listIterator();
        while (j.hasNext())
        {
            System.out.println(j.next());
        }
        System.out.println("With the help of List iterator reverse order");
        ListIterator k = ls.listIterator(ls.size());
        while (k.hasPrevious())
        {
            System.out.println(k.previous());
        }
    }

    @Test
    public static void ArrayListExample()
    {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        System.out.println("With the help reference");
        System.out.println(ls);
        System.out.println("With the help of for loop");
        for (int i = 0; i < ls.size(); i++)
        {
            System.out.println(ls.get(i));
        }
        System.out.println("With the help of advanced for loop");
        for (int i : ls)
        {
            System.out.println(i);
        }
        System.out.println("With the help of iterator");
        Iterator i = ls.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("With the help of List iterator");
        ListIterator j = ls.listIterator();
        while (j.hasNext())
        {
            System.out.println(j.next());
        }
        System.out.println("With the help of List iterator reverse order");
        ListIterator k = ls.listIterator(ls.size());
        while (k.hasPrevious())
        {
            System.out.println(k.previous());
        }
    }

    @Test
    public static void LinkedList()
    {
        LinkedList<Integer> ls = new LinkedList();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        System.out.println("With the help reference");
        System.out.println(ls);
        System.out.println("With the help of for loop");
        for (int i = 0; i < ls.size(); i++)
        {
            System.out.println(ls.get(i));
        }
        System.out.println("With the help of advanced for loop");
        for (int i : ls)
        {
            System.out.println(i);
        }
        System.out.println("With the help of iterator");
        Iterator i = ls.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("With the help of List iterator");
        ListIterator j = ls.listIterator();
        while (j.hasNext())
        {
            System.out.println(j.next());
        }
        System.out.println("With the help of List iterator reverse order");
        ListIterator k = ls.listIterator(ls.size());
        while (k.hasPrevious())
        {
            System.out.println(k.previous());
        }
    }

    @Test
    public static void BubbleSort()
    {
        int a[] = {3, 4, 1, 2, 5, 7, 6, 8, 9};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    @Test
    public static void ReverseBubbleSort()
    {
        int a[] = {3, 4, 1, 2, 5, 7, 6, 8, 9};
        for (int i = 0; i < a.length - 1; i++)
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
        System.out.println("After Sorting: ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    @Test
    public static void anagram()
    {
        String s1 = "silent";
        String s2 = "listen";
        char[] str1 = s1.toLowerCase().toCharArray();
        char[] str2 = s2.toLowerCase().toCharArray();
        if (s1.length() != s2.length())
        {
            System.out.println("Not an anagram");

        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        if (Arrays.equals(str1, str2))
        {
            System.out.println("an anagram");
        } else
        {
            System.out.println("Not an anagram");
        }
    }

    @Test
    public void numberOccurrence()
    {
        int[] s = {1, 2, 3, 1, 2, 3, 4, 5};
        for (int i = 0; i < s.length; i++)
        {
            int count = 0;
            for (int j = 0; j < s.length; j++)
            {
                if (s[j] == s[i])
                {
                    if (i > j)
                    {
                        break;
                    }
                    count++;
                }
            }
            if (count > 0)
            {
                System.out.println(s[i] + ": " + count);
            }

        }
    }

    //new String[]{"1,2,14,15","8,9,1,2"} print only the duplicates

    @Test
    public void printDuplicates()

    {
        String[] str = {"1,2,14,15,4", "8,9,1,2,4"};
        ArrayList<Character> ls = new ArrayList<>();
        for (int i = 0; i < str.length; i++)
        {
            char[] ch = str[i].replace(",", "").toCharArray();
            for (int j = 0; j < ch.length; j++)
            {
                ls.add(ch[j]);
            }
        }

        LinkedHashSet<Character> set = new LinkedHashSet<>(ls);
        for (Character c : set)
        {
            int count = 0;
            for (int i = 0; i < ls.size(); i++)
            {
                if (c == ls.get(i))
                {
                    count++;
                }
            }
            if (count > 1)
            {
                System.out.println(c);
            }
        }
    }

    @Test
    public static void alphabetOccurrence()
    {
        String str = "abcabcddcadd";
        char[] ch = str.toCharArray();
        ArrayList<Character> ls = new ArrayList<>();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++)
        {
            ls.add(ch[i]);
            set.add(ch[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set)
        {
            int count = 0;
            for (int i = 0; i < ls.size(); i++)
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
    public static void rev()
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
                sb.insert(i, " ");
            }
        }
        System.out.println(sb);
    }

    @Test
    public void stringArray()
    {
        String[] str = {"Hi", "Hello", "Fun"};
        for (int i = 0; i < str.length; i++)
        {
            System.out.println(str[i]);
        }
    }

    @Test
    public void brokenLinks()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        int size = allLinks.size();
        ArrayList<String> links = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            URL url = null;
            int statusCode = 0;
            String eachLink = allLinks.get(i).getAttribute("href");
            try
            {
                url = new URL(eachLink);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                if (statusCode >= 400)
                {
                    links.add(eachLink + " : " + statusCode);
                }
            } catch (Exception e)
            {
                links.add(eachLink + " : " + statusCode);
            }
        }
        System.out.println(links);
    }

    @Test
    public void testReverseString()
    {
        String sent = "We Are Indians";
        String s[] = sent.split(" ");
        String output = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            char ch[] = s[i].toCharArray();
            for (int j = ch.length - 1; j >= 0; j--)
            {
                output = output + ch[j];
                if (j == 0)
                {
                    output = output + " ";
                }
            }
        }
        System.out.println(output);
    }

    @Test
    public void testMerging2Array()
    {
        int a[]={1,2,3,4};
        int b[]={5,6,7,8,9};
        int c[]=new int [a.length+b.length];
        int j=0;

        for (int i=0;i<c.length;i++)
        {
            if (i<a.length)
            {
                c[i]=a[i];
            }
            else
            {
                c[i]=b[j];
                j++;
            }
        }
        System.out.print("[");
        for (int i=0;i<c.length;i++)
        {
            if (i==c.length-1)
            {
                System.out.print(c[i]+"");
            }
            else
            {
                System.out.print(c[i]+",");
            }
        }
        System.out.print("]");
    }
}