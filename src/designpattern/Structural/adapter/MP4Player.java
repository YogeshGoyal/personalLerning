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
public class MP4Player implements AdvanceMediaPlayer{
        @Override
    public void playBlueRay() {
        //do nothing
    }

    @Override
    public void playMP4() {
        System.out.println("playing MP4");
    }
    
}
