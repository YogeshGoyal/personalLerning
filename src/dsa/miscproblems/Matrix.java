/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.miscproblems;

/**
 *
 * @author yokukuma
 */
public class Matrix {

    public static void main(String[] args) {
        char[][] m = new char[5][4];
        int counter =0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = (char) ('a' + counter++);
            }
        }
        
        printDigonally(m);

    }

    private static int[][] multiply(int[][] m1, int[][] m2) {
        int[][] mul = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for(int k = 0; k < 2;k++){
                    mul[i][j] =  mul[i][j] + m1[i][k] * m2[k][j] ;
                }
            }
        }
        return mul;
    }

    private static void printDigonally(char[][] m) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(" "+ m[j][i]+" " );
            }
            System.out.println("");
        }
        
        for (int i = 3; i >= 0; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" "+ m[j][i]+" " );
            }
            System.out.println("");
        }
        
    }
}
