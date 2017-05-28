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
public class DepthFirstOrder {
private boolean[] marked;

    // below post order stack added for support of TOPLOGICAL SORTING
    private final Stack<Integer> postOrderStack;

    public DepthFirstOrder(Digraph g) {
        marked = new boolean[g.getSize()];
        
        for (int i = 0; i < g.getSize(); i++) {
            marked[i] = false;
        }
        postOrderStack = new Stack<>();
        
        for (int i = 0; i < g.getSize(); i++) {
            if (!marked[i]) {
                dfs(g, i);
            }
        }
        
    }
    
    private void dfs(Digraph g, int v) {
        marked[v] = true;
        for (int w : g.getEdge(v)) {
            if (!marked[w]) {
                dfs(g, w);
            }
        }
        postOrderStack.push(v);
    }
    
    public Stack<Integer> post(){
        return postOrderStack;
    }
    
    // return all vertices in reverst post order
    // reverse DFS postorder of DAG is topological order    
    public Stack<Integer> reversePost(){
        Stack<Integer> reversePostOrderStack = new Stack<>();
        
        for (Integer integer : postOrderStack) {
            reversePostOrderStack.push(integer);
        }
        
        return reversePostOrderStack;
    }
}
