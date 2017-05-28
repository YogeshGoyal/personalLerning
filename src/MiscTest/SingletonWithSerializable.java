/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author yokukuma
 */
public class SingletonWithSerializable {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        SingletonA instance1 = SingletonA.getInstance();
        instance1.show();
        
        
        // Serialize and deserialize testing in case of Singleton , which can be soved by adding readResolve method in singleton class
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\SerializableSample.ser")));
//        oos.writeObject(instance1);
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\SerializableSample.ser")));
//        SingletonA instance2 = (SingletonA)ois.readObject();
//        instance2.show();
//        
        

        // Delegate way to create instance of Singleton class.
        Constructor<SingletonA> constructor = SingletonA.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        SingletonA instance2 = constructor.newInstance(new Object[0]);
        
        if(instance1 == instance2){
            System.out.println("both are pointing to same location");
        }else{
            System.out.println("both are not same");
        }
        
        
        SingletonB instance11 = SingletonB.INSTANCE;
        instance11.show();
        // Enum implemantation of Singleton is Serializable safe without any extra work
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\SerializableSample.ser")));
//        oos.writeObject(instance11);
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\SerializableSample.ser")));
//        SingletonB instance12 = (SingletonB)ois.readObject();
//        instance12.show();


        // Delegate way to create instance of Singleton class.
        SingletonB instance12 = null;
        SingletonB[] constructor1 = SingletonB.class.getEnumConstants();
        for (SingletonB singletonB : constructor1) {
            instance12 = singletonB.INSTANCE;
        }
       
        if(instance11 == instance12){
            System.out.println("both are pointing to same location for Enum");
        }else{
            System.out.println("both are not same for Enum");
        }
        
        
    }
}

// below class is not delegate safe bu after adding readResolve it becoming serializable safe.
class SingletonA implements Serializable{
    
    private SingletonA() {
    }
    static class Helper{
        static final SingletonA INSTANCE = new SingletonA();
    }
    
    static public SingletonA getInstance(){
        return Helper.INSTANCE;
    }
    
    public void show(){
        System.out.println("Hello Finally i am Singleton");
    }
    
    protected Object readResolve() {
        return getInstance();
    }
}

// Singleton created with Enum are Delegate safe and also Serilizable safe.
enum SingletonB implements Serializable{
    INSTANCE;

    public void show(){
        System.out.println("Hello Finally i am Singleton with Enum");
    }
}