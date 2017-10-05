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
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+ beverage.cost() );
        
        Beverage beverage2 = new Milk(new Mocha(beverage)); 
                System.out.println(beverage2.getDescription()+" $"+ beverage2.cost() );
    }
}
