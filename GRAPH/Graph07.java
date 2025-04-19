//print the smallest path and smallest path weight from given source to destination.
package GRAPH;
import java.util.*;
public class Graph07 {
    static class Edge{
        int src;
        int nbr;
        int wt;
        Edge(int src,int nbr,int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    static Class Pair{
        String psf;
        int wsf;
        Pair(String psf,int wsf){
            this.psf = psf;
            this.wsf = wsf;
        }
    }
    static String AnsPath;
    static int AnsWt = Integer.MAX_VALUE;
    public static void dfs(ArrayList<Edge>[]graph,int src,int dest,boolean[]path,String psf,int wsf){
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
            return a.wsf - b.wsf;
        });
        if(src == dest){
            if(AnsWt > wsf){
                AnsWt = wsf;
                AnsPath = psf;
            }
        }
        path[src] = true;
        
        for(Edge e : graph[src]){
            int Nbr = e.nbr;
            int Wt = e.wt;
            if(path[Nbr] == false)dfs(graph,Nbr,dest,path,psf+Nbr,wsf+Wt);
        }
        path[src] = false;
    }

    public static void smallestPathFromSrcToDest(ArrayList<Edge>[]graph,int src,int dest,int vert){
        boolean[]path = new boolean[vert];
        String psf = "";
        int wsf = 0;
        dfs(graph,src,dest,path,psf,wsf);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edg = sc.nextInt();

        ArrayList<Edge>[]graph = new ArrayList[vert];
        for(int i=0;i<vert;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<edg;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph[u].add(new Edge(u,v,w));
            graph[v].add(new Edge(v,u,w));
        }
        int source = sc.nextInt();
        int destination = sc.nextInt();
    }
}