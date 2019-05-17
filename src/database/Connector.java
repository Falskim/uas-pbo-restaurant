/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

public class Connector {

    final private String DRIVER = "com.mysql.jdbc.Driver";
    final private String URL = "jdbc:mysql://localhost:3306/";
    final private String DB = "restaurant";
    final private String USER = "root";
    final private String PASS = "";
    
    protected ResultSet rs;
    protected Statement st;
    protected Connection con;
    protected String query;
    
    public Connector() {
        try{
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
            st = con.createStatement();
            creatingDatabase();
            System.out.println("Database Connected");
        }catch(Exception e){
            System.err.println("Database Failed to Connect");
            e.printStackTrace();
        }
    }
    
    //Membuat database baru, apabila database belum ada sebelumnya.
    //Jika sudah ada, maka proses pembuatan database pada method ini
    //Akan dibatalkan
    private void creatingDatabase(){
        query = "USE " + DB;
        try{
            st.execute(query);
            System.out.println("Database " + DB + " is ready");
        }catch(SQLException e){
            System.out.println("Database " + DB + " doesn't exist, creating now");
            query = "CREATE DATABASE " + DB;
            try{
                st.execute(query);
                System.out.println("Database " + DB + " created successfuly");
            }catch(SQLException er){
                System.err.println("Failed to create database " + DB);
            }
        }
    }
}
