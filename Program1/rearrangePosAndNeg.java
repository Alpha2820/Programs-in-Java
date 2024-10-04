import java.util.*;
public class rearrangePosAndNeg {
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
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();
        for(int j = 0 ; j<n ; j++)
        {
            if(arr[j]<0)
            {
                neg.add(arr[j]);
            }
            else
            {
                pos.add(arr[j]);
            }
        }
        for(int k = 0 ; k<n/2 ; k++)
        {
            arr[2*k] = pos.get(k);
            arr[2*k+1] = neg.get(k); 
        }
        System.out.println("The rearrangement would look like ");
        for(int l = 0 ; l<n ; l++)
        {
            System.out.print(arr[l]+" ");
        }
        sc.close();
    }
    
}
