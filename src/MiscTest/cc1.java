/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

/**
 *
 * @author yokukuma
 */



class cc1 {
    static int i= 1;
    public static void main(String[] args) {
        cc1 c1 = new  cc1();
        cc1 c2 = new  cc1();
        cc1 c3 = new  cc1();
        System.out.println("this is main");
        c1 = null;
        c2 = null;
        c3 = null;
        
    }

    @Override
    protected void finalize() throws Throwable{
            System.out.println("Garbage collected from object" + i);
            i++;
    }
} 
