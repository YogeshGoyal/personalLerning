/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FlyWeight;

import java.util.HashMap;

/**
 *
 * @author yokukuma
 */
public class CoffeeFactory {

    private HashMap<String, Coffee> flavours = new HashMap<>();

    public Coffee getCoffeeFlavour(String flavourName) {
        Coffee flavour = flavours.get(flavourName);

        if (flavour == null) {
            flavour = new Coffee(flavourName);
            flavours.put(flavourName, flavour);
        }

        return flavour;

    }

    public int getTotalCoffeeFlavorsMade() {
        return flavours.size();
    }
}
