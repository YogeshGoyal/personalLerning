/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.Singleton;

/**
 *
 * @author yokukuma
 */
public enum EasySingleton {
    INSTANCE,
    INSTANCE2(2,3);
    
    private int x;
    private int y;
    private EasySingleton(int x,int y){
        this.x =x;
        this.y =y;
    }
    private EasySingleton(){
        System.out.println("Here");

    }
    public void show(){
        System.err.println("this is enum");
    }
}
