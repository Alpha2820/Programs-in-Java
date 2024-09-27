import java.util.Scanner;

public class LeftRotate {
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
        int temp = arr[0];
        for(int j = 1 ; j<arr.length ; j++)
        {
            arr[j-1] = arr[j];
        }
        arr[n-1] = temp;
        for(int k = 0 ; k<arr.length ; k++)
        {
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }
}
