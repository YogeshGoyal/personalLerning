/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.io.IOException;
import java.lang.Byte;
import java.lang.Byte;

/**
 *
 * @author yokukuma
 */
public class test3 {

    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    final public static void main(String args[]) throws IOException {
        test3 obj = new test3();
        A a = new B();
        a.show();
        obj.p();
         System.out.println(Runtime.getRuntime().freeMemory());  
    }

    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception  
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }
}

class A {

    protected void show() {
        System.out.println("print show A");
    }
}

class B extends A {

}
