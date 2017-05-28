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
public class sortDemo {

    public static void main(String[] args) {
        Integer[] arr1 = {400,1, 3, 2, 1, 34, -2, 34, 12, 50};
        MergeSort ms = new MergeSort();
        System.out.println("before sorting");
        for (Integer integer : arr1) {
            System.out.print(integer + " ");
        }
        //ms.sort(arr1);
        //ms.bottomUpMergeSort(arr1);
        QuickSort qs = new QuickSort();
        //qs.sort(arr1);
        qs.sortDikstra3way(arr1);
        System.out.println("\nAfter sort");
        for (Integer integer : arr1) {
            System.out.print(integer + " ");
        }
    }
}
