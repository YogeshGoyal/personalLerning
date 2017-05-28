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
public class LCM_GCD {
    public static void main(String[] args) {
        int output = gcd(20,300);
        System.out.println(output);
        System.out.println(lcm(12,34));
    }
    
    private static int gcd(int n1,int n2){
        //a is bigger number b is small.
        int a = n1>n2?n1:n2;
        int b = n1>n2?n2:n1;
        int r = a%b;
        while(r!=0){
            a = b;
            b = r;
            r = a%b;
        }
        return b;
    }
    
    private static int lcm(int n1, int n2){
        if(n1%n2==0){
            return n1;
        }
        return lcm(n1+n1,n2);
    }
}
