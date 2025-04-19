//Spread the infection.(Refer portal).
package GRAPH;
import java.util.*;

public class Graph16 {
    static class Edge{
        int src;
        int nbr;
        Edge(int src,int nbr){
            this.src = src;
            this.nbr = nbr;
        }
    }
    public static int solve(ArrayList<Edge>[]Graph,int src,int t,int V){
        Queue<Integer>q1 = new LinkedList<>();
        boolean[]visited = new boolean[V];

        int totalPeopleAffected = 0;

        q1.add(src);

        while(q1.size()>0 && t > 0){
            int size = q1.size();
            while(size-- > 0){
                int curr = q1.remove();
                if(visited[curr] == true)continue;
                visited[curr] = true;
                totalPeopleAffected++;
                for(Edge e : Graph[curr]){
                    int Nbr = e.nbr;
                    if(visited[Nbr] == false)q1.add(Nbr);
                }
            }
            t--;
        }
        return totalPeopleAffected;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edg = sc.nextInt();

        ArrayList<Edge>[]graph = new ArrayList[vert];

        for(int i=0;i<vert;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<edg;i++){        //construction of graph in form of Array of AL with help of edge class.
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(new Edge(u,v));
            graph[v].add(new Edge(v,u));
        }

        int src = sc.nextInt();
        int time = sc.nextInt();

        System.out.println(solve(graph, src, time, vert));
    }
}
