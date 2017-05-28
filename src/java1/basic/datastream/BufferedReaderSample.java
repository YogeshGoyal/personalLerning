/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.datastream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yokukuma
 */
public class BufferedReaderSample {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr;
        isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.err.println("give first value: ");
        String s1 = br.readLine();
        System.err.println("give second value: ");
        String s2 = br.readLine();
        
        //int a = Integer.parseInt(s1);
        float a = Float.parseFloat(s1);
        float b = Float.parseFloat(s2);
        float c  = a + b ;
        System.out.println("sum is: "+c);
        
        File f = new File("/tmp/file/txt");
        FileReader fr = new FileReader(f);
        BufferedReader br1 = new BufferedReader(fr);
        
        
        
    }
}
