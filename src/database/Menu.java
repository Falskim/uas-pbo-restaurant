/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Axioo
 */
public class Menu extends Order{
    private int id;
    private int harga;
    private String type;
    
    public Menu(int id, String nama, int harga, String type){
        super(nama);
        this.id = id;
        this.harga = harga;
        this.type = type;
    }
    public int getPrice(){
        return harga;
    }
    public int getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    
    @Override
    public String toString(){
        return getId() + " " + getMenuName() + " " + getPrice() + " " + getType();
    }
}
