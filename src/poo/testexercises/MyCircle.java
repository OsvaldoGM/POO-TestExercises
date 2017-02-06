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
public class MyCircle {
    private MyPoint center;
    private int radius = 1;
    
    public MyCircle(){
        this.center = new MyPoint();
        this.radius = 1;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    
    public int getRaidus(){
        return this.radius;
    }
    
    public void setRaidus(int radius){
        this.radius = radius;
    }
    //Muchos GETERS y SETERS
    public MyPoint getCenter(){
        return this.center;
    }
    
    public void setCenter(MyPoint center){
        this.center = center;
    }
    
    public int getCenterX() {
      return this.center.getX();
   }
    
    public void setCenterX(int x) {
      this.center.setX(x);  
   }
    
    public int getCenterY(){
        return this.center.getY();
    }
    
    public void setCenterY(int y){
        this.center.setY(y);
    }
    //Ya tenemos un metodo getXY(), asique lo usamos 
    public int[] getCetnerXY(){
        return this.center.getXY();
    }
    
    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }
    
    @Override
    public String toString() {
      return "Circle[center=" + this.center + ",radius=" + this.radius + "]";
    }
    
    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }
    
    public double getCircumference(){
        return 2*(Math.PI)*(this.radius);
    }
    
    public double distance(MyCircle another){
        //Va a sacar las distancia que esxiste entre el centro actual con el centre que le metamos en los parametros
        return this.center.distance(another.center);
    }
}
