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
public class test2 {

    public static void var(Integer x, int y) {
        System.out.println("Integer int");
    }

    public static void var(int... x) {
        System.out.println("int... x");
    }

    public static void var(Integer... x) {
        System.out.println("Integer...");
    }

    public static void main(String[] args) {
        
     byte i1 = 0;
     Integer i2= 0;
     var(i1,i2);
        Thread tz = new Thread(()->{System.out.println("yogi");});
        tz.start();
     
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("this is call from thread1");
            }
        };
        
        Runnable r2 = () -> {
            System.out.println("this call from r2");
        };
        
        Thread t1 = new Thread(r2);
        t1.start();
        
        TimePass timePass = (String test) -> {
                System.out.println("test string is: "+ test);
            };
        
        timePass.printString("hello boss");
    }

}

@FunctionalInterface
interface TimePass {

    void printString(String test);

}

@FunctionalInterface
interface X {

    int m(Iterable<String> arg);
}

@FunctionalInterface
interface Foo {

    int m();
}
