/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import  java.io.IOException;


/**
 *
 * @author yokukuma
 */
public class Sample5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("D:\\personal\\work\\learning\\Networking_doc.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            System.err.println(line);
            line = br.readLine();
        }
        
    
        
    }
}


