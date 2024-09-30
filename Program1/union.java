import java.util.*;
public class union {
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
        for(int i = 0 ; i<n ; i++)
        {
            h1.add(arr[i]);
        }
        for(int j = 0 ; j<m ; j++)
        {
            h1.add(arr1[j]);
        }
        System.out.println(h1);
        sc.close();
    }
}
