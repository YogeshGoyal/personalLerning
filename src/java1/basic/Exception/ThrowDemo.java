/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.Exception;

/**
 *
 * @author yokukuma
 */
public class ThrowDemo {

    public static void main(String[] args) {

        Test t = new Test() {
            @Override
            public void print() {
                System.out.println("printing test method");
            }
        }
                t.print();
        int k = 11;
        // throw predeifned exception
        try {
            if (k < 10) {
                throw new ArithmeticException();
            } else {
                throw new MyException("my exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // throw user defined exception
    }
}

class MyException extends Exception {

    public MyException(String str) {
        super(str);
    }
}


abstract class Test{
    public abstract void print();
}