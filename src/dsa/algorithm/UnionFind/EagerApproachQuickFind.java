/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.algorithm.UnionFind;

import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class EagerApproachQuickFind {

    private int[] arr;

    /**
     *
     * @param N
     */
    public EagerApproachQuickFind(int N) {
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }
    }

    /**
     *
     * method to check if there is coneection exist between two points
     *
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return arr[p] == arr[q];
    }

    /**
     *
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pid = arr[p];
        int qid = arr[q];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pid) {
                arr[i] = qid;
            }
        }
    }
}
