/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.strategy;

/**
 *
 * @author yokukuma
 */
public class StratgyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAddition());
        System.out.println("addition of number 10 12 is: "+ context.executeStrategy(12, 10));
        context = new Context(new OperationDivide());
        System.out.println("division of number 100 5 is: "+ context.executeStrategy(100, 5));
        context = new Context(new OperationSubtraction());
        System.out.println("subtraction of number 100 5 is: "+ context.executeStrategy(100, 5));
        context = new Context(new OperationMultiply());
        System.out.println("multiplication of number 100 5 is: "+ context.executeStrategy(100, 5));
    }
}
