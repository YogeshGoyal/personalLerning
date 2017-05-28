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
public class HeapSort {
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int k = N/2; k >= 1; k--){
            sink(a,k,N);
        }
        
        while(N>1){
            exchange(a, 1, N--);
            sink(a,1,N);
        }
        
    }

    private static void sink(Comparable[] a, int k, int N){
        while(2*k <= N){
            int j = 2*k;
            if(j<N && less(a, j,j+1))j++;
            if(!less(a, k,j)){
                break;
            }
            exchange(a, k, j);
            k = j;
        }
    }
    // ideally heapsort start from index 1 but this is already existing array which start from 0. 
    // so we are handling situation accordingly
    private static boolean less(Comparable[] a, int i, int j){
        return a[i-1].compareTo(a[j-1]) < 0 ;
    }
    private static void exchange(Comparable[] a, int i, int j){
        Comparable temp = a[j-1];
        a[j-1] = a[i-1];
        a[i-1] = temp;
    }
}
