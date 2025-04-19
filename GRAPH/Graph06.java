//Ptint Paths (Print the all possible path from source node to destination node). //refer gfg(as count no. of all path from src to dest)
package GRAPH;
import java.util.*;
class Edge{
    int src;
    int nbr;
    Edge(int src,int nbr){
        this.nbr = nbr;
        this.src = src;
    }
}
public class Graph06 {
    public static void dfs(ArrayList<Edge>[]Graph,boolean path[],int src,int dest,String psf){
        if(src == dest){
            System.out.println(psf);
            return;
        }
        path[src] = true;
        for(Edge e : Graph[src]){
            int Nbr = e.nbr;
            if(path[Nbr] == false) dfs(Graph,path,Nbr,dest,psf+Nbr);
        }
        path[src] = false;
    }
    public static void findAllPath (ArrayList<Edge>[]Graph,int Src ,int Dest,int V){ //V->vertexes
        //write code here.
        boolean path[] = new boolean[V];
        dfs(Graph,path,Src,Dest,""+Src);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edg = sc.nextInt();

        ArrayList<Edge>[]graph = new ArrayList[vert]; //Here we are using Array of AL taking  elements in form of edge
        for(int i=0;i<vert;i++){
            graph[i] = new ArrayList<>();
        }      

        for(int i=0;i<edg;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(new Edge(u,v));  // forming undirected graph.
            graph[v].add(new Edge(u,v));
        }                                
        int source = sc.nextInt();
        int destination = sc.nextInt();
        findAllPath(graph, source, destination, vert);
    }
}


