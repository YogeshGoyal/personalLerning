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
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description= "House blend cofee";
    }

    
    @Override
    public double cost() {
        return .89;
    }
    
}
