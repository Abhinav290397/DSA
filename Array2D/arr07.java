//Alternate Matrix Sum.
package Array2D;
import java.util.*;
public class arr07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0)evenSum += mat[i][j];
                else oddSum += mat[i][j];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
