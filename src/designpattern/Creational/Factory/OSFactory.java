/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.Factory;

/**
 *
 * @author yokukuma
 */
public class OSFactory {
    public OSInterface getObject(String str){
        if(str.equalsIgnoreCase("IOS")){
            return new IOS();
        }else if(str.equalsIgnoreCase("ANDROID")){
            return new AndroidOS();
        }else if(str.equalsIgnoreCase("WINDOWS")){
            return new WindowsOS();
        }
        return null;
    }
}
