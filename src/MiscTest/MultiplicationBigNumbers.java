/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

/**
 *
 * @author yokukuma
 */
public class MultiplicationBigNumbers {

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "123";
        System.err.println("Mupliplication is: "+ multiply(num1,num2));
    }

    private static char[] multiply(String n1, String n2) {
        char[] num1 = n1.toCharArray();
        char[] num2 = n2.toCharArray();
        
        int len1 = num1.length;
        int len2 = num2.length;
        char[] out = new char[len1+len2];
        
        int o1 =0;
        int o2 = 0;
        
        for(int i = len1-1;i> 0;i--){
            char[] temp = new char[len1+1];
            int reminder = 0;
            int m1 = num1[i] - '0';
            for(int j = len2-1;j>0;j--){
                int m2 = num2[j] - '0';
                int mul = m1 * m2 + reminder + out[01+02];
                out[j] = (char)((char)mul/10);
                reminder = mul % 10;
            }
            
        }
                
                
                
        return out;
        
    }

}
