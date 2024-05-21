import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayRotate
{
    public static void main(String[] args)
    {
        int a[] = {23, 12, 5, 24, 23, 76, 86, 24, 86, 24, 75};

        int num = 3;
        int j = 0;
        for (int i = a.length - num; i < a.length; i++)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j++;
        }

        int k = a.length - 1;
        for (int i = num; i < a.length; i++)
        {
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;
            k--;
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + "\t");
        }
    }

    public class ArraySwap
    {
        public static void main(String[] args)
        {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {6, 7, 8, 9, 10};

            System.out.println("Original arrays:");
            System.out.println("Array 1: " + Arrays.toString(arr1));
            System.out.println("Array 2: " + Arrays.toString(arr2));

            // Swapping arrays
            swapArrays(arr1, arr2);

            System.out.println("\nArrays after swapping:");
            System.out.println("Array 1: " + Arrays.toString(arr1));
            System.out.println("Array 2: " + Arrays.toString(arr2));
        }

        // Method to swap elements of two arrays
        public static void swapArrays(int[] arr1, int[] arr2)
        {
            if (arr1.length != arr2.length)
            {
                throw new IllegalArgumentException("Arrays must have the same length");
            }

            for (int i = 0; i < arr1.length; i++)
            {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
    }

    @Test
    public void swaping2Arrays()
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println("Original arrays:");
        System.out.println("Array 1: " + arrayToString(arr1));
        System.out.println("Array 2: " + arrayToString(arr2));

        // Exchanging arrays
        exchangeArrays(arr1, arr2);

        System.out.println("\nArrays after exchange:");
        System.out.println("Array 1: " + arrayToString(arr1));
        System.out.println("Array 2: " + arrayToString(arr2));
    }

    // Method to exchange entire arrays without built-in functions
    public static void exchangeArrays(int[] arr1, int[] arr2)
    {
        if (arr1.length != arr2.length)
        {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        for (int i = 0; i < arr1.length; i++)
        {
            // Exchange each element between the arrays
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }

    // Method to convert array to string for printing
    public static String arrayToString(int[] arr)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++)
        {
            sb.append(arr[i]);
            if (i < arr.length - 1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Test
    public void testMerging2Array()
    {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};
        int c[] = new int[a.length + b.length];
        int j = 0;
        for (int i = 0; i < c.length; i++) //0-5
        {
            if (i < a.length)
            {
                c[i] = a[i];
            } else //3-5
            {
                c[i] = b[j];
                j++;
            }
        }
        for (int i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
        }
    }
}