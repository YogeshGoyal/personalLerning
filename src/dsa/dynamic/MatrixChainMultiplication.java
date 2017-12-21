/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.dynamic;

/**
 *
 * @author yokukuma
 */
public class MatrixChainMultiplication {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 3};
        //int minMul = findCostRecursive(arr, 1, arr.length - 1);
        int minMul = findCostTabular(arr);
        System.out.println("matrix mul cose:" + minMul);
    }

    // below is recursive solution 
    // below solution is having both property fulfilled ment for dynamic programming solution
    // optimal subroutine,overlapping subroutine
    private static int findCostRecursive(int[] arr, int i, int j) {
        if (i == j) {
            return 0;
        }
        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int count = findCostRecursive(arr, i, k) + findCostRecursive(arr, k + 1, j)
                    + arr[i - 1] * arr[k] * arr[j];
            if (count < min) {
                min = count;
            }
        }
        return min;
    }

    // below is bottom up pproach or tabular approach of dynami programming
    private static int findCostTabular(int[] arr) {
        int temp[][] = new int[arr.length][arr.length];
        int q = 0;
        for (int l = 2; l < arr.length; l++) {
            for (int i = 0; i < arr.length - l; i++) {
                int j = i + l;
                temp[i][j] = 1000000;
                for (int k = i + 1; k < j; k++) {
                    q = temp[i][k] + temp[k][j] + arr[i] * arr[k] * arr[j];
                    if (q < temp[i][j]) {
                        temp[i][j] = q;
                    }
                }
            }
        }
        return temp[0][arr.length - 1];
    }

}
