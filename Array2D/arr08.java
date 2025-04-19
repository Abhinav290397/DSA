//find the difference of sum of column and sum of row in square 2D matrix.
/* mat = [1 2 3 4
          5 6 7 8
          9 2 7 1   
          3 1 5 2]*/ //(1+5+9+3)-(1+2+3+4) => 18-10 = 8; (2+6+2+1)-(5+6+7+8)=>11-26 = -15 ; (3+7+7+5)-(9+2+7+1)=>22-19=3 and so on.
package Array2D; //REFER 18 SEPT.LECTURE.
import java.util.*;
public class arr08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int rowSum = 0;
            for(int j=0;j<n;j++){
                rowSum += mat[i][j];
            }
            int colSum = 0;
            for(int j=0;j<n;j++){ // we traverse on rows for a column.
                colSum += mat[j][i]; // mat[j][i] means j changes and we go downward for each col.
            }
            System.out.println(colSum - rowSum);
        }
    }
}
