/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.java8;

/**
 *
 * @author yokukuma
 */
public class InterfaceDemo2 {
    public static void main(String[] args) {
        //InterfaceSample ifs = new InterfaceSample() {};
        System.err.println("interface enum value is" );
    }

}


interface InterfaceSample{
    String CONSTANT = "YOGESH";
    enum InnerEnum{
        E1,E2;
    }
    class InnerClass{
        
    }
    
    interface innerInterface{
        
    }
    
    default void performAction(){
        System.err.println("method with defination in interface");
    }
    
    
}