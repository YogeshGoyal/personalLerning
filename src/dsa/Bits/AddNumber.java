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
public class AddNumber {
    public static void main(String[] args) {
        char[] arr1 = "10111".toCharArray();
        char[] arr2 = "10101".toCharArray();
        System.out.println("sum"+ sumofBinaryNumber(arr1,arr2));
        //int out = addTwoNumberWithoutArithmaticOprator(-123,-456);
        int out = addTwoNumberWithoutArithmaticOpratorWithNegativeSupport(-123,-456);
        System.out.println("sum is: "+ out);
        System.out.println("binary equavalent: "+binaryEquivalane(19) );
    }

    private static Integer sumofBinaryNumber(char[] arr1, char[] arr2) {
        int index1 = arr1.length-1;
        int index2 = arr2.length-1;
        int index =0;
        int carry=0;
        int result=0;
        while(index1 >= 0  && index2 >= 0 ){
            int r1= arr1[index1]-'0';
            int r2= arr2[index2]-'0';
            result = result | (r1^r2^carry)<<index;
            index1--;
            index2--;
            index++;
            carry = r1 & carry | r2 & carry | r1 & r2;
        }
        while(index1 >= 0){
            int r1= arr1[index1]-'0';
            result = result | (r1^carry)<<index;
            index1--;
            index++;
            carry = r1 & carry ;
        }
        while(index2 >= 0){
            int r2= arr2[index2]-'0';
            result = result | (r2^carry)<<index;
            index2--;
            index++;
            carry = r2 & carry ;
        }        
        
        return result;
    }

    private static int addTwoNumberWithoutArithmaticOprator(int num1, int num2) {
        int carry =0;
        int result =0;
        for(int i =0; i< 31; i++){
            int r1 = (num1 & 1<<i) != 0 ? 1 : 0;
            int r2 = (num2 & 1<<i) != 0 ? 1 : 0;
            result = result | (r1^r2^carry)<<i; 
            if((r1 & r2) != 0 || (r1 & carry) != 0 || (r2 & carry) != 0){
                carry = 1;
            }else{
                carry = 0;
            }
        }
        return result;
    }

    private static int addTwoNumberWithoutArithmaticOpratorWithNegativeSupport(int a, int b) {
        if(b==0){
            return a;
        }
        int sum  = a^b;
        int carry = a&b<<1;
        return addTwoNumberWithoutArithmaticOpratorWithNegativeSupport(sum, carry);
    }
    
    public static void printResult(int num){
        for(int i= 1<<31; i !=0 ; i = i>>>1){
            if((num & i) > 0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
    }

    private static String binaryEquivalane(int out) {
        if(out>0){
            int a = out % 2;
            out = out/2;
            return a+ "" + binaryEquivalane(out);
        }
        return "";
    }
}
