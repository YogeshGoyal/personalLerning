/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.builder;

/**
 *
 * @author yokukuma
 */
public class AndroidPhone {
    private String modelname;
    private Integer camerapixel;
    private Integer ramsize;
    private Float screensize;

    public AndroidPhone(String modelname, Integer camerapixel, Integer ramsize, Float screensize) {
        this.modelname = modelname;
        this.camerapixel = camerapixel;
        this.ramsize = ramsize;
        this.screensize = screensize;
    }

    @Override
    public String toString() {
        return "Moden Name:" + modelname + " Camera Pixel: "+ camerapixel+
                " RAM: "+ ramsize + " Screen Size: "+ screensize;
    }
}
