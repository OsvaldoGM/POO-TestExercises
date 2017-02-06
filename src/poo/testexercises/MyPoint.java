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

//Estos seran las puntos de referencia
public class MyPoint {
    private int x = 0;
    private int y = 0;
    
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y=y;
    }
    //En la primer casilla del array se guardara el valor de x y en la segunda el de y
    public int[] getXY() {
      int[] array = new int[2];
      array[0] = this.x;
      array[1] = this.y;
      return array;
   }
    
   public void setXY(int x, int y){
       this.x=x;
       this.y=y;
   }
   
   @Override
   public String toString(){
       return "The distance from this point to the given point at (" +this.x +"," +this.y +")";
   }
   //Hacemos una sobrecarga de un metodo 3 veces
   public double distance(int x, int y) {   
        int Dx = this.x - x;
        int Dy = this.y - y;
        return Math.sqrt((Dx*Dx) + (Dy*Dy));
        }
   //Usara el metodo adecuado para los parametros recibidos
    public double distance(MyPoint another) {
        int Dx = this.x - another.x;
        int Dy = this.x - another.y;
        return Math.sqrt((Dx*Dx) + (Dy*Dy)); 
    }
    
    public double distance() {
        int Dx = this.x - 0;
        int Dy = this.x - 0;
        return Math.sqrt((Dx*Dx) + (Dy*Dy)); 
    }
}
