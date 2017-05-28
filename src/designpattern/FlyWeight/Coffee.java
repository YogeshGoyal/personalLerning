/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FlyWeight;

/**
 *
 * @author yokukuma
 */
public class Coffee implements CoffeeInterface{

    private final String flavour;

    public Coffee(String flavour) {
        this.flavour = flavour;
        System.out.println("Flavour created: "+ flavour);
    }

    public String getFlavour() {
        return flavour;
    }
    
    
    
    @Override
    public void serverCoffee(CoffeeContext coffeeContext) {
        System.out.println("Serving coffee flavour "+ flavour + " to table number "+ coffeeContext.getTable());
    }
    
}
