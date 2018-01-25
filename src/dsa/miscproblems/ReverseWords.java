/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.miscproblems;

import java.util.Stack;

/**
 *
 * @author yokukuma
 */
public class ReverseWords {
    public static void main(String[] args) {
        String intialString = "i.like.this.india";
        // this program should reverst weord vise
        // out put of input "i.like.this.india" should be "india.this.like.i"
        System.out.println(reverseWords(intialString));
    }

    private static String reverseWords(String intialString) {
        
        Stack<String> stack = new Stack<>();
        String[] out = intialString.split("\\.");
        for (String string : out) {
            stack.add(string);
        }
        String finalString="";
        for (String string : stack) {
            finalString = finalString +  string+ ".";
        }
        
        
        
        
        
        return finalString.substring(0,finalString.length()-1);
    }
}


