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
class BankAccountFacade {

    int accountNumber;
    int securityCode;

    AccountNumberChecker accountNumberChecker;
    SecurityCodeChecker securityCodeChecker;
    FundsChecker fundsChecker;

    WelcomeScreen welcomeScreen;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        welcomeScreen = new WelcomeScreen();
        accountNumberChecker = new AccountNumberChecker();
        securityCodeChecker = new SecurityCodeChecker();
        fundsChecker = new FundsChecker();

    }

    public void WithrawMoney(int withdrawMoney) {

        boolean accountStatus = accountNumberChecker.validateAccount(accountNumber);
        boolean securityStatus = securityCodeChecker.validateCredential(accountNumber, securityCode);
        System.out.println("accountStatus = "+ accountStatus + " securityStatus="+ securityStatus);
        if(accountStatus && securityStatus && fundsChecker.haveEnoughMoney(accountNumber, withdrawMoney)){
            System.out.println("Transcation completed...");
        }else{
            System.out.println("Transcation failed.");
        }
    }

    public int checkBalance(int accountNumber) {
        return fundsChecker.balance(accountNumber);
    }

}
