/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.util.regex.Matcher;

/**
 *
 * @author yokukuma
 */
public class test5 {
    public static void main(String[] args) {
        String name = "yogesh";
        name= name.replace('o', 'O');
        char[]  output = new char[name.length()];
        int j =0;
        for (int i = name.length()-1; i >= 0; i--) {
            output[j] = name.charAt(i);
            j++;

        }
        String random = "this iline contain mail yogeshgoyal@gmail.com in middle something";
        String[] arr = random.split(" \\s*[a-zA-Z@]+\\s* ");
        for (String string : arr) {
            System.out.println(string);
        }
        
        //System.out.println(name);
        //System.out.println(output);
    }
}
