/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.directedGraphApplication;

import dsa.Graph.unidirectedGraphApplcation.AdjacencyUndirectedGraph;
import java.util.Stack;

/**
 *
 * @author yokukuma
 */
public class DirectedDFS {

    private boolean[] marked;
    private int[] edgeTo;
    private int s;
    
    
    public DirectedDFS(Digraph g, int s) {
        this.s = s;
        marked = new boolean[g.getSize()];
        edgeTo = new int[g.getSize()];
        for (int i = 0; i < edgeTo.length; i++) {
            edgeTo[i] = -1;
            marked[i] = false;
        }
        dfs(g, s);
    }

    private void dfs(Digraph g, int v) {
        marked[v] = true;
        for (int w : g.getEdge(v)) {
            if (!marked[w]) {
                dfs(g, w);
                edgeTo[w] = v;
            }
        }
    }

    public boolean visited(int vertex) {
        return marked[vertex];
    }
}
