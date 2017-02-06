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
public class Rectangle {
    private float length;
    private float width;
    //Sin recibir parametros les damos esos valores a los atributos
    public Rectangle (){
        length = 1.0f;
        width = 1.0f;
    }
    //Pero se le asignamos si nos dan los valores
    public Rectangle (float length, float width){
        this.length = length;
        this.width = width;
    }
    
    public float getLength(){
        return this.length;
    }
    
    public void setLength (float length){
         this.length = length;
    }
     
    public float getWidth(){
        return this.width;
    }
    
    public void setWidth (float width){
         this.width = width;
    }
         
    public double getArea(){
        return this.width*this.length;
    }
    //Perimetro es la (base + altura) * 2
    public double getPerimeter(){
        return (this.width+this.length)*2;
         
    }
         
    @Override  
    public String toString(){
        return "Rectangle[width="+this.width + ",length=" +this.length + "]";
     }
    
}
