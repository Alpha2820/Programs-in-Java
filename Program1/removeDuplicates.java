import java.util.*;
public class removeDuplicates {
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
        int c = 0;
		for(int j = 0 ; j<n-1 ; j++)
		{
			if(arr[j]!=arr[j+1])
			{
				c++;
			}
		}
		System.out.println(c+1);
        sc.close();
    }
}
