/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.algorithm.UnionFind;

/**
 *
 * @author yokukuma
 */
public class LazyApproachQuickUnion {
private int[] arr;

    /**
     *
     * @param N
     */
    public LazyApproachQuickUnion(int N) {
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=i;
        }
    }
    
    /**
    *
    * method to check if there is connection exist between two points
    *
     * @param p
     * @param q
     * @return 
    */
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
    
    /**
     *
     * @param p
     * @param q
     */
    public void union(int p , int q){
        int ip = root(p);
        int iq = root(q);
        arr[ip] = iq;
    }   

    private int root(int p) {
        while(p!=arr[p]){
            p = arr[p];
        }
        return p;
    }
}
