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
public class Demo {
    public static void main(String[] args) {
        CommandExecuterProxy cep1 = new CommandExecuterProxy(true);
        cep1.executeCommand("ls -lrt");
        
        CommandExecuterProxy cep2 = new CommandExecuterProxy(false);
        cep2.executeCommand("ls -lrt");
    }
}
