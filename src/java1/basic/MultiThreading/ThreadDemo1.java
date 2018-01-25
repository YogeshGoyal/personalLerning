/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.MultiThreading;

/**
 *
 * @author yokukuma
 */
public class ThreadDemo1 {

    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();
        //hi.show();
        //hello.show();
        
        Thread t1 = new Thread(hello);
        t1.start();
        //hi.start();
        //Thread t2 = new Thread(hi);
        //hello.start();
    }
}

// their is no difference in both, one is interface can be immplement in any
//class but abstract method can be extent only in class which is not having already extended any class.
class Hi extends Thread{

    public void show(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try {Thread.sleep(500);}catch(Exception e){}
        }
    }

    @Override
    public void run() {
        show();
    }

}

class Hello extends Thread{

    public void show(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {Thread.sleep(500);}catch(Exception e){}
        }
        
        
    }

    @Override
    public void run() {
        show();
    }

}