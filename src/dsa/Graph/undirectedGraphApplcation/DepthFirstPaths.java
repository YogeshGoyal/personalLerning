/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.undirectedGraphApplcation;

import dsa.Graph.undirectedGraphApplcation.AdjacencyUndirectedGraph;

/**
 *
 * @author yokukuma
 */
public class DepthFirstPaths {

    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public DepthFirstPaths(AdjacencyUndirectedGraph g, int s) {
        this.s = s;
        marked = new boolean[g.getSize()];

        edgeTo = new int[g.getSize()];
        for(int i = 0; i< edgeTo.length; i++){
            edgeTo[i] = -1;
            marked[i] = false;
        }
        dfs(g, s);
    }

    private void dfs(AdjacencyUndirectedGraph g, int v) {
        marked[v] = true;
        for (int w : g.getEdge(v)) {
            if (!marked[w]) {
                dfs(g, w);
                edgeTo[w] = v;
            }
        }
    }

    public boolean isConnected(int vertices) {
        return marked[vertices];
    }

    void printPath(int vertices) {
        if (marked[vertices] != Boolean.TRUE) {
            System.out.println("No path to print");
            return;
        }
        int current = vertices;
        System.out.print("Path is: ");
        while (current != s) {
            System.out.print("\t"+ current);
            current = edgeTo[current];
        }
        System.out.print("\t"+ s + "\n");
    }

}
