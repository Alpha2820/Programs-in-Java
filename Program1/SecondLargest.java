import java.util.*;
public class SecondLargest
{
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
        int f_max = arr[0];
        int s_max = Integer.MIN_VALUE;
        for(int j = 1  ; j<n ; j++)
        {
            if(arr[j]>f_max)
            {
                s_max = f_max;
                f_max = arr[j];
            }
            else if((s_max<arr[j]) && (s_max!=f_max))
            {
                s_max = arr[j];
            }
        }
        int f_min = arr[0];
        int s_min = Integer.MAX_VALUE;
        for(int k = 1  ; k<n ; k++)
        {
            if(f_min>arr[k])
            {
                s_min = f_min;
                f_min = arr[k];
            }
            else if((s_min>arr[k])&&(s_min!=f_min))
            {
                s_min = arr[k];
            }
        }
        System.out.println(s_max+" "+s_min);
        sc.close();
    }
}