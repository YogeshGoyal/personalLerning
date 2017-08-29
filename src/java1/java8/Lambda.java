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
public class Lambda {
    public static void main(String[] args) {
        Lambda l = new Lambda();
        //without lambda
        l.print();
        l.print("yogesh");
        //with lambda 
        MathOperation addition = (a, b) -> {return a+b;};
        MathOperation subtraction= (a, b) -> {return a-b;};
        System.out.println(l.operate(12, 23, addition));
        System.out.println(l.operate(12, 23, subtraction));
        Greeting print = (name) -> {System.out.println("print "+ name);};
        print.sayHello("yogi");
        
        // in build lambda expression
        
        
    }
        
    
    void print(){
        System.out.println("just print");
    }
    void print(String str){
        System.out.println("print stronug: "+ str);
    }
    
    private int operate(int a, int b, MathOperation opr){
        return opr.operation(a, b);
    }
    
    @FunctionalInterface
    interface MathOperation{
        int operation(int a,int b);
    }
    
    @FunctionalInterface
    interface Greeting{
        void sayHello(String name);
    }
}
