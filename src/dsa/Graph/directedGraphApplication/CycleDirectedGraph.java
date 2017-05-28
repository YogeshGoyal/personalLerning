/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.directedGraphApplication;

import dsa.Graph.directedGraphApplication.Digraph;

/**
 *
 * @author yokukuma
 */
public class CycleDirectedGraph {

    // white boolean are for all new vertex, grey for during processing single vertex
    // black is for all vertix which is not having any neighbour to look up
    private boolean white[];
    private boolean grey[];
    private boolean black[];

    CycleDirectedGraph(Digraph g) {
        this.white = new boolean[g.getSize()];
        this.grey  = new boolean[g.getSize()];
        this.black = new boolean[g.getSize()];
    }

    public boolean isCycleExist(Digraph g) {
        
        // make flag true for all vertex in white array
        for (int i = 0; i < g.getSize(); i++) {
            white[i] = true;
        }
        
        for (int i = 0; i < g.getSize(); i++) {
            if( (white[i] == true) && isCycleExistUtil(g,i)){
                return true;
            }
        }
        return false;
    }

    private boolean isCycleExistUtil(Digraph g, int current) {
        // make current vertix pointer false in white and true in grey
        white[current] = false;
        grey[current]  = true;
        
        for (int w : g.getEdge(current)) {
            
            // if current vertex is true in black means all node visited for that vertex no need to call again
            if(black[w] == true){
                continue;
            }
            
            // if entry already exist in grey set means its alreay occur , means cycle exist
            if(grey[w] == true){
                return true;
            }
            
            if(isCycleExistUtil(g, w)){
                return true;
            }
        }
        // move vertex from grey to black set when done exporing
        grey[current]  = false;
        black[current] = true;
        return false;
    }
}
