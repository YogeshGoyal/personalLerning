/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.decorator.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\designpattern\\decorator\\io\\test.txt"))));
            
            while( (c = in.read()) >= 0){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
