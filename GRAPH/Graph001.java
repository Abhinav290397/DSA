//construct a  graph.(Best method refer this);
//Refer april lecture of Graph - 1.
package GRAPH;
import java.util.*;
public class Graph001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vert = sc.nextInt();
        int edge = sc.nextInt();

        ArrayList<ArrayList<Integer>>graph = new ArrayList<>(); // 2D Al banai.graph AL represents graph.
        for(int i=0;i<vert;i++){            //jitni vertex h utni 1D blank AL add kardi 2D graph AL mei.
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edge;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);   // Graph construction(no need to make another function to construct graph)//in next line if we remove graph.get(v).add(u)......it becomes directed graph.
            graph.get(v).add(u);
        }
        System.out.println(graph);
    }
}
