/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.example1.DI.services;

/**
 *
 * @author yokukuma
 */
public interface MessageService {
    public void sendMail(String message, String receiver);
}