package Array2D;
import java.util.*;
public class arr01 {
    public static void main(String[] args) {
        int[][] mat = new int[4][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
