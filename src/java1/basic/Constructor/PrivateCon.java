/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.Constructor;

/**
 *
 * @author yokukuma
 */
public class PrivateCon {
    private static PrivateCon obj = null;
    private PrivateCon() {
    }
    public static PrivateCon getInstance(){
        if(obj == null){
           obj = new PrivateCon();
        }
        return obj;
    }
    
    public void printPrivate(String str){
        System.out.println("java1.basic.Constructor.PrivateCon.printPrivate()"+ str);
    }
}
