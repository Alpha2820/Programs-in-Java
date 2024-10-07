import java.util.*;
public class countSubarraySum {
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
        System.out.println("Enter the sum you want to find ");
        int mid = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i<n ; i++)
        {
            int sum = 0;
            for(int j = i ; j<n ; j++)
            {
                sum+=arr[j];
                if(sum==mid)
                {
                    count++;
                }
            }
        }
        System.out.println("The subarray which led to the sum is "+count);
        sc.close();
    }
    
}
