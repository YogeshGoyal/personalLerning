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
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
}
