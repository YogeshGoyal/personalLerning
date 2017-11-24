/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa2.misc;

/**
 *
 * @author yokukuma
 */
public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,6,7,10,9,2};
        int number = finddup(arr);
        System.out.println("duplicate number is:"+number);
    }

    private static int finddup(int[] arr) {
        int number=0;
        for(int i = 0;i<arr.length;i++){
            number = number + arr[i] -i;
        }
        return number;
    }
}
