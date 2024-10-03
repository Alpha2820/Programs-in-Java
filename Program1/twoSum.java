import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
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
        HashMap<Integer,Integer>h1 = new HashMap<>();
        for(int i = 0 ;  i<n ; i++)
        {
            int val = arr[i];
            int target = x - val;
            if(h1.containsKey(target))
            {
                System.out.println("YES");
            }
            else
            {
                h1.put(arr[i], i);
            }
        }
        sc.close();
    }  
}
