/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.adapter;

/**
 *
 * @author yokukuma
 */
public class BlueRayPlayer implements AdvanceMediaPlayer{

    @Override
    public void playBlueRay() {
        System.out.println("playing BlueRay");
    }

    @Override
    public void playMP4() {
        //do nothing
    }
    
}