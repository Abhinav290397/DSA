//Dijiktra's Algorithm.
package GRAPH;
import java.util.*;
class Pair{
    int node;
    int wsf;
    String psf;
    Pair(int node,int wsf,String psf){
        this.node = node;
        this.wsf = wsf;
        this.psf = psf;
    }
}
public class Graph08 {
    public static void dijiktra(ArrayList<ArrayList<ArrayList<Integer>>>graph,int S,int V){ //S -> sourceNode.
        
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
            return a.wsf - b.wsf;
        });
        pq.add(new Pair(S,0,""+S));

        boolean visited[] = new boolean[V];

        while(pq.size()>0){

            Pair curr = pq.remove();      

            int Node = curr.node;
            int Wsf = curr.wsf;
            String Psf = curr.psf;

            if(visited[Node] = true)continue;
            visited[Node] = true;

            System.out.println(Psf+"@"+Wsf);

            for(ArrayList<Integer>x : graph.get(Node)){
                int Nbr = x.get(0);
                int Wt = x.get(1);
                if(visited[Nbr] = false)pq.add(new Pair(Nbr,Wsf+Wt,Psf+Nbr));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edg = sc.nextInt();

        ArrayList<ArrayList<ArrayList<Integer>>>graph = new ArrayList<>(); //3D AL .

        for(int i=0;i<vert;i++){
            graph.add(new ArrayList<ArrayList<Integer>>());
        }
        for(int i=0;i<edg;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            ArrayList<Integer>t1 = new ArrayList<>();
            ArrayList<Integer>t2 = new ArrayList<>();

            t1.add(v);
            t1.add(w);
            t2.add(u);
            t2.add(w);

            graph.get(u).add(t1);
            graph.get(v).add(t2);

        }
        int source = sc.nextInt();
        dijiktra(graph,source,vert);
    }
}
