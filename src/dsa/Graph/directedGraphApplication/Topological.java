/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.directedGraphApplication;

import java.util.Stack;

/**
 *
 * @author yokukuma
 */
public class Topological {

    private Stack<Integer> order;  // topological order

    public Topological(Digraph G) {
        CycleDirectedGraph finder = new CycleDirectedGraph(G);
        if (!finder.isCycleExist(G)) {
            DepthFirstOrder dfs = new DepthFirstOrder(G);
            order = dfs.reversePost();
        }
    }
    
    /**
    * Returns a topological order if the digraph has a topologial order,
    */
    public Iterable<Integer> order() {
        return order; 
    }
}
