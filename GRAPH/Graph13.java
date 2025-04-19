//In the given graph return true if Hamiltonian path exists in that otherwise return false.(portal and gfg)
package GRAPH;
import java.util.*;
public class Graph13 {
    public static boolean dfs(int node,boolean path[],ArrayList<Integer>psf,ArrayList<ArrayList<Integer>>Graph){
        path[node] = true;
        psf.add(node);
        
        if(psf.size() == Graph.size()){
            return true;
        }
        for(int nbr : Graph.get(node)){
            if(path[nbr] == false){
                boolean pathfound = dfs(node, path, psf, Graph);
                if(pathfound == true)return true;
            }
        }
        psf.remove(psf.size()-1);
        path[node] = false;
        return false;
    }

    public static boolean findHamiltonianPath(ArrayList<ArrayList<Integer>>Graph,int V){
        boolean path[] = new boolean[V];
        ArrayList<Integer>psf = new ArrayList<>();

        for(int i=0;i<V;i++){
            boolean found = dfs(i,path,psf,Graph);
            if(found == true) return true;
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
        System.out.println(findHamiltonianPath(graph, vert));
    }
}
