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
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pz = new TomotoSauce(new Mozzarella(new TomotoSauce(new BasicPizza())));
        System.out.println("total cost:" + pz.getCost());
        System.out.println("Description:" + pz.getDescriptin());
        
        System.out.println("can you please add some more tomoto");
        Pizza pz2 = new TomotoSauce(pz);
        System.out.println("total cost:" + pz2.getCost());
        System.out.println("Description:" + pz2.getDescriptin());
        
    } 
}