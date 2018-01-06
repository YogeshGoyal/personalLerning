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
public class SelectionDemo {

    public static void main(String[] args) {
        Integer[] arr = {20, 24, 5, 6, 9, 7, 3, 12, 19, 17,1,3,5,7,5,3,2,20};

        //below example will return k element of sorted array
        Comparable out = Selection.select(arr,11);
        System.out.println("7th element is: " + out);

        //QuickSort qs = new QuickSort();
        //qs.sort(arr);
        System.out.println("\nAfter sort");
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}
