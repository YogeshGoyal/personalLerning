/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author yokukuma
 */
public class SerializableSample {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        EmployeeClass es = EmployeeClass.getInstance();
        es.show();
        es.setId(1);
        es.setName("yogesh kumar"); 
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\SerializableSample.ser")));
        oos.writeObject(es);
        
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\SerializableSample.ser")));
        
        EmployeeClass out = (EmployeeClass)ois.readObject();
        System.out.println("values after reading are: "+ out.getName()+ "  "+ out.getId());
        
        
        
    }
}


class EmployeeClass implements Serializable{
    private String name;
    private int id;
    private static EmployeeClass instance;
    public static EmployeeClass getInstance(){
        if(instance == null){
            return new EmployeeClass();
        }else{
            return instance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    
    
    void show(){
        System.out.println("I got a call");
    }
    
    private EmployeeClass() {
    }
    
}
