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
public class MyRectangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyRectangle (int x1, int y1, int x2, int y2){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);   
    }
    //Creo 2 contructores por si introducen las cordenadas o una clase de MyPoint
    public MyRectangle(MyPoint v1, MyPoint v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
     @Override
    public String toString() {
      return "MyRectangle[v1=" + this.v1 + ",v2=" + this.v2 +"]"; 
    }
 
    public double getArea() {
        //En MyPoint ya tenemos un metodo que saca la distancia de un punto a otro
        return v1.distance(v2) * v1.distance(v2);
    }
    
    public double getPerimeter() {
        //Con el mismo metodo en lugar de multiplicarlo para el area, los sumamos para los perimetros
        return v1.distance(v2) + v1.distance(v2);
    }
}
