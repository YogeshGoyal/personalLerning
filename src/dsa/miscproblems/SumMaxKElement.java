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
public class SumMaxKElement {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k =4;
        findMaxSumSolution2(arr,k);
    }

    private static void findMaxSumSolution1(int[] arr, int k) {
        int max_Sum = Integer.MIN_VALUE;
        int size_arr = arr.length;
        for(int i =0; i < size_arr-k+1;i++){
            int current_sum = 0;
            for(int j=0; j<k; j++){
                current_sum = current_sum + arr[i+j];
            }
            if(current_sum > max_Sum){
                max_Sum =current_sum;
            }
        }
        
        System.out.println("Max Sum: "+ max_Sum);
    }
    
    private static void findMaxSumSolution2(int[] arr, int k) {
        int max_Sum = 0;
        int size_arr = arr.length;
        
        for(int i =0;i<k;i++){
            max_Sum = max_Sum + arr[i];
        }
        
        int nextMaxSum = max_Sum;
        for(int j = k; j < size_arr ; j++){
            nextMaxSum = nextMaxSum - arr[j-k]+arr[j];
            if(nextMaxSum > max_Sum){
                max_Sum = nextMaxSum;
            }
        }
        
        System.out.println("Max Sum: "+ max_Sum);
    }
}
