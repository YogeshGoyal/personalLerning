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
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pz = new TomotoSauce(new Mozzarella(new TomotoSauce(new BasicPizza())));
        System.out.println("total cost:" + pz.getCost());
        System.out.println("Description:" + pz.getDescriptin());
    } 
}