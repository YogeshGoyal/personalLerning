/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Factory;

/**
 *
 * @author yokukuma
 */
public class Demo {
    public static void main(String[] args){
        OSFactory osf = new OSFactory();
        OSInterface obj= osf.getObject("IOS");
        obj.message();
        obj = osf.getObject("Windows");
        obj.message();
    }
}
