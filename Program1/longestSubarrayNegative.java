import java.util.Scanner;

public class longestSubarrayNegative {
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
        System.out.println("Enter the target");
        int x = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int j = 0 ;  j<n ; j++)
        {
            int sum = 0;
            for(int k = j ; k<n ; k++)
            {
                sum = sum+arr[k];
                if(sum==x)
                {
                    max = Math.max(max,(k-j+1));
                }
            }
        }
        System.out.println("The lenght of subArray would be "+max);
    } 
}
