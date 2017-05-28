/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.template;

import designpattern.template.templateImpl.GlassHouse;
import designpattern.template.templateImpl.HouseTemplate;
import designpattern.template.templateImpl.WoodeanHouse;

/**
 *
 * @author yokukuma
 */
public class Demo {
    public static void main(String[] args) {
        HouseTemplate house = new GlassHouse();
        house.buildHouse();
        WoodeanHouse ws = new WoodeanHouse();
        ws.buildHouse();
    }
}
