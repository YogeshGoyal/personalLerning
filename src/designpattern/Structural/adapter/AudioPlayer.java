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
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audio) {
        if(audio.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: ");	
        }
        
        else if (audio.equalsIgnoreCase("blueray") || audio.equalsIgnoreCase("mp4")  ){
            mediaAdapter = new MediaAdapter(audio);
            mediaAdapter.play(audio);
        }
        
        else{
            System.out.println("Format not supported");	
        }
    }
}
