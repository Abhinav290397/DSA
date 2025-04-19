//Network travel time(Refer portal).
package GRAPH;
import java.util.*;
public class Graph14 {
    static class Edge{    //This class is used to construct garph.(Becoz edge wt is given thats why we have to use class)
        int nbr;
        int wt;
        Edge(int nbr,int wt){
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    static class Pair{
        int node;         //This class is used to store data in PQ.
        int time;
        Pair(int node,int time){
            this.node = node;
            this.time = time;
        }
    }
    public static int solve(int[][]arr,int V,int K){ //K is the node from which signal starts.
        ArrayList<ArrayList<Edge>>graph = new ArrayList<>();
        for(int i=0;i<V;i++){  
            graph.add(new ArrayList<>());
        }
        for(int[]x : arr){
            int u = x[0];
            int v = x[1];
            int w = x[2];
            graph.get(u).add(new Edge(v,w));      //we have to make directed graph.
        }

        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
            return a.time - b.time;
        });

        int[]visited = new int[V];
        for(int i=0;i<V;i++)visited[i] = -1;

        pq.add(new Pair(K,0));// first we add Kth node and time (i.e 0) in PQ.
        int MinTime = 0;               
        
        while(pq.size()>0){
            Pair curr = pq.remove();
            int Node = curr.node;
            int Time = curr.time;

            if(visited[Node] != -1)continue;
            visited[Node] = Time; 
            MinTime = Math.max(MinTime,Time);

            for(Edge e : graph.get(Node)){
                int Nbr = e.nbr;
                int Wt = e.wt;
                if(visited[Nbr] == -1)pq.add(new Pair(Nbr,Time+Wt));
            }
        }
        for(int i=0;i<V;i++){
            if(visited[i] == -1)return -1;
        }
        return MinTime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edg = sc.nextInt();
        int k = sc.nextInt(); // it is the node from which signal first starts travelling and goes to other nodes.

        int mat[][] = new int[edg][3];//here [edg][3] 3 means 3 columns...means each row contains 3 elements u v w (i.e 2 connected nodes and edge wt.)
        for(int i=0;i<edg;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(mat, vert, k));
    }
}
