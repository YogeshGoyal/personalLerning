/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.algorithm.threesum;

/**
 *
 * @author yokukuma
 */
public class ThreeSum {

    public static void main(String[] str) {
        ThreeSum ts = new ThreeSum();
//        int[] arr = arr[10]{30,-40,-20,-10,0,40,10,5};
        Integer[] arr = new Integer[]{30, -40, -20, -10, 0, 40, 10, 5};
        
        ts.threeSumNumber(arr);
    }

    public Integer threeSumNumber(Integer[] arr) {
        for(int i =0; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++){
                for(int k =j+1; k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        System.err.println("triplets are: "+ arr[i]+ " "+ arr[j]+ " "+ arr[k]);
                    }
                }
            }
        }
        return 0;
    }
}
