import java.util.Scanner;

public class sortArray {
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
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i = 0 ;  i<n ; i++)
        {
            if(arr[i]==0)
            {
                countZero++;
            }
            else if(arr[i]==1)
            {
                countOne++;
            }
            else
            {
                countTwo++;
            }
        }
        for(int j = 0 ; j<countZero ; j++)
        {
            arr[j] = 0;
        }
        for(int k = countZero ; k<(countOne+countZero) ; k++)
        {
            arr[k] = 1;
        }
        for(int l = countOne+countZero ; l<n ; l++)
        {
            arr[l] = 2;
        }
        for(int p = 0 ; p<n ; p++)
        {
            System.out.print(arr[p]+" ");
        }
        sc.close();
    }
    
}
