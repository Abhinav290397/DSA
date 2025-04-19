//Detect cycle in Directed Graph.(We use DFS for detecting cycle in Directed graph).
package GRAPH;
import java.util.*;
public class Graph05 {
    public static boolean dfs(ArrayList<ArrayList<Integer>>Graph,boolean vis[],boolean path[],int sourceNode){
        vis[sourceNode] = true;
        path[sourceNode] = true;

        for(int x : Graph.get(sourceNode)){
            if(vis[x] == false){
                boolean findCycle = dfs(Graph,vis,path,x);
                if(findCycle == true)return true;
            }    
            else if(vis[x] == true && path[x] == false)continue;
            else if(vis[x] == true && path[x] == true)return true;
        }
        path[sourceNode] = false; // it means when we backtrack from given node.(Means there is no node to which we can go hence we have to go back...ans when we go back we make false for that node in our path array becoz this node is no longer coming in our path)
        return false;     
        
    }
    public static boolean detectCycle(ArrayList<ArrayList<Integer>>Graph,int vert){
        boolean vis[] = new boolean[vert];
        boolean path[] = new boolean[vert];

        for(int i=0;i<vert;i++){
            if(vis[i] == true)continue;
            boolean findCycle = dfs(Graph,vis,path,i);
            if(findCycle == true)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edg = sc.nextInt();

        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();

        for(int i=0;i<vert;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edg;i++){
            int u = sc.nextInt();   //u and v are nodes that are connected.
            int v = sc.nextInt();      //Input bhi le rahe h or graph bhi bana rahe h.

            graph.get(u).add(v);    //directed graph .
        }     
        System.out.println(detectCycle(graph, vert));
    }
}
