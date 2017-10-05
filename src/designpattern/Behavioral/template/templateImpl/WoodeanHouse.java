/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.template.templateImpl;

/**
 *
 * @author yokukuma
 */
public class WoodeanHouse extends HouseTemplate{
        @Override
    protected void buildFoundatiopn() {
        System.out.println("Building Wooden Foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    protected void buildPillar() {
        System.out.println("Building Wooden Pillar");
    }

    @Override
    protected void buildWindows() {
        System.out.println("Building Wooden Windows");
    }
}
