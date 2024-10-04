import java.util.*;
public class setMatrixZero {
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
        int row[] = new int[n];
        int col[] = new int[m];
        
        for(int i = 0 ;  i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                if(arr[i][j]==0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println("The matrix would be ");
        for(int i = 0 ;  i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
