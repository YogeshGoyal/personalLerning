/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph;

import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class AdjacencyMatrix {
    final int vertices;
    private int[][] adjacencyMatrix;
    
    public AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices+1][vertices+1];
    }
    
    void makeEdge(int from, int to, int weight){
        adjacencyMatrix[from][to] = weight;
    }
    
    int getEdge(int from,int to){
        return adjacencyMatrix[from][to];
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number of vertices. ");
        int countOfVertices = sc.nextInt();
        AdjacencyMatrix am = new AdjacencyMatrix(countOfVertices);
        
        System.out.println("Number of edge you want");
        int edges = sc.nextInt();
        
        for(int i =0;i< edges;i++){
            int row = sc.nextInt();
            int column = sc.nextInt();
            am.makeEdge(row, column,1);
        }
        
        System.out.println("Adjancency matrix is: ");
        
        am.printMatrix();
        
        
    }

    public void printMatrix() {
        for(int i =0 ;i <= vertices; i++){
            for(int j = 1; j<= vertices; j++){
                System.out.print("\t" + getEdge(i, j));
            }
            System.out.println("");
        }
    }
}
