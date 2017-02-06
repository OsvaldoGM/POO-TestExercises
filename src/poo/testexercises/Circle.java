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
public class Circle {
    private double radius;
    //Constructor
    public Circle() {  
         this (1.0);
     }
    //Otro constructor
    public Circle (double radius){
    this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
     public void setRadius (double radius){
         this.radius = radius;
     }
     //No es un construtor
     public double getArea(){
         return Math.PI*(Math.pow(this.radius,2));
     }
    
     public double getCircumference(){
         return Math.PI*2*(Math.pow(this.radius,1));
     }
    //Siempre un override cuando ya existe este metodo y se quiere cambiar
     @Override  
     public String toString(){
         return "Circle[radius="+this.radius+"]";
     }
}

