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
public class InterfaceDemo implements SampleInterface1, SampleInterface2{
    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo();
        id.print();
        StaticMethodInterface.show();
    }

    @Override
    public void print() {
        System.out.println("java1.basic.java8.InterfaceDemo.print()");
    }
}

interface SampleInterface1 {
    String name = "YOGESH" ;
    // below concept is introduced in java 1.8 to define method
    //but below implemantation can create diamond of death problem e.g.
    // if inteface A and B is having method defination for method show() and 
    // these interface are derived by class C, if object of class C call show() 
    // method then it will create diamond problem.
    void print();
}

interface SampleInterface2 {
    String name = "YOGESH" ;
    // below concept is introduced in java 1.8 to define method
    //but below implemantation can create diamond of death problem e.g.
    // if inteface A and B is having method defination for method show() and 
    // these interface are derived by class C, if object of class C call show() 
    // method then it will create diamond problem.
    default void print(){
        System.out.println("java1.basic.java8.SampleInterface2.print()");
    }
}
// Static method are allowed in JAVA 1.8 , before 1.8 it was not allowed
interface StaticMethodInterface{
    static void show(){
        System.out.println("java1.basic.java8.StaticMethodInterface.show()");
    }
}