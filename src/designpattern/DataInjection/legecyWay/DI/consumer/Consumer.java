/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.legecyWay.DI.consumer;

/**
 *
 * @author yokukuma
 */
public interface Consumer {
    public void ProcessMessage(String message, String receiver);
}
