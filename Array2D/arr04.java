//Product of elements of 2D matrix.
package Array2D;
import java.util.*;
public class arr04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int product = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                product *= arr[i][j];
            }
        }
        System.out.println(product);
    }
}
