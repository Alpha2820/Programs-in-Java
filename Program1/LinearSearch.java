import java.util.Scanner;

public class LinearSearch {
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
        System.out.println("Enter the value you want to find");
        int target = sc.nextInt();
        for(int k = 0 ; k<arr.length ; k++)
        {
            if(arr[k] == target)
            {
                System.out.println("The index found is :"+k);
            }
            else
            {
                System.out.println("No element is present");
            }
        }
        sc.close();
    }
    
}
