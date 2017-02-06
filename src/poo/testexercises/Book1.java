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
public class Book1 {
    private String name;
    private Author author;
    private double price;
    private int qty;
    //El atributo author es del tipo Author
    public Book1(String name, Author author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=0;
    }
    public Book1(String name, Author author,double price,int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    //Wow un geter
    public String getName(){
        return this.name;
    }
   
    public Author getAuthor(){
        return this.author;
    }
    
    public double getprice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    //Este libro solo tiene un autor
    @Override
    public String toString (){
        return "Book [name= " +this.name +"," +author.toString() +",price =" +this.price +",qty= " +this.qty +"]";
    }
}
