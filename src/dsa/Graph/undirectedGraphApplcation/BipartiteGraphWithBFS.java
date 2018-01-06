/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.undirectedGraphApplcation;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author yokukuma 
 * Bipartite Graph is a graph whose vertices can be divided
 * into two independent sets, U and V such that every edge (u, v) either
 * connects a vertex from U to V or a vertex from V to U. In other words, for
 * every edge (u, v), either u belongs to U and v to V, or u belongs to V and v
 * to U. We can also say that there is no edge that connects vertices of same
 * set.
 *
 * This solution worked only if graph is strongly connected
 */
public class BipartiteGraphWithBFS {

    private boolean[] marked;
    private int[] color;
    private int s;

    public BipartiteGraphWithBFS(AdjacencyUndirectedGraph g, int s) {
        this.s = s;
        marked = new boolean[g.getSize()];

        color = new int[g.getSize()];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
            marked[i] = false;
        }
    }

    public boolean isBiPartite(AdjacencyUndirectedGraph g, int source) {
        for (int i = 0; i < g.getSize(); i++) {
            if(color[i] == -1){
                if(isBiPartiteUtil(g,i) == false){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isBiPartiteUtil(AdjacencyUndirectedGraph g, int source) {
        Queue<Integer> queue = new ArrayDeque();
        queue.add(source);

        marked[source] = true;
        color[source] = 1;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            for (int w : g.getEdge(v)) {

                //if adjacent vertes not colored color it with different color as of node itself
                if (color[w] == -1) {
                    queue.add(w);
                    marked[w] = true;
                    color[w] = 1 - color[v];
                } else {
                    // if color are already node then check if both are same color or not
                    if (color[w] == color[v]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
