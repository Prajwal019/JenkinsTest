import org.testng.annotations.Test;

import java.util.Arrays;

public class Arrays_Practice2
{
    @Test
    public void merging2Array()
    {
        int [] a={1,2,3};
        int [] b={4,5,6};
        int c[]=new int[a.length+b.length];
        for (int i=0;i<a.length;i++)
        {
            c[i]=a[i];
            System.out.println(c[i]);
        }
        for (int j=0;j<b.length;j++)
        {
            c[j]=b[j];
            System.out.println(c[j]);
        }
    }
    @Test
    public void reverseAnArray()
    {
        int a[]={1,2,3,7,5,4,6};
        Arrays.sort(a);
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }

    @Test
    public void ReverseArrayFromIndex()
    {
            int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
            int reverseIndex = 2; // Index from which to start reversing
            int startIndex = reverseIndex;
            int endIndex = array.length - 1;

            while (startIndex < endIndex) {
                int temp = array[startIndex];
                array[startIndex] = array[endIndex];
                array[endIndex] = temp;
                startIndex++;
                endIndex--;
            }

            // Printing the reversed array
            for (int num : array) {
                System.out.print(num + " ");
            }
        }

        @Test
    public void testArrayRevFromReqIndex()
        {
            int a[]={2,3,4,5,6,7,8,1,23};
            int startIndex=3;
            int endIndex=a.length-1;

            while (startIndex<endIndex)
            {
                int temp=a[startIndex];
                a[startIndex]=a[endIndex];
                a[endIndex]=temp;
                startIndex++;
                endIndex--;
            }
            for (int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        }


}
