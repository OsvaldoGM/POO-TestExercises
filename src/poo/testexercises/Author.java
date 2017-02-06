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
public class Author {
    private String name;
    private String email;
    private char gender;
    //Solo hay un constructor porque se necesitan los 3 atributos
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    //HMM gender? cual de los 17 que segun existen
    public char getGender(){
        return this.gender;
    }
    
    @Override
    public String toString(){
        return "Author[name="+this.name+",email="+this.email+",gender="+this.gender+"]";
    }
    //El override que siempre debe de estar
}
