/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.FlyWeight;

/**
 *
 * @author yokukuma
 */
public class CoffeeContext {
    private final int tableNumber;

    public CoffeeContext(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    
    public int getTable(){
        return tableNumber;
    }
}
