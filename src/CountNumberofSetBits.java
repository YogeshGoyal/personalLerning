/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yokukuma
 */
public class CountNumberofSetBits {
    public static void main(String[] args) {
        int count = countSetBits(1024);
        System.out.println("count: "+ count);
    }

    private static int countSetBits(int num) {
        if(num>0){
            if(num % 2 == 0){
                return countSetBits(num/2);
            }else{
                return 1 +countSetBits(num/2);
            }
        }
        return 0;
    }
}
