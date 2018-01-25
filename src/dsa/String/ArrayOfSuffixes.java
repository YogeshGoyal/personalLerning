/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.String;

/**
 *
 * @author yokukuma
 */
public class ArrayOfSuffixes {
    public static void main(String[] args) {
        long startTime1 = System.nanoTime();
        String[] suffix = suffixesUsingString("yogesh dgrg fdg ds g dsg s dg yogesh dgrg  fdg ds g dsg s dg");
//        for (String string : suffix) {
//            System.out.println(string);
//        }
        long endTime1 = System.nanoTime();
        long duration1 = endTime1-startTime1;
        System.out.println("total duration with string:"+ duration1);
        System.out.println("\n=======second implemation=======\n");
        
        long startTime2 = System.nanoTime();
        String[] suffix2 = suffixesUsingStringBuffer("yogesh dgrg  fdg ds g dsg s dg yogesh dgrg  fdg ds g dsg s dg");
//        for (String string : suffix2) {
//            System.out.println(string);
//        }
        long endTime2 = System.nanoTime();
        long duration2 = endTime2-startTime2;
        System.out.println("total duration with string builder:"+ duration2);
        System.out.println("common prefix: "+ longestCommonPrefix("yogesh", "yogi"));
    }
    
    public static String[] suffixesUsingString(String s){
        int len = s.length();
        String[] strArr = new String[len];
        for (int i = 0; i < len; i++) {
            strArr[i] = s.substring(i, len);
        }
        return strArr;
    }

    private static String[] suffixesUsingStringBuffer(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        String[] strArr = new String[len];
        for (int i = 0; i < len; i++) {
            strArr[i] = sb.substring(i, len);
        }
        return strArr;
    }
    
    private static int longestCommonPrefix(String str1,String str2){
        int len = Math.min(str1.length(), str2.length());
            for (int i = 0; i < len; i++) {
                if(str1.charAt(i)!= str2.charAt(i)){
                    return i;
                }
            }
            return len;
    }
}

