/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.proxy;

/**
 *
 * @author yokukuma
 */
public class CommandExecuterImpl implements CommandExecuter{

    @Override
    public void executeCommand(String command) {
        System.out.println("command Executed: "+ command );
    }
    
}
