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
public class CRUD extends Connector{
    public CRUD(){
        super();
    }
//    public void insert(String db, String name, int price, int qty){
//        query = "INSERT INTO" + db + "("
//        try{
//            st.
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
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
    
    public static void main(String[] args){
        CRUD run = new CRUD();
    }
}
