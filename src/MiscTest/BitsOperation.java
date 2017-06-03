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
public class BitsOperation {
    public static void main(String[] args) {
        int number = 1024;
        System.out.println(number+" is power of 2:" + isPowerOfTwo(number));
        int[] arr= {1,2,3};
        printAllSubset(arr);
        printAllCombinationofString("ABC");
    }

    // function to check if given number is power of 2 or not.
    private static Boolean isPowerOfTwo(int x) {
        int out = x & (x - 1);
        if(out == 0){
            return true;
        }
        return false;
    }
    
    // function to print all possible subset
    private static void printAllSubset(int[] arr){
        int len = arr.length;
        int loop_count = (int) Math.pow(2,len);
        
        for(int j =0;j<loop_count;j++){
            for(int i = 0; i< len;i++){
                int out = j & (1 << i);
                if(out == 0){
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
    }
    
    public static void printAllCombinationofString(String str){
        printAllCombinationofString("", str);
    }

    // print all combination of String
    private static void printAllCombinationofString(String prefix, String str) {
        if(str.length() == 0 ){
            System.out.println(prefix);
        }
        
        for(int i =0 ;i< str.length();i++){
            printAllCombinationofString(prefix+ str.charAt(i), str.substring(0, i)+ str.substring(i+1, str.length()));
        }
    }
}
