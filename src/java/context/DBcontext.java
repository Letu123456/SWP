/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBcontext {
    protected Connection connection;
    
    public DBcontext() {
        
        try {
            String use ="sa";
            String pass="1234";
            String url="jdbc:sqlserver://WIN-RHTCG074P9D\\SQLEXPRESS:1433;databaseName=SWPP";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, use, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
                    
                     
        }
    }
}
