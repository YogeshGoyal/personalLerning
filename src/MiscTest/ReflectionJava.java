/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

/**
 *
 * @author yokukuma
 */
public class ReflectionJava {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        MultiThreading mt = new MultiThreading();
        System.out.println(mt.getClass().toString());
        
        Class c = Class.forName("MiscTest.MultiThreading");
        MultiThreading mt2 = (MultiThreading)c.newInstance();
        //mt2.deadlock();
    }
}
