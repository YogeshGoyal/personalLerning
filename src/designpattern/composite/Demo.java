/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.composite;

/**
 *
 * @author yokukuma
 */
public class Demo {
    public static void main(String[] args) {
        Component hdd = new Leaf(2000, "HDD");
        Component mouse = new Leaf(2000, "Mouse");
        Component monitor = new Leaf(2000, "Monitor");
        Component ram = new Leaf(2000, "RAM");
        Component cpu = new Leaf(2000, "CPU");
        
        Composite peri = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("Motherboard");
        Composite computer = new Composite("Computer");
        
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);
        
        peri.addComponent(mouse);
        peri.addComponent(monitor);
        cabinet.addComponent(hdd);
        cabinet.addComponent(motherBoard);
        
        computer.addComponent(peri);
        computer.addComponent(cabinet);
        
        cabinet.showPrice();
        
    }
}
