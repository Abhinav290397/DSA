//Print all the Hamiltonian Paths in a Graph.
package GRAPH;
import java.util.*;
public class Graph11 {
    public static void dfs(int node,boolean path[],ArrayList<Integer>psf,ArrayList<ArrayList<Integer>>graph){
        path[node] = true;
        psf.add(node);

        if(psf.size() == graph.size()){
            System.out.println(psf);
            psf.remove(psf.size() - 1);
            path[node] = false;
            return;
        }
        for(int nbr : graph.get(node)){
            if(path[nbr] == false)dfs(nbr,path,psf,graph);
        }
        path[node] = false;
        psf.remove(psf.size()-1);
        return;
    }

    public static void PrintHamiltonianPaths(ArrayList<ArrayList<Integer>>Edge,int V){
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>(); //Here we form the graph from given Edges AL.
        for(int i=0;i<V;i++)graph.add(new ArrayList<Integer>()); 

        for(ArrayList<Integer>x : Edge){
            int u = x.get(0);
            int v = x.get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean path[] = new boolean[V];
        ArrayList<Integer>psf = new ArrayList<>(); //path so far AL to store all possible paths.
        for(int i=0;i<V;i++){
            dfs(i,path,psf,graph);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edg = sc.nextInt();

        ArrayList<ArrayList<Integer>>Edges = new ArrayList<>(); //Here input given in form of 2D AL.
        for(int i=0;i<edg;i++){
            ArrayList<Integer>al1 =  new ArrayList<>();
            al1.add(sc.nextInt());  //Here we take input for 2 nodes which are connecting which are added to al1 AL and these al1 ALs are then added to 2D Edges AL.
            al1.add(sc.nextInt());
            Edges.add(al1);
        }
        PrintHamiltonianPaths(Edges, vert);
    }
}
