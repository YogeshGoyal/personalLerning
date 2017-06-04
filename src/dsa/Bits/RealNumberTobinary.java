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
public class RealNumberTobinary {
    public static void main(String[] args) {
        printBinary(0.125);
        printBinary(0.8125);
        printBinary(0.72);
    }

    private static void printBinary(double num) {
        if(num <0 || num >1){
            System.out.println("ERROR");
            return ;
        } 
        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        while(num>0){
            num=  num*2;
            int r = (int)num;
            sb.append(r);
            num = num-r;
            if(sb.length() > 32){
                System.out.println("ERORR");
                return;
            }
        }
        System.out.println(sb);
    }
}
