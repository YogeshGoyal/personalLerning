/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.decorator;

/**
 *
 * @author yokukuma
 */
public abstract class  ToppingDecorator  implements Pizza{
    Pizza basicPizza;

    public ToppingDecorator(Pizza basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public String getDescriptin() {
        return basicPizza.getDescriptin();
    }

    @Override
    public double getCost() {
        return basicPizza.getCost();
    }
    
    
}
