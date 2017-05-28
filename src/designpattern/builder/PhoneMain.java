/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.builder;

/**
 *
 * @author yokukuma
 */
public class PhoneMain {
    
    public static void main(String[] str){
        AndroidPhone ap = new AndroidPhone("Xiomi mi4i", 13, 2, 4.8F);
        System.out.println(ap);
        
        PhoneBuilder pb = new PhoneBuilder().setCamerapixel(12).setModelname("moto e").setRamsize(4).setScreensize(4.4F);
        ap = pb.getPhone();
        System.out.println(ap);
    }
}
