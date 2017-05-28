/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Facade;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yokukuma
 */
class FundsChecker {
    
    Map<Integer,Integer> accountBalance = new HashMap<>();
     
    FundsChecker() {
        loadDummyBalance();
    }



    public boolean haveEnoughMoney(int accountNumber, int withdrawMoney) {
        int availableBalance = accountBalance.get(accountNumber);
        
        if(availableBalance > withdrawMoney){
            int remainlingBalance = availableBalance-withdrawMoney;
            accountBalance.put(accountNumber, remainlingBalance);
            System.out.println("yout transcation successful");
            return true;
        }else{
            System.out.println("Not enough balance. transcation failed");
            return false;
        }
    }

    public int balance(int accountNumber){
        return accountBalance.get(accountNumber);
    }
    
    private void loadDummyBalance() {
        accountBalance.put(12345671, 100);
        accountBalance.put(12345672, 200);
        accountBalance.put(12345673, 300);
    }
}
