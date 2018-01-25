/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.String;

import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class LongestRepeatedSubString {
    public static String lsp(String s){
        int N = s.length();
        String[] suffix = new String[N];
        
        // as we are using string array , so same string will be pointed by different suffix element
        
        for (int i = 0; i < N; i++) {
            suffix[i] = s.substring(i,N);
        }
        
        Arrays.sort(suffix);
        
        // find longest common prefix in sorted string array,
        String lrs ="";
        for (int i = 0; i < N-1; i++) {
            int len = lcp(suffix[i],suffix[i+1]);
            if(len>lrs.length()){
                lrs = suffix[i].substring(0,len);
            }
        }
        return lrs;
    }

    private static int lcp(String s1, String s2) {
        int len = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s2.charAt(i) == s1.charAt(i)){
                len++;
            }else{
                break;
            }
        }
        return len;
    }
    
    public static void main(String[] args) {
        String sample = "this is yogesh kumat goya  also known as yoge egeg ";
        System.out.println(lsp(sample));
        
    }

}
