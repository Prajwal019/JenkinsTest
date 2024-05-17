import org.testng.annotations.Test;

import java.util.*;

public class Practice1
{
    @Test
    public void listExample()
    {
        List ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        System.out.println("*************PrintUsingReference*******************");
        System.out.println(ls);
        System.out.println("Size: " + ls.size());
        System.out.println("*************PrintUsingForLoop*******************");
        for (int i = 0; i < ls.size(); i++)
        {
            System.out.println(ls.get(i));
        }
        System.out.println("*************PrintUsingForEachLoop*******************");
        for (Object o : ls)
        {
            System.out.println(o);
        }
        System.out.println("**************UsingIterator***************");
        Iterator i = ls.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("**************%%%%%%%%%%%%%%***************");
        ListIterator j = ls.listIterator();
        while (j.hasNext())
        {
            System.out.println(j.next());
        }
        System.out.println("**************#######################***************");
        ListIterator k = ls.listIterator(ls.size());
        while (j.hasPrevious())
        {
            System.out.println(j.previous());
        }
    }

    @Test
    public void arrayList()
    {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        System.out.println("**********************************");
        for (int i = 0; i < al.size(); i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("***************@@@@@@@@@@***************");
        for (Object o : al)
        {
            System.out.println(o);
        }
        System.out.println("***************!!!!!!!!!!!!!!!***************");
        Iterator i = al.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("***************^^^^^^^^^^^^^^^^^^^^^^^^***************");
        ListIterator li = al.listIterator();
        while (li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println("***************&&&&&&&&&&&&&&&&&&&&&&***************");
        ListIterator lp = al.listIterator(al.size());
        while (lp.hasPrevious())
        {
            System.out.println(lp.previous());
        }
    }

    @Test
    public void LinkedList()
    {
        LinkedList li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        System.out.println(li);
        System.out.println("*************************************");
        for (int i = 0; i < li.size(); i++)
        {
            System.out.println(li.get(i));
        }
        System.out.println("***************@@@@@@@@@@***************");
        for (Object o : li)
        {
            System.out.println(o);
        }
        System.out.println("***************!!!!!!!!!!!!!!!***************");
        Iterator i = li.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("***************^^^^^^^^^^^^^^^^^^^^^^^^***************");
        ListIterator l = li.listIterator();
        while (l.hasNext())
        {
            System.out.println(l.next());
        }
        System.out.println("***************&&&&&&&&&&&&&&&&&&&&&&***************");
        ListIterator lp = li.listIterator(li.size());
        while (lp.hasPrevious())
        {
            System.out.println(lp.previous());
        }
    }

    @Test
    public void ascendingArray()
    {
        int a[] = {2, 6, 4, 5, 1, 3};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    @Test
    public void descendingArray()
    {
        int a[] = {2, 6, 4, 5, 1, 3};
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 0; i--)
        {
            System.out.println(a[i]);
        }
    }

    @Test
    public void reverseString()
    {
        String s = "Java";
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            char[] ch = s.toCharArray();
            a = a + ch[i];
        }
        System.out.println(a);
    }

    @Test
    public void reverseSentence()
    {
        String s = "I Love Java";
        String[] a = s.split(" ");
        String temp = "";
        for (int i = a.length - 1; i >= 0; i--)
        {
            temp = temp + (a[i] + " ");
        }
        System.out.println(temp);
    }

    @Test
    public void wordOccurance()
    {
        String s = "testyantra";
        for (int i = 0; i < s.length(); i++)
        {
            int count = 0;
            char ch[] = s.toCharArray();
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
                System.out.println(ch[i] + ":" + count);
            }
        }
    }

    @Test
    public void anagram()
    {
        if (testAnagram("Silent", "Listen"))
        {
            System.out.println("Given Strings are anagram");
        } else
        {
            System.out.println("Given Strings are not anagram");
        }
    }

    public boolean testAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }
        char ch1[] = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    @Test
    public void numberPalindrome()
    {
        testNumberPalindrome(123421);
    }

    public void testNumberPalindrome(int num)
    {
        int num2 = num;
        int rev = 0;
        while (num > 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == num2)
        {
            System.out.println("The given number is Palindrome: " + rev);
        } else
        {
            System.out.println("The given number is not Palindrome: " + rev);
        }
    }

    @Test
    public void stringPalindrome()
    {
        boolean result = testStringPalindrome("Gadag");
        if (result)
        {
            System.out.println("The given String is palindrome");
        } else
        {
            System.out.println("The given String is not a palindrome");
        }
    }

    public boolean testStringPalindrome(String s)
    {
        String s1 = s;
        String temp = "";
        char ch[] = s.toLowerCase().toCharArray();
        for (int i = s.length() - 1; i >= 0; i--)
        {
            temp = temp + ch[i];
        }
        if (temp.equalsIgnoreCase(s1))
        {
            return true;
        } else
        {
            return false;
        }
    }

    @Test
    public void wordOccurrance()
    {
        testWordOccurence("pneumonoultramicroscopicsilicovolcanoconiosis");
    }

    public void testWordOccurence(String s)
    {

        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++)
        {
            char[] ch = s.toCharArray();
            int count = 0;
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
    public void testOccurrenceAlphabet()
    {
        String s="abbbahhhhsssssddddddiiiiiiipppp";
        ArrayList<Character>ls=new ArrayList<>();
        LinkedHashSet<Character>hs=new LinkedHashSet<>();

        char ch[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            ls.add(ch[i]);
            hs.add(ch[i]);
        }
        for (Character e:hs)
        {
            int count=0;
            for (int i=0;i<ch.length;i++)
            {
                if (e.equals(ls.get(i)))
                {
                    count++;
                }
            }
           sb.append(e).append(count);
        }
        System.out.println(sb);
    }


    public  String testAnagramProg(String s1,String s2)
    {

        if (!(s1.length()==s2.length()))
        {
            return "The given Strings are not anagram";

        }

        char ch1[]=s1.toLowerCase().toCharArray();
        char ch2[]=s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s1=String.valueOf(ch1);
        s2=String.valueOf(ch2);

        if (s1.equals(s2))
        {
            return "Anagram";
        }
        else
        {
            return "Not an Anagram";
        }
    }
    @Test
    public void checkAnagram()
    {
       String output= testAnagramProg("Stip","Pots");
        System.out.println(output);
    }

    public void testWordOcc(String s)
    {
        char ch[]=s.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            int count=0;
            for (int j=0;j<ch.length;j++)
            {
                if (ch[i]==ch[j])
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
                System.out.print(ch[i]+""+count);
            }

        }
    }

    @Test
    public void inputForTestWordOcc()
    {
        testWordOcc("aaabbbbcccccddddddaa");
    }

    @Test
    public void testSwappingTwoString()
    {
        String str1 = "Sniper";
        String str2 = "World";

        System.out.println("Before Swapping");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("After Swapping");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

    }
}