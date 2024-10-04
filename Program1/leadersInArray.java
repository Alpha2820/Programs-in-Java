import java.util.Scanner;
import java.util.*;

public class leadersInArray {
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
        int max = arr[n-1];
        ArrayList<Integer>a1 = new ArrayList<>();
        a1.add(arr[n-1]);
        for(int j = n-2 ; j>=0 ;j--)
        {
            if(arr[j]>max)
            {
                a1.add(arr[j]);
                max = arr[j];
            }
        }
        Collections.sort(a1,Collections.reverseOrder());
        System.out.println("The leaders in array would be ");
        for(int k = 0 ; k<a1.size() ; k++)
        {
            System.out.print(a1.get(k)+" ");
        }
        sc.close();
    } 
}
