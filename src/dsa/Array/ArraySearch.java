/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.HashMap;

/**
 *
 * @author yokukuma
 */
public class ArraySearch {
    public static void main(String[] args) {
        subArraySumsZero();
        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int n = arr.length;
        int key = 6;
        int i = search(arr, 0, n-1, key);
        if (i != -1) 
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
    }

    private static int search(int[] arr, int lo, int hi, int key) {
        if(lo>hi){
            return -1;
        }
        int mid = (lo+hi)/2;
        if(arr[mid] == key){
            return mid;
        }
        
        /* If arr[l...mid] is sorted */
        if(arr[lo] <= arr[mid]){
            if (key >= arr[lo] && key <= arr[mid])
               return search(arr, lo, mid-1, key);
       
            return search(arr, mid+1, hi, key);
        }
        
             /* If arr[l..mid] is not sorted, 
           then arr[mid... r] must be sorted*/
        if (key >= arr[mid] && key <= arr[hi])
            return search(arr, mid+1, hi, key);
        
        
        return search(arr, lo, mid-1, key);
    }
    
    private static void subArraySumsZero()
{
    int [] seed = new int[] {1,2,3,4,-9,6,7,-8,1,9};
    int currSum = 0;
    HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
    for(int i = 0 ; i < seed.length ; i ++)
    {
        currSum += seed[i];
        if(currSum == 0)
        {
            System.out.println("subset : { 0 - " + i + " }");
        }
        else if(sumMap.get(currSum) != null)
        {
            System.out.println("subset : { " 
                                + (sumMap.get(currSum) + 1) 
                                + " - " + i + " }");
            sumMap.put(currSum, i);
        }
        else
            sumMap.put(currSum, i);
    }
    System.out.println("HASH MAP HAS: " + sumMap);
}
}
