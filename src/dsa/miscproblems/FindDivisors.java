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
public class FindDivisors {
    public static void main(String[] args) {
        findAlldivisorBootstap(20);
    }
    
    //bootstrap approach
    private static void findAlldivisorBootstap(int num) {
        for(int i =1 ; i<= num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    
}
