//Detect cycle in Undirected Graph.(We use BFS for detecting cycle in undirected graph).
//There are components of graph so we have to do bfs on each components.
package GRAPH;
import java.util.*;
public class Graph04 {
    public static boolean bfs(ArrayList<ArrayList<Integer>>Graph,boolean visited[],int x){
        Queue<Integer>q1 = new LinkedList<>();
        q1.add(x);
        while(q1.size()>0){
            int currNode = q1.remove();

            if(visited[currNode] == true)return true;
            visited[currNode] = true;

            for(int nbr : Graph.get(currNode)){
                if(visited[nbr] == false)q1.add(nbr);
            }
        }
        return false;
    }
    public static boolean findCycle(ArrayList<ArrayList<Integer>>Graph,int vert){
        boolean vis[] = new boolean[vert];

        for(int i=0;i<vert;i++){ //for components we do this. for new component a new value of i will go in bfs function.
            if(vis[i] == true)continue; // if node is already visited then we dont apply bfs on that
            boolean Getcycle = bfs(Graph,vis,i);
            if(Getcycle == true)return true;
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
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        boolean cycleFound = findCycle(graph,vert);
        System.out.println(cycleFound);
    }
}
