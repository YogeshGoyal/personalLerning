/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class HeapSortDemo {
    public static void main(String[] args) {
                
        // below demo will convert given array in HEAP and then will sort it.
        Integer[] arr1 = {400,1, 3, 2, 1, 34, -2, 34, 12, 50};
        HeapSort.sort(arr1);
        
        for (Integer integer : arr1) {
            System.out.print(integer + " ");
        }
    }
}
