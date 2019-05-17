/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author falskim
 */
public class Order {
    private String menuName;
    private int quantity;

    public Order(){
        menuName = "Empty";
        quantity = 0;
    }
    public Order(String menuName){
        this.menuName = menuName;
        quantity = 0;
    }
    public Order(String menuName, int quantity){
        this.menuName = menuName;
        this.quantity = quantity;
    }
    public String getMenuName() {
        return menuName;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    
    @Override
    public String toString() {
        return menuName + " " + quantity;
    }
}
