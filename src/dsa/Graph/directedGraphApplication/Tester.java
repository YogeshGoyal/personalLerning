/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.directedGraphApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class Tester {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\dsa\\Graph\\graph.txt");
        Scanner sc = new Scanner(new FileReader(file));
        System.err.println("Enter number of vertices. ");
        int countOfVertices = sc.nextInt();
        Digraph am = new Digraph(countOfVertices);

        System.out.println("Number of edge you want");
        int edges = sc.nextInt();
        for (int i = 0; i < edges; i++) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            am.makeEdge(row, column);
        }

        am.printList();
        
        DirectedDFS dfs = new DirectedDFS(am, 0);
        if(dfs.visited(2)){
            System.out.println("2 is part of directed dfs starting from 0");
        }
        
        Topological topological = new Topological(am);
        for (Object integer : topological.order()) {
            System.out.println(" "+ integer+ " " );
        }

        KosarajuSharirSCC cc = new KosarajuSharirSCC(am);
        
        System.out.println("total connected compoenent are: "+ cc.count());
        
        

        // compute list of vertices in each strong component
        Queue<Integer>[] components = (Queue<Integer>[]) new Queue[cc.count()];
        for (int i = 0; i < cc.count(); i++) {
            components[i] = new LinkedList<Integer>();
        }
        for (int v = 0; v < am.V(); v++) {
            components[cc.id(v)].add(v);
        }

        // print results
        for (int i = 0; i < cc.count(); i++) {
            for (int v : components[i]) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
        
    }
}
