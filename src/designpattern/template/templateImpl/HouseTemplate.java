/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.template.templateImpl;

/**
 *
 * @author yokukuma
 */

public abstract class HouseTemplate {
    public final void buildHouse(){
        buildFoundatiopn();
        buildWalls();
        buildPillar();
        buildWindows();
        System.out.println("House is built");
    }
    
    protected abstract void buildFoundatiopn() ;
    protected abstract void buildWalls();
    protected abstract void buildPillar() ;
    protected abstract void buildWindows();
    
}
