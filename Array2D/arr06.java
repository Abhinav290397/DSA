//Print 'Off Principal Diagonal'ans find sum of Off principal diagonal.
package Array2D;
import java.util.*;
public class arr06 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int mat [][] = new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            mat[i][j] = sc.nextInt();
        }
    }
    int sum = 0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            //if((i+j) == (n-1))System.out.println(mat[i][j]);
            if((i+j) == (n-1))sum += mat[i][j];
        }
    }
    System.out.println(sum);
   } 
}
