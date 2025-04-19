//DFS Implementation.
package GRAPH;
import java.util.*;
public class Gph02 {
    public static void dfs(ArrayList<ArrayList<Integer>>graph,boolean vis[],int currNode){
        vis[currNode] = true;
        System.out.print(currNode+" ");

        for(int nbr : graph.get(currNode)){
            if(vis[nbr] == false){
                dfs(graph,vis,nbr);
            }
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int vert = sc.nextInt();
    int edge = sc.nextInt();

    ArrayList<ArrayList<Integer>>graph = new ArrayList<>();

    for(int i=0;i<vert;i++){
        graph.add(new ArrayList<Integer>());
    }
    for(int i=0;i<edge;i++){
        int u = sc.nextInt(); //Here we take input (for 2 nodes which are connected).
        int v = sc.nextInt();

        graph.get(u).add(v);     // Simultaneously we form the graph.
        graph.get(v).add(u);
    }
    boolean visited[] = new boolean[vert];//check out difference Boolean and boolean.
    dfs(graph,visited,0);
    }
}
