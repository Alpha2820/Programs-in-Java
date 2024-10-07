import java.util.*;
public class rotateMatrixby {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int n = sc.nextInt();
        System.out.println("Enter the coloumn");
        int m = sc.nextInt();
        System.out.println("Start entering the elements");
        int arr[][] = new int[n][m];
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int newArr[][] = new int[n][m];
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                newArr[j][n-i-1] = arr[i][j];
            }
        }
        System.out.println("The rotated matrix is ");
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    } 
}
