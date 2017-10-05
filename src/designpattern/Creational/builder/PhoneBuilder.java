/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.builder;

/**
 *
 * @author yokukuma
 */
public class PhoneBuilder {
    private String modelname;
    private Integer camerapixel;
    private Integer ramsize;
    private Float screensize;

    public PhoneBuilder setModelname(String modelname) {
        this.modelname = modelname;
        return this;
    }

    public PhoneBuilder setCamerapixel(Integer camerapixel) {
        this.camerapixel = camerapixel;
        return this;
    }

    public PhoneBuilder setRamsize(Integer ramsize) {
        this.ramsize = ramsize;
        return this;
    }

    public PhoneBuilder setScreensize(Float screensize) {
        this.screensize = screensize;
        return this;
    }
    
    public AndroidPhone getPhone(){
        AndroidPhone ap = new AndroidPhone(modelname, camerapixel, ramsize, screensize);
        return ap;
    }
}
