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
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    
    public Book(String name, Author[] authors,double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=0;
    }
    public Book(String name, Author[] authors,double price,int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    
    public String getName(){
        return this.name;
    }
    //Un libro puede tener varios autores por eso usamamos la clase Autor para cubrir a todos
    public Author[] getAuthors(){
        return this.authors;
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
    
    @Override
    public String toString (){
        return "Book [name= " +this.name +",Authors {" +this.getAuthorNames(authors) +"} ,price =" +this.price +",qty= " +this.qty +"]";
    }
    
    //Se ire guardando en un arreglo toda la información de los autores
    public String getAuthorNames(Author[] authors){
        //Se tiene que inicializar la variable
         String s ="";
         for (int i=0;i<authors.length;i++){
             s=authors[i].toString()+",";
             //Cada vez que termine con cada autor se pondra la coma 
         }
         return s;
     }
}
