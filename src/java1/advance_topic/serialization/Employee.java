/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.advance_topic.serialization;

import java.io.Serializable;

/**
 *
 * @author yokukuma
 */
public class Employee implements Serializable{
    int id;
    //String name;
    private static final long serialVersionUID = 1L;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
