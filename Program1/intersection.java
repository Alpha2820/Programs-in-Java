import java.util.Scanner;
import java.util.*;
public class intersection {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i =0  ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of 2nd array");
        int m = sc.nextInt();
        int arr1[] = new int[m];
        System.out.println("Enter the elements of the second array");
        {
            for(int j =0 ; j<m ; j++)
            {
                arr1[j] = sc.nextInt();
            }
        }
        HashSet<Integer>h1 = new HashSet<>();
        HashSet<Integer>h2 = new HashSet<>();
        for(int i =0 ; i<n ; i++)
        {
            h1.add(arr[i]);
        }
        for(int j = 0 ; j<m ; j++)
        {
            if(h1.contains(arr1[j]))
            {
                h2.add(arr1[j]);
            }
        }
        System.out.println(h2);
        sc.close();
    }
}

