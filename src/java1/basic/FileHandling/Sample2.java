/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class Sample2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("D:/personal/work/learning/java_basic.txt");

//        //Read file using BufferedReader        
//          FileReader fr = new FileReader(f);
//        BufferedReader br = new BufferedReader(fr);
//        String line = br.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br.readLine();
//        }
//        br.close();

        //Read fileusing fileReader
        FileReader fr = new FileReader(f);
        int buf = fr.read();
        while (buf != -1) {
            char c = (char) buf;
            System.out.print(c);
            buf = fr.read();
        }
        fr.close();

//        // read byte by byte using fileinuptstream
//        FileInputStream fis = new FileInputStream(f);
//        int buf = fis.read();
//        while (buf != -1) {
//            char c = (char)buf;
//            System.out.print(c);
//            buf = fis.read();
//        }
//        fis.close();

    }
}
