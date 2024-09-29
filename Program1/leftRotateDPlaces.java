import java.util.*;
public class leftRotateDPlaces {

    public static void swap(int arr[] , int start , int end)
    {
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void leftRotate(int arr[] , int n , int k)
    {
        swap(arr , 0 , k-1);
        swap(arr , n , n-1);
        swap(arr, 0 , n-1);
    }
    public static void rightRotate(int arr[] , int n , int k)
    {
        swap(arr,n,n-k+1);
        swap(arr,n-k,n-1);
        swap(arr,0,n-1);
    }
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
        System.out.println("Enter the number of times you want to rotate the array");
        int k =  sc.nextInt();
        leftRotate(arr, n, k);
      //  rightRotate(arr, n, k); [use it when running for right rotate]
        for(int j = 0;  j <n ; j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        sc.close();
    }
}
