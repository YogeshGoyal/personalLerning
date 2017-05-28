/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.misc;

/**
 *
 * @author yokukuma
 */

public class ClassInitializationTest {

    public static void main(String args[]) throws InterruptedException {
  
       //accessing static field of Parent through child, should only initialize Parent
       System.out.println(Parent.familyName);
    }
}

class Parent {
    //compile time constant, accessing this will not trigger class initialization
    //protected static final String familyName = "Lawson";
  
    protected static String familyName = "Lawson";
  
    static { System.out.println("static block of Super class is initialized"); }
    {System.out.println("non static blocks in super class is initialized");}
}


//public class ClassInitializationTest {
//
//    public static void main(String args[]) throws InterruptedException {
//  
//        NotUsed o = null; //this class is not used, should not be initialized
//        Child t = new Child(); //initializing sub class, should trigger super class initialization
//        System.out.println((Object)o == (Object)t);
//    }
//}
//
///**
// * Super class to demonstrate that Super class is loaded and initialized before Subclass.
// */
//class Parent {
//    static { System.out.println("static block of Super class is initialized"); }
//    {System.out.println("non static blocks in super class is initialized");}
//}
//
///**
// * Java class which is not used in this program, consequently not loaded by JVM
// */
//class NotUsed {
//    static { System.out.println("NotUsed Class is initialized "); }
//}
//
///**
// * Sub class of Parent, demonstrate when exactly sub class loading and initialization occurs.
// */
//class Child extends Parent {
//    static { System.out.println("static block of Sub class is initialized in Java "); }
//    {System.out.println("non static blocks in sub class is initialized");}
//}
