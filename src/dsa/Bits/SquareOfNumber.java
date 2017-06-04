/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Bits;

/**
 *
 * @author yokukuma
 */
public class SquareOfNumber {
    public static void main(String[] args) {
        System.out.println("square of number: "+ sq(7));
    }
    public static int sq(int n){
        int i = n;
        int sq = 0;
        int count = 0;

        while(i > 0){
            if((i & 1) == 1){
                sq += n << count;
            }

            i = i >> 1;
            count++;
        }

        return sq;
    }
    
}
