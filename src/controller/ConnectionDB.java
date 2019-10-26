package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    String servername = "localhost";
    String database = "lacuratProject";
    String url = "jdbc:mysql://" + servername + "/" + database;
    String username = "root";
    String password = "";
    Connection conexao;
    
    ConnectionDB(){
        try{
            conexao = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException ex){}
    }
}
