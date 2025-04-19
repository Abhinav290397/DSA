//Preint Principal Diagonal and find Sum of Principal Diagonal.(diagonal is present  only in square matrix).
package Array2D;
import java.util.*;
public class arr05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int mat[][] = new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            mat[i][j] = sc.nextInt();
        }
    }
    //int sum =0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i == j)System.out.println(mat[i][j]);//sum += mat[i][j];
        }
    }
   // System.out.println(sum);
    }
}
