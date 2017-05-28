/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.misc;

import java.util.Random;

/**
 *
 * @author yokukuma
 */
public class GeneratePasswordAndOTP {
    public static void main(String[] args) {
        //here I am generating 10 digit passowrd.
        System.out.println(generateRandomPassword(10));
    }

    private static char[] generateRandomPassword(int len) {
        String values = "QWERTYUIOPASDFGHJKZXCVBNMqwertyuiopasdfghjklzxcvbnm!@#$%^&*()1234567890";
        char[] password = new char[len];
        Random random = new Random() ;
        for(int i =0;i < len; i++){
            char temp = values.charAt(random.nextInt(values.length()));
            password[i] = temp;
            System.out.println("char: "+ password[i]);
        }
        return password;
    }
    

    
}
