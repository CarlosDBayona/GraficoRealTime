/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daros;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Carlos
 */
public class pos {
    long x;
    float y;
    public pos() {
        Date tod = (Date) Calendar.getInstance().getTime(); 
        x =tod.getTime();
        y=(int) (Math.random()*100);
    }

    public void setX(long x) {
        this.x = x;
    }


    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
