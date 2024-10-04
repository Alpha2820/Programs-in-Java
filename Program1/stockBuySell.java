import java.util.*;
public class stockBuySell {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0  ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ;  i<n ; i++)
        {
            min = Math.min(min,arr[i]);
            max = Math.max(max,(arr[i]-min));
        }
        System.out.println("The maximum profit would be "+max);
        sc.close();
    }
    
}
