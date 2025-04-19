//Print the Hamiltonian Path in a graph and find which hamiltonian path is having hamiltonian cycle.
package GRAPH;
import java.util.*;
public class Graph12 {
    public static void dfs(int node,boolean path[],ArrayList<Integer>psf,ArrayList<ArrayList<Integer>>Graph){
        path[node] = true;
        psf.add(node);

        if(psf.size() == Graph.size()){
            System.out.print(psf);
            int src = psf.get(0);

            for(int nbr : Graph.get(node)){ // this much code is to find hamiltonian cycle present or not.
                if( nbr == src){    //means if src node becomes neighbour of last node then there is hamiltonian cycle
                    System.out.print("cycle");
                    break;
                }
            }
            System.out.println();
        }
        for(int nbr : Graph.get(node)){
            if(path[nbr] == false)dfs(nbr,path,psf,Graph);
        }
        psf.remove(psf.size()-1);
        path[node] = false;
    }
    public static void Hamiltonian(ArrayList<ArrayList<Integer>>Graph,int V){

        boolean path[] = new boolean[V];
        ArrayList<Integer>psf = new ArrayList<>();
        for(int i=0;i<V;i++){
            dfs(i,path,psf,Graph);
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
        Hamiltonian(graph, vert);
    }
}
