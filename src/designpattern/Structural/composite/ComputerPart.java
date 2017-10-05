/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class ComputerPart {
    
}

interface Component{
    void showPrice();
}

class Leaf implements Component{

    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }
    
    @Override
    public void showPrice() {
        System.out.println("Name: "+ name+" Price: " + price);
    }
    
}

class Composite implements Component{
    String name;
    List<Component> listComponents =  new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    
    
    public void addComponent(Component component){
        listComponents.add(component);
    }
    
    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component listComponent : listComponents) {
            listComponent.showPrice();
        }
    }
    
}