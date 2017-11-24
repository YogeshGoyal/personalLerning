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
public class reverseString {
    public static void main(String[] args) {
        String str = reverseString("yogesh");
        System.out.println("revsred string is: "+ str);
    }

    private static String reverse="";
    private static String reverseString(String str) {
        if(str.length() == 1){
            return str;
        }else{
            reverse = reverse + str.charAt(str.length()-1) +
                    reverseString(str.substring(0, str.length()-1));
            return reverse;
        }
    }
}
