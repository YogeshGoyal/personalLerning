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
public class Demo {
    public static void main(String[] args) {
        PrivateCon pc = PrivateCon.getInstance();
        pc.printPrivate("hello");
    }
}
