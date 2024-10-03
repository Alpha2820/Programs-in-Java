import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majorityElement1 {
    public static void main(String agrs[])
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
        HashMap<Integer,Integer>h1 = new HashMap<>();
        for(int i = 0 ;  i<n ; i++)
        {
            h1.put(arr[i],h1.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer>m1:h1.entrySet())
        {
            if(m1.getKey()>(n/2))
            {
                System.out.println("The number which is greater than n/2 is "+m1.getValue());
            }
        }
        sc.close();
    }  
}