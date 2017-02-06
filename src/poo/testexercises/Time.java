/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.testexercises;

/**
 *
 * @author Osvaldo
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute  = minute;
        this.second = second;
    }
    
    public int getHour(){
        return this.hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
    public void setHour(int hour){
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    public void setSecond(int second){
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute  = minute;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return String.format("%02d", this.hour)+":"+String.format("%02d", this.minute)+":"+String.format("%02d", this.second);
    }
    
    public Time nextSecond(){
    //Si segundos rebasa los 59 se volvera 0 y a minuto se le sumara 1
        this.second++;
        if(this.second>59){
            this.minute++;
            this.second=0;
        }
    //Es lo mismo con los minutos, si rebasa los 59 se vuelve 0 pero ahora se le suma uno a la hora
        if(this.minute>59){
            this.hour++;
            this.minute=0;
        }
    //La hora es de base 24, cuando llegue a ese punto se reinicia todo con valores de 0
        if(this.hour>23){
            this.hour=0;
            this.minute=0;
            this.second=0;
        }
        return this;
    }
    
    public Time previousSecond(){
        this.second--;
        if (this.second==1){
            this.second=59;
            this.minute--;
        }
        
        if (this.minute==1){
            this.minute=59;
            this.hour++;
        }
        
       if (this.hour==1){
            this.hour=23;
        }
       return this;
    }
}
