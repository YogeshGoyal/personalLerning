/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.legecyWay.DI.consumer;

import designpattern.DataInjection.legecyWay.DI.services.MessageService;

/**
 *
 * @author yokukuma
 */
public class DIApplication implements Consumer{
    
    private MessageService service;

    public DIApplication() {
    }

    public DIApplication(MessageService service) {
        this.service = service;
    }

    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void ProcessMessage(String message, String receiver) {
        this.service.sendMail(message, receiver);
    }
    
}
