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
public class ConnectedComponent {
    private boolean[] marked;
    private int[] id;
    private int countComponent;
    public ConnectedComponent(AdjacencyUndirectedGraph g) {
        marked = new boolean[g.getSize()];
        id = new int[g.getSize()];
        
        
        for (int i = 0; i < g.getSize(); i++) {
            if(!marked[i]){
                dfs(g,i);
                countComponent++;
            }
        }
    }

    private void dfs(AdjacencyUndirectedGraph g, int v) {
        marked[v] = true;
        id[v] = countComponent;
        for (int w : g.getEdge(v)) {
            if (!marked[w]) {
                dfs(g, w);
            }
        }
    }    
    
    public int TotalComponent(){
        return countComponent;
    }
    
    public int id(int v){
        return id[v];
    }
    
    public boolean isConnected(int v, int w){
        return id(v) == id(w);
    }
}
