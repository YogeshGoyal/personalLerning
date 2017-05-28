/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class SerialTest {
    public static void main(String[] args){
        SerialClass sc = new SerialClass();
        String filename = "test.ser";
        if(args.length > 0){
            filename = args[0];
        }
        
        // Write contnet to Serilaise file
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println(sc.getCurrDate().toString());
            oos.writeObject(sc);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SerialTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        // read content from serilaize file
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                SerialClass sc1 = (SerialClass)ois.readObject();
                System.out.println("File content of Serialize file: " + sc1.getCurrDate().toString());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SerialTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(SerialTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}
