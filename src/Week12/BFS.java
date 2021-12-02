package Week12;

import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    private static Digraph digraph;
    private static int[] distTo;
    private static boolean[] visited;

    public static class Digraph {
        private List<Integer>[] adj;

        public Digraph(int n, List<List<Integer>> edges) {
            adj = new List[n + 1];
            for (int i = 0; i <= n; i++) adj[i] = new ArrayList<>();
            for (int i = 0; i < edges.size(); i++) {
                int x = edges.get(i).get(0);
                int y = edges.get(i).get(1);
                if (!adj[x].contains(y)) adj[x].add(y);
                if (!adj[y].contains(x)) adj[y].add(x);
            }
        }

        public Iterable<Integer> neighbor(int vertex) {
            return adj[vertex];
        }
    }

    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        digraph = new Digraph(n, edges);
        visited = new boolean[n + 1];
        distTo = new int[n + 1];
        for (int i = 1; i <= n; i++) distTo[i] = Integer.MAX_VALUE;
        distTo[s] = 0;
        BFS(s);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == s) continue;
            if (distTo[i] != Integer.MAX_VALUE) result.add(distTo[i]);
            else result.add(-1);
        }
        return result;
    }

    public static void BFS(int vertex) {
        Queue<Integer> q = new LinkedList<>();
        q.add(vertex);
        visited[vertex] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (Integer i : digraph.neighbor(v))
                if (!visited[i])
                {
                    q.add(i);
                    visited[i] = true;
                    if (distTo[v] + 6 < distTo[i])
                    {
                        distTo[i] = distTo[v] + 6;
                    }

                }
        }
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        int m = StdIn.readInt();
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(StdIn.readInt());
            temp.add(StdIn.readInt());
            edges.add(temp);
        }
        int s = StdIn.readInt();
        List<Integer> result = bfs(n, m, edges, s);
        for (Integer i : result) System.out.println(i);
    }

}