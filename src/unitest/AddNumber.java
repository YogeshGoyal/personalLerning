/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitest;

/**
 *
 * @author yokukuma
 */
public class AddNumber {
    public int addNumber(int a, int b){
        return a+b;
    }
    
    public void throwError(){
        throw new IllegalArgumentException();
    }
}
