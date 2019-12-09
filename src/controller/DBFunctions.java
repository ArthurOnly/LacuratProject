package controller;

import controller.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.atividade;
import model.dispositivo;
import model.historico;
import model.usuario;

public class DBFunctions { 
    public ArrayList<usuario> usuarios = new ArrayList(); 
    public ArrayList<dispositivo> dispositivos = new ArrayList(); 
    public ArrayList<atividade> atividades = new ArrayList(); 
    public ArrayList<historico> historico = new ArrayList();
    public ArrayList<String[]> gerenciadores = new ArrayList();
    
    DBConnection con;
    Statement st;
    ResultSet rs;
    
    public DBFunctions(){
        con = DBConnection.getInstance();        
    }  
    
    //Selects   
    public void reloadSelect(String table){        
        try{
            st = con.conexao.createStatement();
            
            st.executeQuery("select * from "+table); 
            
            rs = st.getResultSet();           
           
            if (table=="usuarios"){
                usuarios.clear();
                while(rs.next()){
                    boolean act;                                
                    if (rs.getString("ativo").equals("1")){act = true;}
                    else{act=false;}                 
                    usuarios.add(new usuario(rs.getString("nome"),rs.getString("telefone"),rs.getString("turma"),rs.getString("obs"),rs.getString("id"),act));
                }
            }  
            if (table=="dispositivos"){
                dispositivos.clear();
                while(rs.next()){
                    boolean act;                                
                    if (rs.getString("ativo").equals("1")){act = true;}
                    else{act=false;}                      
                    dispositivos.add(new dispositivo(rs.getString("nome"),rs.getString("id")+"",rs.getString("obs"),Double.parseDouble(rs.getString("tempoDeUso")),act));
                }
            }
            
            if (table=="atividade"){                
                atividades.clear();
                while(rs.next()){                    
                    boolean act;                      
                    if (rs.getString("automatic").equals("1")){act = true;}
                    else{act=false;}                 
                    atividades.add(new atividade(rs.getString("userId"),rs.getString("dispId"),act,rs.getString("dataInicial"),rs.getString("dataFinal"),rs.getString("id")));                    
                }
            } 
            if (table=="historico"){
                historico.clear();
                while(rs.next()){                                                                                    
                    historico.add(new historico(rs.getString("userId"),rs.getString("dispId"),rs.getString("useData"),rs.getString("id")));
                }
            }
            if (table=="gerenciadores"){
                gerenciadores.clear();
                while(rs.next()){ 
                    String[] data = {rs.getString("senha"),rs.getString("cores"),rs.getString("id")};
                    gerenciadores.add(data);
                }
            }
            st.closeOnCompletion();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no banco de dados");
        }
    }   
    public void reloadSelect(String table,String condition){        
        try{
            st = con.conexao.createStatement();            
            
            st.executeQuery("select * from "+table+" where "+condition);
            System.out.println("select * from "+table+" where "+condition);
            rs = st.getResultSet();           
           
            if (table.equals("usuarios")){
                usuarios.clear();
                while(rs.next()){
                    boolean act;                                
                    if (rs.getString("ativo")=="1"){act = true;}
                    else{act=false;}                 
                    usuarios.add(new usuario(rs.getString("nome"),rs.getString("telefone"),rs.getString("turma"),rs.getString("obs"),rs.getString("id"),act));
                }
            }
            if (table=="dispositivos"){
                dispositivos.clear();
                while(rs.next()){
                    boolean act;                                
                    if (rs.getString("ativo")=="1"){act = true;}
                    else{act=false;}                 
                    dispositivos.add(new dispositivo(rs.getString("nome"),rs.getString("id"),rs.getString("obs"),Double.parseDouble(rs.getString("tempoDeUso")),act));
                }
            }
            if (table=="atividade"){
                dispositivos.clear();
                while(rs.next()){
                    boolean act;                                
                    if (rs.getString("automatic")=="1"){act = true;}
                    else{act=false;}                 
                    atividades.add(new atividade(rs.getString("userId"),rs.getString("dispId"),act,rs.getString("dataInicial"),rs.getString("dataFinal"),rs.getString("id")));
                }
            }
            if (table=="historico" || table.equals("historico join usuarios") || table.equals("historico join dispositivos")){
                historico.clear();
                while(rs.next()){                                                                                    
                    historico.add(new historico(rs.getString("userId"),rs.getString("dispId"),rs.getString("useData"),rs.getString("id")));
                }
            }
            if (table=="gerenciadores"){
                gerenciadores.clear();
                while(rs.next()){ 
                    String[] data = {rs.getString("senha"),rs.getString("cores"),rs.getString("id")};
                    gerenciadores.add(data);
                }
            }
                        
            st.closeOnCompletion();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no banco de dados");
        }
    }
    
