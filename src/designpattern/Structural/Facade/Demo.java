/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.Facade;

/**
 *
 * @author yokukuma
 */
public class Demo {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345672,1234);
        int balance  = accessingBank.checkBalance(12345672);
        System.out.println("Avaialbe balance is: "+ balance);
        accessingBank.WithrawMoney(10);
    }
}
