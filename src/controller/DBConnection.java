package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection {
    private static final String servername = "localhost";
    private static final String database = "lacuratProject";
    private static final String url = "jdbc:mysql://" + servername + "/" + database;
    private static final String username = "root";
    private static final String password = "";
    public static Connection conexao;
    
    private static DBConnection INSTANCE;    
    
    
    private DBConnection(){
        try{
            conexao = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException ex){}
    }
    
    public static synchronized DBConnection getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DBConnection();
        }
        return INSTANCE;        
    }
}
