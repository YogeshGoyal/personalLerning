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
interface A {

    void show();
}
interface B {
    int sum (int i,int j);
}
//class XYX implements A{
//
//    @Override
//    public void show() {
//        System.out.println("hello");
//    }
//    
//}

public class LambdaTester2 {

    public static void main(String[] args) {
        // here we are implemeting class to define only show method of interface 
        // A no much task , with help of 
        // lambda we can avoid this implementation and creation of class XYZ
//        A obj = new XYX();
//        obj.show();
    
    // below is 1 way of implemantation of interface
    // this type of class is called ANONYMOUS INNER CLASS
    A obj =  new A() {
        @Override
        public void show() {
               System.err.println("one way of implemtation of interface");
        }
    };
    obj.show();

    //another way called LAMBDA WAY
    A obj2 = ()-> System.err.println("lambda way of implemtation of interface");
    obj2.show();
    
    // lambda with argument so below line is implementation of some interface
    B obj3 = (i,j)->{return i+j;};
    int output = obj3.sum(12, 23);
        System.out.println("java1.basic.java8.LambdaTester2.main()"+ output);
    }

}
