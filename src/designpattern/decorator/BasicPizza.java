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
public class BasicPizza implements Pizza{

    @Override
    public String getDescriptin() {
        return "This Dough";
    }

    @Override
    public double getCost() {
        return 100;
    }
    
}
