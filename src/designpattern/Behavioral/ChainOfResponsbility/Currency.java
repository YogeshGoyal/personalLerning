/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.ChainOfResponsbility;

/**
 *
 * @author yokukuma
 */
public class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
}
