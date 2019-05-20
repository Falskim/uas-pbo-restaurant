/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Axioo
 */
public class Database extends Connector{
    public Database(){
        super();
    }
    
    // Mendapatkan daftar menu yang tersedia pada table 'food' dan 'drink'
    public ArrayList<Menu> getMenuDetail(String tableName){
        ArrayList<Menu> menus = new ArrayList<>();
        query = "SELECT * FROM " + tableName;
        try{
            rs = st.executeQuery(query);
            while(rs.next()){
                menus.add(new Menu(
                        //Mendapatkan ID menu dari DB
                        Integer.parseInt(rs.getString(1)),
                        //Mendapatkan nama menu dari DB
                        rs.getString(2), 
                        //Mendapatkan harga menu dari DB
                        Integer.parseInt(rs.getString(3)),
                        //Tipe menu [Food | Drink]
                        tableName));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return menus;
    }
    
    // Menginput data pada table `orders`
    public void createOrder(int orderID, long totalPrice){
        query = "INSERT INTO `orders` (`id`, `total_price`) "
                + "VALUES ('" + orderID+"', '" + totalPrice + "')";
        try{
            st.execute(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    // Menginput data pada table 'food_orders' atau 'drink_orders'
    // Sebagai bentuk list
    public void createMenuOrder(String menuType, int orderID, ArrayList<Menu> orders){
        String tableName = menuType.equals("food") ? "food_orders" : "drink_orders";
        for (Menu order : orders){
            query = "INSERT INTO `" + tableName + "` "
                    + "VALUES (NULL, '" + orderID + "', '" + order.getId() 
                    + "', '"+ order.getQuantity() +"')";
            try{
                st.execute(query);
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }
    }
    // Sebagai single instance
    public void createMenuOrder(String menuType, int orderID, Menu order){
        String tableName = menuType.equals("food") ? "food_orders" : "drink_orders";
        query = "INSERT INTO `" + tableName + "` "
                + "VALUES (NULL, '" + orderID + "', '" + order.getId() 
                + "', '"+ order.getQuantity() +"')";
        try{
            st.execute(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    // Mencari daftar pesanan menu makanan dan minuman, dengan input
    // No Transaksi sebagai key
    public ArrayList<Order> searchOrder(int orderID){
        ArrayList<Order> orders = new ArrayList<>();
        orders.addAll(getMenuOrder("food", orderID));
        orders.addAll(getMenuOrder("drink", orderID));
        return orders;
    }
    
    // Fungsi utama dari pencarian no transaksi, mereturn satu jenis menu
    // Dapat berupa makanan atau minuman untuk digabungkan dengan ArrayList
    // Pesanan secara keseluruhan
    private ArrayList<Order> getMenuOrder(String menuType, int key){
        ArrayList<Order> result = new ArrayList<>();
        
        // Mendapatkan table detail orders [food_orders|drink_orders]
        String tableName = menuType.equals("food") ? "food_orders" : "drink_orders";
        String menuID = menuType.equals("food") ? "food_id" : "drink_id";
        
        query = "SELECT `" + menuType + "`.`name`, `" + tableName + "`.`quantity`" +
                "FROM `" + tableName + "`, `" + menuType + "`, `orders`" +
                "WHERE `orders`.`id` = `" + tableName + "`.`orders_id`" +
                "	AND`" + tableName + "`.`orders_id` = " + key + " " +
                "	AND `" + menuType + "`.`id` = `" + tableName + "`.`" + menuID + "`";
        try{
            rs = st.executeQuery(query);
            while(rs.next()){
                result.add(new Order(
                        // Nama menu
                        rs.getString(1),
                        // Quantity pesanan
                        Integer.parseInt(rs.getString(2))));
                }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}
