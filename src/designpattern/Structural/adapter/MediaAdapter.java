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
public class MediaAdapter implements MediaPlayer{
    
    AdvanceMediaPlayer amp;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("blueray")){
            amp = new BlueRayPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp = new MP4Player();
        }
    }
    
    @Override
    public void play(String audioType) {
        if(audioType.equalsIgnoreCase("blueray")){
            amp.playBlueRay();
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp.playMP4();
        }
    } 
}
