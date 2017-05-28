/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.GeneralJava;

import sun.security.provider.ConfigFile;

/**
 *
 * @author yokukuma
 */
class A {

    static class StaticB {

        void print() {
            System.err.println("this is static class");
        }
    }

    class normalC {

        void print() {
            System.err.println("this is normal nested class");
        }
    }
}

public class Sample2 {

    public static void main(String[] args) {
        A.StaticB b = new A.StaticB();
        b.print();

    }
}
