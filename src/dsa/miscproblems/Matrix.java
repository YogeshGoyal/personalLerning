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
        int size = 2;
        int[][] m1 = new int[size][size];
        int[][] m2 = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m1[i][j] = i + j;
                m2[i][j] = 2 * i + 2 * j;
            }
        }
        int[][] mul = multiply(m1, m2);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mul[i][j] + "\t");
            }
            System.out.println("");
        }
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
}
