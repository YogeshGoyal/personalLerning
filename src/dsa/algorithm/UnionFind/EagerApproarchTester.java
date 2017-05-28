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
public class EagerApproarchTester {

    /**
     *
     * @param str
     */
    public static void main(String[] str){
        EagerApproachQuickFind uf = new EagerApproachQuickFind(20);
        uf.union(2, 4);
        uf.union(1, 4);
        uf.union(3, 4);
        
        if(uf.connected(5, 4)){
            System.out.println("connected");
        }
    }
}
