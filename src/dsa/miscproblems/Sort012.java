/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.miscproblems;

/**
 *
 * @author yokukuma
 */
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,1,0,2,1,2,0,1,2};
        sort012(arr,arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sort012(int[] arr, int length) {
        int lo = 0;
        int hi = length-1;
        int mid = 0;
        while(mid<=hi){
            switch(arr[mid]){
                case 0:
                {
                    int temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    lo++;
                    break;
                }
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    int temp = arr[hi];
                    arr[hi] = arr[mid];
                    arr[mid] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
}
