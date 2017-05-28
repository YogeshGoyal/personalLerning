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
public class BinaryProcessing {
    public static void main(String[] args) {
        int number =  -1234564;        
        System.out.println(printBinaryEquivalance(number));
        
    }

    private static char[] printBinaryEquivalance(int number) {
        char buf[] = new char[32];
        boolean isNegative = false;
        int duplicate;
        // if number is negative convert to positive and marked numver as negative
        if(number < 0){
            number = -(number);
            isNegative = true;
        }
        duplicate = number;
        int j = 31;
        for(int i = 0 ;  i < 32 ; i++){
            
            if(duplicate % 2 == 1){
                buf[j] = '1';
            }else{
                buf[j] = '0';
            }
            duplicate = duplicate/2;
            j--;
        }
        
        if(isNegative){
            for(int i = 0 ;  i < 32 ; i++){
                if(buf[i] == '0'){
                    buf[i]  = '1';
                }else{
                    buf[i]  = '0';
                }
            }
            
            if(buf[31] == '0'){
                buf[31] = '1';
            }else{
                for(int i =31;i > 0; i--){
                    if(buf[i] == '1'){
                        buf[i] = '0';
                    }else{
                        buf[i] = '1';
                        break;
                    }
                }
            }
        }
        return buf;
    }
}
