/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weighedUndirectedGraph;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class TesterUF {
    public static void main(String[] args) {
        //QuickFindUF ds = new QuickFindUF(10);
        QuickUnionUF ds = new QuickUnionUF(10);
        ds.union(0, 1);
        ds.union(3, 1); 
        ds.union(4, 2);
        ds.union(2, 6);
        ds.union(6, 9);
        ds.union(1, 7);
        System.out.println("check if connected:"+ ds.conncted(0, 1));
        System.out.println("check if connected:"+ ds.conncted(0, 2));
        
    }
}
