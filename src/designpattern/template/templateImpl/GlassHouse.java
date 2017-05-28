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
public class GlassHouse extends HouseTemplate{

    @Override
    protected void buildFoundatiopn() {
        System.out.println("Building Glass Foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    protected void buildPillar() {
        System.out.println("Building Glass Pillar");
    }

    @Override
    protected void buildWindows() {
        System.out.println("Building Glass Windows");
    }
    
}
