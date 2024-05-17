import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Practice5
{
    //    WebDriver driver=new ChromeDriver();
    @Test
    public void wordOccurrence()
    {
        String word = "prajwal";
        System.out.println(word.length());
        for (int i = 0; i < word.length(); i++)
        {
            int count = 0;
            char ch[] = word.toCharArray();
            for (int j = 0; j < word.length(); j++)
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
            if (count > 1)
            {
                System.out.println(ch[i] + " : " + count);
            }
        }
    }

    @Test
    public void testStringArray()
    {
        String[] city = {"mumbai", "banglore", "chennai"};
        String[] cityShort = new String[city.length];
        for (int i = 0; i < city.length; i++)
        {
            cityShort[i] = city[i].substring(0, 3);
        }
        System.out.print("{");
        for (int j = 0; j < cityShort.length; j++)
        {

            System.out.print(cityShort[j]);
            if (cityShort.length - 1 > j)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    @Test
    public void toInterchangeCases()
    {
        String word = "APpLE";
        String temp = "";
        char ch[] = word.toCharArray();
        for (int i = 0; i < ch.length; i++)
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
    public void testSecondMax()
    {
        int[] a = {2, 5, 6, 1, 8, 0, 5, 9};
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
        System.out.println(a[1]);
    }

    @Test
    public void testOccu()
    {
        String word = "java";
        char ch[] = word.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            int count = 0;
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
                System.out.println(ch[i] + " : " + count);
            }

        }
    }

    @Test
    public void places()
    {
        String[] city = {"mumbai", "banglore", "chennai"};
        String[] cityShort = new String[city.length];

        for (int i = 0; i < city.length; i++)
        {
            cityShort[i] = city[i].substring(0, 3);
        }
        System.out.print("{");
        for (int j = 0; j < cityShort.length; j++)
        {
            System.out.print(cityShort[j]);
            if (cityShort.length - 1 > j)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");

        System.out.println();
    }

    @Test
    public void vowelInName()
    {
        String name = "classmate";
        char[] ch = name.toLowerCase().toCharArray();
        String s = "";
        for (int i = 0; i < ch.length; i++)
        {
            int count = 0;
            for (int j = 0; j < ch.length; j++)
            {
                if (ch[i] == ch[j])
                {
                    if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                    {
                        if (j < i)
                        {
                            break;
                        }
                        count++;
                        s = s + ch[i];
                    }
                }
            }
            if (count >= 1)
            {
                System.out.println(ch[i] + " : " + count);
            }
        }
        System.out.println(s);

//        WebElement dropdown = driver.findElement(By.id("singleSelectDropdown"));
//        boolean isSingleSelect = !dropdown.getAttribute("multiple").equals("true");

    }

    @Test
    public void patternProg()
    {
        int n = 4;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i >= j)
                {
                    System.out.print("*  ");
                } else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    @Test
    public void StringSwapExample()
    {
        String str1 = "Hello";
        String str2 = "Wo";

        System.out.println("Before swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping without using a third variable
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }

    @Test
    public void balancedString()
    {
        String s = "{}{[({()})]}";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (list.size() != 0 && ((s.charAt(i) == '}' && list.get(list.size() - 1) == '{')
                    || (s.charAt(i) == ']' && list.get(list.size() - 1) == '[')
                    || (s.charAt(i) == ')' && list.get(list.size() - 1) == '(')))
            {
                list.remove(list.size() - 1);
            } else
            {
                list.add(s.charAt(i));
            }
        }
        if (list.size() == 0)
        {
            System.out.println("Balanced");
        } else
        {
            System.out.println("Not balanced");
        }
    }

    @Test
    public void testWithoutSemi()
    {
        for (int i = 0; i < 5; System.out.println("Hello"))
        {
            i++;
        }
    }

    @Test
    public void testStringProg()
    {
        String s = "Its Simple";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
    }


    @Test
    public void testStringProg1()
    {
        String s = "Its Simple";
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
        {
//            System.out.println(ch[i]);
            if (Character.isUpperCase(ch[i]))
            {
                System.out.println(ch[i]);
            }
        }
    }

    @Test
    public void reverseStringWithout3rdVariable()
    {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Swap strings without using a third variable
        str1 = str1 + str2;
        System.out.println("*************************");
        System.out.println(str1);
        str2 = str1.substring(0, str1.length() - str2.length());
        System.out.println(str2);
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }

    @Test
    public void testLaunchingBrowser() throws IOException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cartoonnetworkindia.com/");
        TakesScreenshot t = (TakesScreenshot) driver;
        File src = t.getScreenshotAs(OutputType.FILE);
        File dest = new File("./ScreenShot/ss.png");
        FileUtils.copyFile(src, dest);
        driver.close();
    }

    @Test
    public void testScreenShot() throws IOException
    {
        int count = 0;
        String res = null;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cartoonnetworkindia.com/");
        TakesScreenshot t = (TakesScreenshot) driver;
        File src = t.getScreenshotAs(OutputType.FILE);
        res = "ss" + ++count;
        System.out.println(res);
        File dest = new File("./ScreenShot/" + res + ".png");
        FileUtils.copyFile(src, dest);
        driver.close();
    }

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
        String input = "a3b2c1";
        String output = "";

        for (int i = 0; i < input.length(); i = i + 2)
        {
            char ch = input.charAt(i);

            // Get the count (the next character in the string)
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

