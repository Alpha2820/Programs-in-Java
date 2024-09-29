import java.util.*;
public class moveZerosLeft {
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
        int temp[] = new int[n];
        int idx = 0;
        for(int j= 0 ;  j <n ; j++)
        {
            if(arr[j]!=0)
            {
                temp[idx++] = arr[j];
            }
        }
        for(int k = 0 ; k<n ; k++)
        {
            System.out.print(temp[k]+" ");
        }
        System.out.println();
        sc.close();
    }
    
}
