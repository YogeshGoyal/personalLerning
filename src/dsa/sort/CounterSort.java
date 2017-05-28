/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

/**
 *
 * @author yokukuma
 */
public class CounterSort {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 4, 3, 4, 2, 1,7, 2, 2, 3,7, 4, 2,0 ,0,10};
        System.out.println("before sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("After sort");
        arr = counterSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }

    private static Integer[] counterSort(Integer[] arr) {
        Integer[] aux = new Integer[arr.length];
        
        for (int i = 0; i < aux.length; i++) {
            aux[i] =0;
        }
        
        for (int i = 0; i < arr.length; i++) {
            ++aux[arr[i]];
        }
        
        for (int i = 1; i < arr.length; i++) {
            aux[i] = aux[i] + aux[i-1];
        }
        Integer[] b  = new Integer[arr.length];
        for (int i = arr.length -1 ; i >= 0; i--) {
            b[--aux[arr[i]]] = arr[i]; 
        }
        return b;
    }
}
