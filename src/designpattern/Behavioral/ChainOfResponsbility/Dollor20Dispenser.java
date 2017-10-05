/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.ChainOfResponsbility;

/**
 *
 * @author yokukuma
 */
public class Dollor20Dispenser implements DispenseChain{
        private DispenseChain nextDispense;
    @Override
    public void setNextDispense(DispenseChain d) {
        this.nextDispense = d;
    }
    

    @Override
    public void dispense(Currency amount) {
        if(amount.getAmount() >=20){
            int num =  amount.getAmount() /20;
            int rem = amount.getAmount() % 20 ;
            System.out.println("Dispensing " +num  + " 20 dollor note");
            if(rem != 0){
                this.nextDispense.dispense(new Currency(rem)); 
            }
        }
    }
    
}
