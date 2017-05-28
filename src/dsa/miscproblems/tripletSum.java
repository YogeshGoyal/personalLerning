/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.miscproblems;

import java.util.Collections;
import java.util.Random;

/**
 *
 * @author yokukuma
 */
public class tripletSum {

    public static void main(String[] args) {

        int count = 12;
        int starting_range = 10;
        int end_range = 20;
        int[] arr2 = generateRandomNumber(count, starting_range, end_range);

        System.out.println("Sorted array before: ");
                for (int i : arr2) {
            System.out.print(i + " ");
        }
                
        System.out.println("Sorted array is: ");
        InsertionSort(arr2);
        
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int[] arr = {12, 3, -3, 6, 2, 3, 1, 7, 8, 2, 4};
        int sum = 12;
        printAlltripletBootStrap(arr, sum);

        System.out.println("second solution");
        //printAlltriplet1(arr, sum);
    }

    private static void printAlltripletBootStrap(int[] arr, int sum) {
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            for (int j = i + 1; j < arrLen; j++) {
                for (int k = j + 1; k < arrLen; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("triplets are: " + arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    private static void printAlltriplet1(int[] arr, int sum) {

    }

    private static int[] generateRandomNumber(int count, int starting_range, int end_range) {
        int[] temp = new int[count];
        Random ran = new Random();
        for (int i = 0; i < count; i++) {
            temp[i] = ran.nextInt(starting_range) + end_range - starting_range;
        }
        return temp;
    }

    private static void SelectionSort(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[i]) {
                    index = j;
                }
            }
            int temp = arr2[i];
            arr2[i] = arr2[index];
            arr2[index] = temp;
        }
    }

    private static void InsertionSort(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr2[j] < arr2[j-1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j-1];
                    arr2[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

}

class Student<ITEM> implements Comparable<ITEM> {

    @Override
    public int compareTo(ITEM o) {

        return 0;
    }

}
