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
public class Circle1 {
    private double radius;
    private String color;
    //Constructor
    public Circle1() {  
    radius = 1.0;
    color = "red";
    //this(1.0,"red");
    }
    //Otro constructor
    public Circle1(double radius){
    this.radius = radius;
    color = "red";
    //this(radius,"red");
    }
    
    //Otro otro constructor
    public Circle1(String color){
        this.radius = 1.0;
        this.color = color;
    //this(1.0,color);
    }
    
    public Circle1 (double radius, String color){
    this.radius= radius;
    this.color = color;
    }
    
    //get
    public double getRadius (){
        return this.radius;
    }
    
     public String getColor (){
        return this.color;
    }
   
     public void setRadius (double radius){
         this.radius = radius;
     }
     
     public void setColor (String color){
         this.color = color;
     }
     
     @Override 
     public String toString(){
         return "Circle[radius="+this.radius + ",color=" +this.color + "]";
     }
     
     //Sacar el area con la funcion Math.PI
     public double getArea(){
         return Math.PI*(Math.pow(this.radius,2));
     }
     
    
}