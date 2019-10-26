package controller;

import controller.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.usuario;

public class interacFunctions { 
    public ArrayList<usuario> usuarios = new ArrayList();    
    
    ConnectionDB con;
    Statement st;
    ResultSet rs;
    
    public interacFunctions(){
        con = new ConnectionDB();        
    }   
        
    public void getSelect(String table){        
        try{
            st = con.conexao.createStatement();
            
            st.executeQuery("select * from "+table);

            rs = st.getResultSet();

            while (rs.next()){                
                boolean act;                
                if (rs.getString("ativo")=="1"){act = true;}
                else{act=false;}                  
                //usuario user = new usuario(rs.getString("nome"),rs.getString("telefone"),rs.getString("turma"),rs.getString("obs"),rs.getString("id"),act);
                usuarios.add(new usuario(rs.getString("nome"),rs.getString("telefone"),rs.getString("turma"),rs.getString("obs"),rs.getString("id"),act));
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro no bd");
        }
    }
    
    public void parseUserToTable(ArrayList<usuario> al, DefaultTableModel dtmTable, String tipo){
        clearTable(dtmTable);
        
        try{
            System.out.println(al.size());
            for(int i = 0; i<al.size();i++){                 
                if (tipo=="usuarios"){
                    usuario atual = al.get(i); 
                    String stt;
                    if (atual.isStatus()){stt = "Ativo";}
                    else{stt = "Inativo";}
                    String data[]={atual.getNome(),atual.getTelefone(),atual.getTurma(),stt,atual.getID()+""};                    
                    dtmTable.addRow(data);                    
                }
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "erroMeu");
        }
    }
    public void clearTable(DefaultTableModel dtmTable){
        int max=dtmTable.getRowCount()-1;        
        if (dtmTable.getRowCount()!=0){
            while (max>-1){
                dtmTable.removeRow(max);
                max--;
            }
        }
    }
}

