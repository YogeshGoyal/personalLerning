/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.java8;

/**
 *
 * @author yokukuma
 */
public class MethodReferencing {

    public static void main(String[] args) {
        MyClass m = new MyClass();
        //below is method referencing, for method referencing both method should have smae signature.
        MyInterfce m2 = m::myMethod;
        System.out.println(m2.sayMethod("yogesh"));
        
        // Example2 of method referrncing.
        
        Runnable r = MyClass::anotherMethod;
        Thread t = new Thread(r);
        t.start();

        
    }
}

class MyClass {

    public String myMethod(String name) {
        System.out.println("hello from other side:" + name);
        return "hello from other side:" + name;
    }
    public static void anotherMethod(){
        System.out.println("child thread");
    }
}

// below class is rereq as functional interface to be used as method referencing.
@FunctionalInterface
interface MyInterfce {
    public String sayMethod(String name);
}
