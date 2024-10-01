import java.util.*;
public class numberAppearOnce {

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
        HashSet<Integer>h1 = new HashSet<>();
        for(int j = 0 ; j<n ; j++)
        {
            if(h1.contains(arr[j]))
            {
                h1.remove(arr[j]);
            }
            else
            {
                h1.add(arr[j]);
            }
        }
        System.out.println(h1.iterator().next());
        sc.close();
    }
}
