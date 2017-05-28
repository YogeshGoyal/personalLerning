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
public class Mozzarella extends ToppingDecorator {
    
    public Mozzarella(Pizza basicPizza) {
        super(basicPizza);
        System.out.println("Adding Mozzarella");
    }

    @Override
    public double getCost() {
        return basicPizza.getCost() + 20;
    }

    @Override
    public String getDescriptin() {
        return basicPizza.getDescriptin() + ", Mozzarella";
    }
}
