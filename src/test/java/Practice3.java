import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;

public class Practice3
{
    @Test
    public void primeNumber()
    {
        Boolean result = isPrime(10);
        if (result)
        {
            System.out.println("The num is Prime");
        } else
        {
            System.out.println("The num is not a Prime");
        }
    }

    public boolean isPrime(int num)
    {
        int i = 2;
        int count = 0;
        while (i <= num / 2)
        {
            if (num % i == 0)
            {
                count++;
                break;
            }
            i++;
        }
        if (count == 0)
        {
            return true;
        } else
        {
            return false;
        }
    }

    @Test
    public void neonNumber()
    {
        Boolean result = isNeonNumber(456);
        if (result)
        {
            System.out.println("Given number is Neon number");
        } else
        {
            System.out.println("Given number is not Neon number");
        }
    }

    public boolean isNeonNumber(int num)
    {
        int sum = 0;
        int prod = 1;
        while (num > 0)
        {
            int rem = num % 10;
            sum = sum + rem;
            prod = prod * rem;
            num = num / 10;
        }
        if (sum == prod)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public void anagram()
    {
        Boolean result = isAnagram("Spot", "Pots");
    }

    public Boolean isAnagram(String S1, String S2)
    {
        char ch1[] = S1.toLowerCase().toCharArray();
        char ch2[] = S2.toLowerCase().toCharArray();
        if (S1.length() != S2.length())
        {
            System.out.println("Not an Anagram");
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2))
        {
            System.out.println("Is an Anagram");
            return true;
        } else
        {
            System.out.println("Not an Anagram");
            return false;
        }
    }

//   @Test
//    public void readingPropertyFile() throws IOException
//   {
//       FileInputStream fis=new FileInputStream("./data/data.properties");
//       Properties p=new Properties();
//       p.load(fis);
//       String URL=p.getProperty("url");
//   }

//   @Test
//    public void excelReading() throws Exception
//   {
//       FileInputStream fis=new FileInputStream("./data/data.xlsx");
//       Workbook wb=new WorkbookFactory.create(fis);
//       wb.getSheetName().getRow.getStringCellValue();
//   }

    @Test
    public void Prime()
    {
        Boolean result = isPrimeNum(22);
        if (result)
        {
            System.out.println("is a prime number");
        } else
        {
            System.out.println("is not a prime number");
        }
    }

    public Boolean isPrimeNum(int num)
    {
        int i = 2;
        int count = 0;
        while (i <= num / 2)
        {
            if (num % i == 0)
            {
                count++;
                break;
            }
            i++;
        }
        if (count == 0)
        {
            return true;
        } else
        {
            return false;
        }
    }

    @Test
    public void Anagram()
    {
        Boolean result = isAnagramTest("listen", "Silent");
        if (result)
        {
            System.out.println("The Given words are Anagram");
        } else
        {
            System.out.println("The Given words are not Anagram");
        }
    }

    public Boolean isAnagramTest(String s1, String s2)
    {
        char ch1[] = s1.toLowerCase().toCharArray();
        char ch2[] = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (s1.length() != s2.length())
        {
            System.out.println("*************");
            return false;
        }
        if (Arrays.equals(ch1, ch2))
        {
            return true;
        } else
        {
            return false;
        }
    }

    @Test
    public void sentenceOccurrence()
    {
        String str = "Java is a java programing language java";

        String s1[] = str.toLowerCase().split(" ");
        boolean b[] = new boolean[s1.length];
        for (int i = 0; i < s1.length; i++)
        {
            if (!b[i])
            {
                int count = 0;
                for (int j = 0; j < s1.length; j++)
                {
                    if (s1[i].equals(s1[j]))
                    {
                        b[j] = true;
                        count++;
                    }
                }
                if (count > 0)
                {
                    System.out.println(s1[i] + " :" + count);
                }
            }
        }
    }

    @Test
    public void reverseSecondHalf()
    {
        String str = "Prajwal";
        int size = str.length();
        String temp = "";
        char[] ch = str.toCharArray();
        int si = ch.length;
        for (int i = 0; i < si; i++)
        {
            temp = temp + ch[i];
            System.out.println("%%%%%%%%" + temp);
            if (i >= si / 2)
            {
                for (int j = si - 1; j >= si / 2; j--)//7>0
                {
                    temp = temp + ch[j]; //praj
                }
            }
        }
        System.out.println(temp);
    }

