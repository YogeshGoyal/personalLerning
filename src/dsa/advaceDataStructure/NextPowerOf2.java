/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.advaceDataStructure;

/**
 *
 * @author yokukuma
 */
public class NextPowerOf2 {

    public int nextPowerOf2(int num) {
        if(num ==0){
            return 1;
        }
        if( num>0 && (num & (num-1)) == 0){
            return num;
        }
        
        while( (num & num-1) > 0){
            num = num & num-1;
        }
        
        return num<<1;
    }
    
    public static void main(String[] args) {
        NextPowerOf2 n = new NextPowerOf2();
        int num = n.nextPowerOf2(33);
        System.out.println(num);
    }
    
}
