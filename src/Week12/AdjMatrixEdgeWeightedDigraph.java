package Week12;

import java.util.ArrayList;
import java.util.List;

public class AdjMatrixEdgeWeightedDigraph {
    private int V;
    private int E;
    private int[][] adj;

    public AdjMatrixEdgeWeightedDigraph(int V){
        this.V = V;
        this.E = 0;
        this.adj = new int[V][V];
    }

    public void addEdge(int from, int to, int weight) {
        if (!isConnected(from, to)) {
            E++;
            adj[from][to] = weight;
        }
    }

    public void removeEdge(int from, int to){
        if (isConnected(from, to)) {
            E--;
            adj[from][to] = 0;
        }
    }
    public void addVertex(){
        if(adj.length == V-1){
            adj = expandAdj();
        }
        V++;
    }
    public void removeVertex(int v){
        V--;
        adj[v][v] = -1;
    }

    public boolean isConnected(int from, int to){
        return adj[from][from] != -1 && adj[to][to] != -1 && adj[from][to] != 0;
    }

    public Iterable<Integer> getAdjacentVertices(int v){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < adj.length; i++){
            if(isConnected(v, i))
                res.add(i);
        }
        return res;
    }

    private int[][] expandAdj(){
        int n = adj.length;
        int[][] aux = new int[n][n];
        for(int i = 0; i < adj.length; i++){
            System.arraycopy(adj[i], 0, aux[i], 0, adj[0].length);
        }
        return aux;
    }
}
