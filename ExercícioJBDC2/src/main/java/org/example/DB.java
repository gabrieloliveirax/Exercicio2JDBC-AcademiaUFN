/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luanv
 */
public class DB {

    public DB(){
    }

    public static Connection connect(){
        String url = "jdbc:postgresql://localhost:5432/Empresa2";
        String user = "postgres";
        String password = "Chiefs@King7";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

}