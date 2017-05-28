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
public class LambdaTester1 {
    public static void main(String[] args) {
        LambdaTester1 ls = new LambdaTester1();
              //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //with out type declaration
//      MathOperation subtraction = (a, b) -> a - b;
		
      //with return statement along with curly braces
    //  MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //without return statement and without curly braces
  //    MathOperation division = (int a, int b) -> a / b;
      
        System.err.println("10+5=" + ls.operate(10,5,addition));
        
    }

    private int operate(int i, int j , MathOperation mathOperation) {
        return mathOperation.operation(i, j);
    }
    
    public interface MathOperation{
        int operation(int a, int b);
    }
}