    //Delete
    public void deletSelected(usuario user){
        try{
            st = con.conexao.createStatement();            
            st.executeUpdate("delete from usuarios where id="+user.getID());
            st.closeOnCompletion();            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuario");
        }       
    }
    public void deletSelected(atividade atv){
        try{
            st = con.conexao.createStatement();            
            st.executeUpdate("delete from atividade where id="+atv.getId());
            st.closeOnCompletion();   
            String[] dados = {atv.getUsuarioID(),atv.getDispositovID(),"0"};
            updateValue("userStts", dados);
            updateValue("dispStts", dados);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao deletar atividade");
        }       
    }         
    public void deletSelected(dispositivo disp){
        try{
            st = con.conexao.createStatement();            
            st.executeUpdate("delete from dispositivos where id="+disp.getID());
            st.closeOnCompletion();            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuario");
        }       
    }
    public void deletSelected(historico hist){
        try{
            st = con.conexao.createStatement();            
            st.executeUpdate("delete from historico where id="+hist.getId());
            st.closeOnCompletion();            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao deletar registro");
        }       
    }
    
    //insert
    public void insertValue(String tipo, String[] dados){
        try{
            st = con.conexao.createStatement(); 
            if (tipo=="usuario"){               
                st.executeUpdate("insert into usuarios values ("+dados[0]+","+dados[1]+","+dados[2]+","+dados[3]+", default, false)");                
            }
            if (tipo=="dispositivo"){                               
                st.executeUpdate("insert into dispositivos values ("+dados[0]+",default,"+dados[1]+", 0, false)");                
            }
            if (tipo=="atividade"){  
                st.executeUpdate("insert into atividade values ("+dados[1]+","+dados[3]+","+dados[4]+","+dados[5]+","+dados[6]+",default)"); 
                String dados2[] = {dados[1],dados[3],"1"};
                updateValue("userStts", dados2);
                updateValue("dispStts", dados2);
            }
            if (tipo=="historico"){                  
                st.executeUpdate("insert into historico values ("+dados[0]+","+dados[1]+","+dados[2]+",default)");                
            }
            if (tipo=="gerenciador"){
                st.executeUpdate("insert into gerenciadores values ('123','016,125,172,024,154,211,113,199,236',default)");
            }
            st.closeOnCompletion();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados");
        }
    }
       
    //update
    public void updateValue(String tipo, String[] dados){
        try{
            st = con.conexao.createStatement();  
            if (tipo=="usuario"){                            
                st.executeUpdate("update usuarios set nome = "+dados[0]+",telefone = "+dados[1]+",turma = "+dados[2]+", obs = "+dados[3]+" where id="+dados[4]);
            }
            if (tipo=="dispositivo"){                            
                st.executeUpdate("update dispositivos set nome = "+dados[0]+",obs = "+dados[1]+" where id="+dados[2]);
            }
            if (tipo=="dispositivoTime"){                                          
                st.executeUpdate("update dispositivos set tempoDeUso = "+dados[0]+" where id="+dados[1]);
            }
            if (tipo=="senha"){
                if (dados[0].equalsIgnoreCase(gerenciadores.get(0)[0])){
                    st.executeUpdate("update gerenciadores set senha = "+dados[1]+" where id=5");
                }
                else{
                    JOptionPane.showMessageDialog(null, "A senha atual está incorreta");
                }
            }
            if (tipo=="cores"){                
                st.executeUpdate("update gerenciadores set cores = '"+dados[0]+","+dados[1]+","+dados[2]+"' where id=5");
            }

            if (tipo=="userStts"){
                st.executeUpdate("update usuarios set ativo="+dados[2]+" where id="+dados[0]);
            }
            if (tipo=="dispStts"){
                st.executeUpdate("update dispositivos set ativo="+dados[2]+" where id="+dados[1]);
            }
            
            st.closeOnCompletion();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados");
        }
    }    
}

