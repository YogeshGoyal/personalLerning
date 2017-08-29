/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.advance_topic.serialization;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author yokukuma
 */
public class createSerialdemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Employee e1 = new Employee();
        e1.setId(56437);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\emp.ser")));
        oos.writeObject(e1);
        
    }
}
