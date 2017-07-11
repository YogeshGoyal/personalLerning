/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.example1.DI.injector;

import designpattern.DataInjection.example1.DI.consumer.Consumer;

/**
 *
 * @author yokukuma
 */
public interface MessageServiceInjector {
    public Consumer getConsumer();
}
