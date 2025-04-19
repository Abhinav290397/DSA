//Find the no. of distinct Island(portal).
package GRAPH;
import java.util.*;
public class Graph18 {
    public static void dfs(int[][]mat,ArrayList<Integer>Al,int i,int j,int bi,int bj){
        if(i<0||j<0||i==mat.length||j==mat[0].length||mat[i][j] == 0)return;

        mat[i][j] = 0;
        Al.add(i - bi);
        Al.add(j - bj);

        dfs(mat,Al,i-1,j,bi,bj);
        dfs(mat,Al,i,j-1,bi,bj);
        dfs(mat,Al,i+1,j,bi,bj);
        dfs(mat,Al,i,j+1,bi,bj);

    }
    public static int countDistinctIsland(int mat[][]){
        HashSet<ArrayList<Integer>>hs = new HashSet<>();

        int m = mat.length;
        int n = mat[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0)continue;
                ArrayList<Integer>al1 = new ArrayList<>();
                dfs(mat,al1,i,j,i,j);
                hs.add(al1);
            }
        }
        return hs.size();
    }
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
        System.out.println(countDistinctIsland(arr));
    }
}
