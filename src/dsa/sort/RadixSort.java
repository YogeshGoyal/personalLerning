/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class RadixSort {
    
    public static void main(String[] args) {
        int[] arr = {3,101,23,343,67,45,1,3,56,1001,23,4532,45,0};
        System.out.println("arr before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+ arr[i]+ " " );
        }
        System.out.println("");
        radixSort(arr);
        System.out.println("arr after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+ arr[i]+ " " );
        }
        System.out.println("");
        
    }

    public static void radixSort(int[] arr) {
        int max = getMAX(arr);
        for(int exp = 1;max/exp>0;exp*=10){
            countingSort(arr,exp);
        }
    }
    
    static private int getMAX(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }

    private static void countingSort(int[] arr, int exp) {
        int[] count = new int[10];
        int output[] = new int[arr.length];
        Arrays.fill(count, 0);
        for(int i=0;i<arr.length;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i< 10;i++){
            count[i] = count[i]+count[i-1];
        }
        for(int i= arr.length-1;i>0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
        
    }
            
}


