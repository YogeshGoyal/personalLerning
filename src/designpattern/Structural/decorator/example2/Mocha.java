/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.decorator.example2;

/**
 *
 * @author yokukuma
 */
public class Mocha extends CondimentDecorator{
    
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+ 0.20;
    }
    
}
