/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

/**
 *
 * @author yokukuma
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,7,4,3,2,3,4,5};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("completed");
        rortateArray(arr,3);
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("completed");
    }

    private static void rortateArray(int[] arr, int rotateCount) {
        reverseArray(arr,0,rotateCount-1);
        reverseArray(arr,rotateCount+1,arr.length-1);
        reverseArray(arr,0,arr.length-1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int endPoint = end;
        for (int i = start; i < end; i++) {
            if(i < endPoint){
                int temp = arr[i];
                arr[i] = arr[endPoint];
                arr[endPoint] = temp;
                endPoint--;
            }
        }
    }
    
            
}
