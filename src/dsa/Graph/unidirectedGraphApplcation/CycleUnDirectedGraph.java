/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.unidirectedGraphApplcation;

/**
 *
 * @author yokukuma
 */
public class CycleUnDirectedGraph {

    private final boolean[] marked;
    private final boolean[] visited;

    public CycleUnDirectedGraph(AdjacencyUndirectedGraph g) {
        this.marked = new boolean[g.getSize()];
        this.visited = new boolean[g.getSize()];

        for (int i = 0; i < g.getSize(); i++) {
            marked[i] = false;
            visited[i] = false;
        }
    }

    public boolean isCycleExist(AdjacencyUndirectedGraph g) {
        for (int i = 0; i < g.getSize(); i++) {
            if ((marked[i] == false) && isCycleExistUtil(g, i, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCycleExistUtil(AdjacencyUndirectedGraph g, int i, int last) {
        visited[i] = true;
        marked[i] = true;
        for (int w : g.getEdge(i)) {
            if (visited[w] == true && w != last) {
                return true;
            }
            if (!marked[w]) {
                if (isCycleExistUtil(g, w, i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
