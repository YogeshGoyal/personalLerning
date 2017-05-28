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
class SecurityCodeChecker {
    
    // below map will content all account number and their corresponding security code.
    Map<Integer,Integer> accountCred = new HashMap<>();
    
    
    SecurityCodeChecker() {
        loadDummyAccountCred();
    }

    boolean validateCredential(int accountNumber, int securityCode) {
        Integer securityKey = accountCred.get(accountNumber);
        if(securityKey != null && securityKey == securityCode){
            return true;
        }else{
            return false;
        }
    }

    private void loadDummyAccountCred() {
        accountCred.put(12345671, 1234);
        accountCred.put(12345672, 1235);
        accountCred.put(12345673, 1236);
    }
    
}
