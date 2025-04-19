//BFS Implementation.
package GRAPH;
import java.util.*;
public class Gph03 {
    public static void bfs(ArrayList<ArrayList<Integer>>graph,boolean vis[],int x){
        Queue<Integer>q1 = new LinkedList<>();
        q1.add(x);
        while(q1.size() > 0){
            int currNode = q1.remove();

            if(vis[currNode] == true)continue;
            vis[currNode] = true;
            System.out.print(currNode+" ");

            for(int nbr:graph.get(currNode)){
                if(vis[nbr] == false){
                   q1.add(nbr);
                }
            }
        }
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
        boolean visited[] = new boolean[vert];
        bfs(graph,visited,0);
    }
}
