import java.util.*;
public class maxConsOnes {
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
        int count = 0;
        int max = 0;
        for(int i = 0 ; i<n ; i++)
        {
            if(arr[i]==1)
            {
                count++;
                max = Math.max(max,count);
            }
            else
            {
                count = 0;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
