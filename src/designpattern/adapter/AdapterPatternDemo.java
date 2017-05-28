/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.adapter;

/**
 *
 * @author yokukuma
 */
public class AdapterPatternDemo {
    public static void main(String[] str){
        AudioPlayer ap = new AudioPlayer();
        
        ap.play("mp3");
        ap.play("blueray");
        ap.play("mp4");
        ap.play("mp5");
    }
    
}
