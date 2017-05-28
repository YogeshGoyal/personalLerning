/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weighedGraph;

/**
 *
 * @author yokukuma
 */
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for(int i =0; i< N; i++){
            id[i] = i;
        }
    }
    // union complexity for N element is 1
    public boolean conncted(int v, int w){
        return id[v]== id[w];
    }
    
    // union complexity for N element is N*N
    public void union(int v, int w){
        int vid = id[v];
        int wid = id[w];
        for(int i =0; i< id.length;i++){
            if(id[i] == vid){
                id[i] = wid;
            }
        }
    }
    
    
}
