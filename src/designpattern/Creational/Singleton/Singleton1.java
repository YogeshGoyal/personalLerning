/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.Singleton;

/**
 *
 * @author yokukuma
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){
        
    }
    
    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
    
    public void hello(){
        System.out.println("hello from singleton class 1");
    }
}
