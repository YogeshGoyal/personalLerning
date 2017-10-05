/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.decorator.example1;

/**
 *
 * @author yokukuma
 */
public class TomotoSauce extends ToppingDecorator{
    
    public TomotoSauce(Pizza basicPizza) {
        super(basicPizza);
        System.out.println("Adding Tomoto");
    }

    @Override
    public double getCost() {
        return basicPizza.getCost()+ 100;
    }

    @Override
    public String getDescriptin() {
        return basicPizza.getDescriptin()+ ", tomoto";
    }
}
