/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.miscproblems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class MissingNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,20));
        Integer[] arr2 = {1,2,3,4,5,6,7,89,0};
        Integer number = findMissingNumber(arr,arr.size()+1);
        System.out.println("missing number is: "+ number);
        Integer[] dulicateNumbers = duplicateNumbers(arr2);
        
        
        int[] intArr = new int[20];
        System.out.println("size od array is: "+ intArr.toString());
    }

    private static Integer findMissingNumber(ArrayList<Integer> arr, Integer number) {
        Integer sum = 0;
        for (Integer integer : arr) {
            sum+=integer;
        }
        System.out.println("number sum: "+ sum);
        Integer expectedSum = (number * (number+1 )) / 2 ;
        System.out.println("expected sum: "+ expectedSum);
        
        return expectedSum-sum;
    }

    private static Integer[] duplicateNumbers(Integer[] arr2) {
        
        return null;
    }
    
}
