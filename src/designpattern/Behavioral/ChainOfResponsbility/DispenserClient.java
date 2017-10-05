/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.ChainOfResponsbility;

import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class DispenserClient {
    private DispenseChain dc;

    public DispenserClient() {
        this.dc = new Dollor50Dispenser();
        DispenseChain d2 = new Dollor20Dispenser();
        DispenseChain d3 = new Dollor10Dispenser();
        
        dc.setNextDispense(d2);
        d2.setNextDispense(d3); 
    }
    
    public static void main(String[] args) {
        DispenserClient client = new DispenserClient();
        while(true){
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner sc = new Scanner(System.in);
            amount = sc.nextInt();
            if( (amount % 10) != 0){
                System.out.println("Amount should be in 10 rs donimation.");
                return;
            }
            client.dc.dispense(new Currency(amount));  
        }
        
    }
}
