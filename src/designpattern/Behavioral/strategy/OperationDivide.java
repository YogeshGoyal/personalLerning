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
public class OperationDivide implements Strategy{

    @Override
    public int doOpertion(int num1, int num2) {
        return num1/num2;
    }
    
}
