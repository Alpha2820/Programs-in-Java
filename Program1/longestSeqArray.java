import java.util.Scanner;

public class longestSeqArray {

    public static boolean linear(int arr[] , int target)
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }
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
        int longest = 1;
        for(int j = 0 ; j<n ; j++)
        {
            int x = arr[j];
            int count = 1;
            while(linear(arr, (x+1))==true)
            {
                x+=1;
                count+=1;
            }
            longest = Math.max(longest,count);
        }
        System.out.println("The longest sequence is ");
        System.out.println(longest);
        sc.close();
    }
}
