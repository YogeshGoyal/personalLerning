/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.algorithm;

/**
 *
 * @author yokukuma
 */
public class Palindrom {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        System.out.println("length of longest palindrom: "+ longestlengrthPalindrom(str,0,str.length()-1));
    }

    private static int longestlengrthPalindrom(String str,int start,int end) {
        if( start == end){
            return 1;
        }
        else if(str.charAt(start) == str.charAt(end) && (start+1 == end)){
            return 2;
        }
        if(str.charAt(start) == str.charAt(end)){
            return longestlengrthPalindrom(str, start+1, end-1)+2;
        }else{
            return Integer.max(longestlengrthPalindrom(str, start, end-1),longestlengrthPalindrom(str, start+1, end));
        }
    }
}
