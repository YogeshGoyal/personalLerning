/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.Serialization;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author yokukuma
 */
public class SerialClass implements Serializable{
    private Date currDate;

    public SerialClass() {
        this.currDate = Calendar.getInstance().getTime();
    }

    public Date getCurrDate() {
        return currDate;
    }
    
    
}
