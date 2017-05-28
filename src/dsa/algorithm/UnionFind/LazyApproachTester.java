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
public class LazyApproachTester {
    public static void main(String[] str){
        LazyApproachQuickUnion uf = new LazyApproachQuickUnion(20);
        uf.union(2, 4);
        uf.union(1, 4);
        uf.union(3, 4);
        
        if(uf.connected(2, 4)){
            System.out.println("connected");
        }
    }
    
}