    @Test
    public void removeDuplicates()
    {
        String[] str = {"1,2,14,15,4", "8,9,1,2,4"};
        ArrayList ls = new ArrayList();
        for (int i = 0; i < str.length; i++)
        {
            char ch[] = str[i].replace(",", "").toCharArray();
            for (int j = 0; j < ch.length; j++)
            {
                ls.add(ch[j]);
            }
        }
        LinkedHashSet<Object> lh = new LinkedHashSet(ls);
        for (Object c : lh)
        {
            int count = 0;
            for (int j = 0; j < ls.size(); j++)
            {
                if (c.equals(ls.get(j)))
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
    public void reverseSecondHalfOfString()
    {
        String str = "Wildcraft";
        char[] ch = str.toCharArray();
        String str1 = "";
        int j = ch.length - 1;
        for (int i = 0; i < ch.length; i++)
        {
            if (i < ch.length / 2)
            {
                str1 = str1 + ch[i];
            } else
            {
                str1 = str1 + ch[j];
                j--;
            }
        }
        System.out.println(str1);
    }

    @Test
    public void reverseSecondHalf2()
    {
        String str = "Wildcraft";
        char ch[] = str.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        int j = ch.length - 1;
        for (int i = 0; i < ch.length; i++)
        {
            if (i < ch.length / 2)
            {
                sb.append(ch[i]);
            } else
            {
                sb.append(ch[j]);
                j--;
            }
        }
        System.out.println(sb);
    }

    @Test
    public void testFluentWait()
    {
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(""));

        WebElement element = fluentWait.until(new Function<WebDriver, WebElement>()
                                              {
                                                  @Override
                                                  public WebElement apply(WebDriver webDriver)
                                                  {
                                                      return driver.findElement(By.id(""));
                                                  }
                                              }

        );
    }

    @Test
    public void alphabetOccurrence()
    {
        String str = "abcabcddcadd";
        char ch[] = str.toCharArray();
        ArrayList<Character> ls = new ArrayList();
        LinkedHashSet<Character> set = new LinkedHashSet();
        for (int i = 0; i < ch.length; i++)
        {
            ls.add(ch[i]);
            set.add(ch[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set)
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
    public void reve()
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
    public void testArray()
    {
        int[] a = {2, 5, 8, 12, 13};
    }

    @Test
    public void brokenLinks()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("");
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        int size = allLinks.size();
        ArrayList list = new ArrayList();
        for (int i = 0; i < size; i++)
        {
            URL url = null;
            int statusCode = 0;
            String eachLink = allLinks.get(i).getAttribute("href");
            try
            {
                url = new URL(eachLink);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                if (statusCode >= 400)
                {
                    list.add(eachLink + " : " + statusCode);

                }
            } catch (Exception e)
            {

            }

        }
        System.out.println(list);

    }

    @Test
    public void alphaOccu()
    {
        String s = "abcabcddcaddaaa";
        char ch[] = s.toCharArray();
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
    public void checkForPrime()
    {
        int num = 5;
        int i = 2;
        int count = 0;
        while (i <= 2)
        {
            if (num % i == 0)
            {
                count++;
                break;
            }
            i++;
        }
        if (count == 0)
        {
            System.out.println("is Prime");
        } else
        {
            System.out.println("Not Prime");
        }
    }

    @Test
    public void wordOccurrence()
    {
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        for (int i = 0; i < word.length(); i++)
        {
            char ch[] = word.toCharArray();
            int count = 0;
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
            if (count > 0)
            {
                System.out.println(ch[i] + " : " + count);
            }
        }
    }

    @Test
    public void testNumberOcc()
    {
        int[] s = {1, 2, 3, 1, 2, 3, 4, 5, 5, 4, 4, 9, 0};
        for (int i = 0; i < s.length; i++)
        {
            int count = 0;

            for (int j = 0; j < s.length; j++)
            {
                if (s[i] == s[j])
                {
                    if (j < i)
                    {
                        break;
                    }
                    count++;
                }
            }
            if (count >= 1)
            {
                System.out.println(s[i] + " : " + count);
            }
        }
    }

    @Test
    public void reverseArray()
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 7;
        int endIndex = array.length - 1;
        for (int i = 0; i < (endIndex - startIndex + 1) / 2; i++)
        {
            int temp = array[startIndex + i];
            array[startIndex + i] = array[endIndex - i];
            array[endIndex - i] = temp;
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        }
    }

    @Test
    public void revAr()
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 5;
        int lastIndex = array.length - 1;
        for (int i = 0; i < (lastIndex - startIndex + 1) / 2; i++)
        {
            int temp = array[startIndex + i];
            array[startIndex + i] = array[lastIndex - i];
            array[lastIndex - i] = temp;
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    @Test
    public void testForBrokenLinks()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        ArrayList ls = new ArrayList();
        for (int i = 0; i < allLinks.size(); i++)
        {
            URL url = null;
            int statusCode = 0;
            String eachLink = allLinks.get(i).getAttribute("href");
            try
            {
                url = new URL(eachLink);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();


            } catch (Exception e)
            {

            }
        }

    }

    @Test
    public void reverseArrayFromRequiredIndex()
    {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 2;
        int end = a.length - 1;
        System.out.println("Before reversing");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        while (start < end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println("After reversing");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

    }

    @Test
    public void stringSwap()
    {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    @Test
    public void testConsecutiveAlpha()
    {
        String s = "a3b2c1P4";
        char ch[] = s.toCharArray();
        String output = "";
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
}