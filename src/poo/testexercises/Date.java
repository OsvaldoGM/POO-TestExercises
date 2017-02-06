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
public class Date {
    private int day;
    private int month;
    private int year;
    
    //Una date con mi novia xD
    public Date (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay(){
        return this.day;
    }
    
    public int getMonth(){
        return this.month;
    }
    //Pero muchos años depues
    public int getYear(){
        return this.year;
    }
    
    public void setDay (int day){
        this.day =day;
    }
    
    public void setMonth (int month){
        this.month = month;
    }
        
    public void setYear (int year){
        this.year = year;
    }
    
    public void setDate (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //Format es una funcion de java que roberto nos eseño a todos
    @Override
    public String toString(){
        return String.format("%02d", this.day)+"/"+String.format("%02d", this.month)+"/"+this.year;
    }    
}
