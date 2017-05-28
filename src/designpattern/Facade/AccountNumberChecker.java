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
class AccountNumberChecker {
    
    // below map will content all account number and their status
    Map<Integer,Boolean> accounts = new HashMap<>();
    
    AccountNumberChecker() {
        loadDummyAccount();
    }

    private void loadDummyAccount() {
        accounts.put(12345671, Boolean.TRUE);
        accounts.put(12345672, Boolean.FALSE);
        accounts.put(12345673, Boolean.TRUE);
        accounts.put(12345674, Boolean.TRUE);
    }

    boolean validateAccount(int accountNumber) {
        Boolean account = accounts.get(accountNumber);
        if(account != null && account == Boolean.TRUE){
            return true;
        }else{
            return false;
        }
    }
    
}
