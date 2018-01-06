/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

import static dsa.sort.RadixSort.radixSort;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yokukuma
 */
public class BucketSort {

    public static void main(String[] args) {
        double[] arr = {1.23, 0, 34, 0, 76, 0, 45, 0.97, 0.12};
        System.out.println("arr before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("");
        radixSort(arr);
        System.out.println("arr after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("");

    }

    private static void radixSort(double[] arr) {
        HashMap<Integer,ArrayList<Double>> map = new HashMap<>();
        
        
    }

}
