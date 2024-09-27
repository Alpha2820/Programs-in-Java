import java.util.*;
public class LargestElement {
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
        int max = Integer.MIN_VALUE;
        for(int j = 0 ;  j<n ; j++)
        {
            max = Math.max(arr[j],max);
        }
        System.out.println(max);
        sc.close();
    }
}
