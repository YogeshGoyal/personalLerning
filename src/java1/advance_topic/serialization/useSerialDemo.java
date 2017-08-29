/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.advance_topic.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java1.advance_topic.serialization.Employee;

/**
 *
 * @author yokukuma
 */
public class useSerialDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\emp.ser")));
        Employee e2 = (Employee)ois.readObject();
        System.out.println(e2.getId());
    }
}
