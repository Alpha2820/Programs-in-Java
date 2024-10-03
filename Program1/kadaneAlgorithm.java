import java.util.Scanner;

public class kadaneAlgorithm {
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
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++)
        {
            sum = sum+arr[i];
            if(sum>0)
            {
                max = Math.max(max,sum);
            }
            if(sum<0)
            {
                sum = 0;
            }
        }
        System.out.println("The maximum subarray sum is"+max);
    }
}
