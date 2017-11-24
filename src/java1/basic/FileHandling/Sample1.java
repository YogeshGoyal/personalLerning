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
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class Sample1 {
    public static void main(String[] args) throws IOException {
        
//        try {
//            File fs = new File("D:\\personal\\work\\learning\\java_basic.txt");
//            BufferedReader br = new BufferedReader(new FileReader(fs));
//            String line = br.readLine();
//            while(line != null){
//                System.out.println(line);
//                line = br.readLine();
//            }
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Sample1.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        Scanner sc2 = new Scanner(new FileReader(new File("D:\\personal\\work\\learning\\java_basic.txt") ));
        PrintWriter pw = new PrintWriter(new File( "C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\java1\\basic\\FileHandling\\1.txt") );
        while(sc2.hasNextLine()){
            String line = sc2.nextLine();
            pw.write(line+ "\n");
            System.out.println(line);
        }
        pw.close();
        sc2.close();
    }
}
