import java.util.*;
public class missingNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        int sum = 0;
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        int sum1 = n*(n+1)/2;
        System.out.println("The missing number is "+(sum1-sum));
        sc.close();
    }
}
