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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    //Creo 2 contructores por si introducen las cordenadas o una clase de MyPoint
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    @Override
    public String toString(){
        return "My Triangle [v1= " +this.v1 +", v2= " +this.v2 +", v3= " +this.v3 +"]";
    }
    //La distancia de v1 con v2, de v2 con v3 y v3 con v1, sumados dan el perimetro del trianglo ;)
    public double Perimeter(){
        return v1.distance(v2)+ v2.distance(v3) + v1.distance(v3) ;
    }
    
    public String getType(){
        double a,b,c;
        a=this.v1.distance(v2);
        b=this.v1.distance(v3);
        c=this.v2.distance(v3);
        //Solo si 2 de sus lados son iguales sera isoceles
            if(a==b||b==c||c==a){
                return "Isosceles";
                //Para que sea equlatero sus 3 lados deben ser iguales, como a=b entonces b=c  es como dijeramos a=c
            }else if(a==b&&b==c){
                return "Equilateral";
            }else{
            return "Scalene";
            }
    }
}
