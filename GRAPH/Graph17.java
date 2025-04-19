//Minimum Spanning Tree (MST).
//Given a weighted, undirected and connected graph of V vertices and E edges. 
//The task is to find the sum of weights of the edges of the Minimum Spanning Tree.
package GRAPH;
import java.util.*;
public class Graph17 {
    static class Edge{
        int nbr;
        int weight;
        Edge(int nbr,int weight){
            this.nbr = nbr;
            this.weight = weight;
        }
    }
    static class Pair{
        int node;
        int wt;
        Pair(int node,int wt){
            this.node = node;
            this.wt = wt;
        }
    }
    public static int MST(ArrayList<ArrayList<Edge>>Graph,int V){
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
            return a.wt - b.wt;
        });
        boolean vis[] = new boolean[V];
        int sumOfWt = 0;

        pq.add(new Pair(0,0));

        while(pq.size()>0){
            Pair curr = pq.remove();
            int Node = curr.node;
            int Wt = curr.wt;
            
            if(vis[Node] == true)continue;
            vis[Node] = true;
            sumOfWt += Wt;

            for(Edge e : Graph.get(Node)){
                int Nbr = e.nbr;
                int W = e.weight;
                if(vis[Nbr] == false){
                    pq.add(new Pair(Nbr,W));
                }
            }
        }
        return sumOfWt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edg = sc.nextInt();
        
        ArrayList<ArrayList<Edge>>graph = new ArrayList<>();
        for(int i=0;i<vert;i++){
            graph.add(new ArrayList<Edge>());
        }
        for(int i=0;i<edg;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt(); //w = wt.

            graph.get(u).add(new Edge(v,w));
            graph.get(v).add(new Edge(u,w));
        }
        System.out.println(MST(graph, vert));
    }
}
