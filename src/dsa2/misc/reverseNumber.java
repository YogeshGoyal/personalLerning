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
public class reverseNumber {
    public static void main(String[] args) {
        int number = 23454;
        int reverseNumber = reverseNumber(number);
        System.out.println("reversed Number: "+ reverseNumber);
    }

    private static int reverseNumber(int number) {
        int output=0;
        while(number != 0){
            output = output*10+ number%10;
            number = number/10;
        }
        return output;
    }
}
