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
public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account (String id, String name){
        this.id = id;
        this.name = name;
        balance = 0;            
    }
    //2 Constructores pero se pueden tener muchos más
    public Account (String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance =balance;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getBalance(){
        return this.balance;
    }
    
    public int Credit (int amount){
        return this.balance+=amount;
    }
    
    public int Debit (int amount){
        if (amount <= this.balance){
                this.balance-=amount;
        }
        else{
        System.out.print("Amount exceeded balance");
        }
        return this.balance;
    }
    
    //Cuando no te alcanzo para los chilaquiles
    public int tranferTo (Account another, int amount){
        if (amount <= this.balance){
            //Se le suma al balance de la otra cuenta
            another.Credit(amount);
            this.balance-=amount;
        }     
        else{
        System.out.print("Amount exceeded balance");
        }
        return this.balance;
    }
    
     @Override
    public String toString(){
    return "Account[id="+this.id+",name="+this.name+",balance="+this.balance+"]";      
    }
}
