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
public class Menu {
    private int id;
    private String nama;
    private int harga;
    private String type;
    
    Menu(String nama){
        this.nama = nama;
        this.harga = 0;
    }
    Menu(int id, String nama, int harga, String type){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.type = type;
    }
    public String getName(){
        return nama;
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
        return id + " " + nama + " " + harga + " " + type;
    }
}
