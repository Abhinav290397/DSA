//Topological Sorting (Refer portal Q. Course Schedule 2).
package GRAPH;
import java.util.*;
public class Graph10 {
    public static int[] topologicalSort(int[][]arr,int vert){

        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
        for(int i=0;i<vert;i++)graph.add(new ArrayList<Integer>());

        int []indegree = new int[vert]; 
        for(int[]x : arr){
            int u = x[1]; 
            int v = x[0];
            
            graph.get(u).add(v);   //graph formation.
            indegree[v]++;
        }
        Queue<Integer>q1 = new LinkedList<>();
        for(int i=0;i<vert;i++){
            if(indegree[i] == 0){
              q1.add(i);
            }
        }
        ArrayList<Integer>topo = new ArrayList<>();
        while(q1.size() > 0){
            int curr = q1.remove();
            topo.add(curr);
            for(int nbr : graph.get(curr)){
                indegree[nbr]--;
                if(indegree[nbr] == 0)q1.add(nbr);
            }
        }
        if(topo.size() < vert)return new int[]{-1}; // It means given graph is not DAG and there is cycle is present int graph,hence the topological sorting is not possible.

        int res[] = new int[vert]; 
        for(int i=0;i<vert;i++){  //adding elements from topo AL to res array and then return res Array.
            res[i] = topo.get(i);
        }
        return res;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);        //Input given in form of 2D matrix.
    int n = sc.nextInt(); // n is no. of nodes.
    int m = sc.nextInt();//m is no. of edges.

    int edges[][] = new int[m][2]; // in 2D matrix [m] = rows, [2] = no.of columns (represents connecting 2 nodes)

    for(int i=0;i<m;i++){
        for(int j=0;j<2;j++){
            edges[i][j] = sc.nextInt();  //Input le rahe h nodes ka jo apas me connected h in form of edge and form a 2D matrix.
        }
    }
    int ans[] = topologicalSort(edges,n);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
   } 
}
