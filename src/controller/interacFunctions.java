package controller;

import controller.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.atividade;
import model.dispositivo;
import model.historico;
import model.usuario;

public class interacFunctions { 
    public ArrayList<usuario> usuarios = new ArrayList(); 
    public ArrayList<dispositivo> dispositivos = new ArrayList(); 
    public ArrayList<atividade> atividades = new ArrayList(); 
    public ArrayList<historico> historico = new ArrayList();
    
    ConnectionDB con;
    Statement st;
    ResultSet rs;
    
    public interacFunctions(){
        con = new ConnectionDB();        
    }  
    
    public String getSenha() throws SQLException{
        st = con.conexao.createStatement();
            
        st.executeQuery("select * from gerenciadores");
        rs = st.getResultSet();
        while (rs.next()){
            return rs.getString("senha");
        }
        return "";
    }
        
    public void reloadSelect(String table){        
        try{
            st = con.conexao.createStatement();
            
            st.executeQuery("select * from "+table);
            st.closeOnCompletion();
            rs = st.getResultSet();           
           
            if (table=="usuarios"){
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
                    dispositivos.add(new dispositivo(rs.getString("nome"),rs.getString("id")+"",rs.getString("obs"),Double.parseDouble(rs.getString("tempoDeUso")),act));
                }
            }
            
            if (table=="atividade"){                
                atividades.clear();
                while(rs.next()){                    
                    boolean act;                      
                    if (rs.getString("automatic").equals("1")){act = true;}
                    else{act=false;}                 
                    atividades.add(new atividade(rs.getString("userName"),rs.getString("userId"),rs.getString("dispName"),rs.getString("dispId"),act,rs.getString("dataInicial"),rs.getString("dataFinal"),rs.getString("id")));                    
                }
            } 
            if (table=="historico"){
                historico.clear();
                while(rs.next()){                                                                                    
                    historico.add(new historico(rs.getString("userName"),rs.getString("dispName"),rs.getString("useData"),rs.getString("id")));
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

            rs = st.getResultSet();           
           
            if (table=="usuarios"){
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
                    atividades.add(new atividade(rs.getString("userName"),rs.getString("userId"),rs.getString("dispName"),rs.getString("dispId"),act,rs.getString("dataInicial"),rs.getString("dataFinal"),rs.getString("id")));
                }
            }
            if (table=="historico"){
                historico.clear();
                while(rs.next()){                                                                                    
                    historico.add(new historico(rs.getString("userName"),rs.getString("dispName"),rs.getString("useData"),rs.getString("id")));
                }
            }
                        
            st.closeOnCompletion();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no banco de dados");
        }
    }
    
    //sobrecarregar
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
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuario");
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
                st.executeUpdate("insert into atividade values ("+dados[0]+","+dados[1]+","+dados[2]+","+dados[3]+","+dados[4]+","+dados[5]+","+dados[6]+",default)");                
            }
            if (tipo=="historico"){               
                st.executeUpdate("insert into historico values ("+dados[0]+","+dados[1]+","+dados[2]+",default)");                
            }
            st.closeOnCompletion();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados");
        }
    }
    
    public int[] getColors() throws SQLException{
        st = con.conexao.createStatement();
            
        st.executeQuery("select * from gerenciadores");
        rs = st.getResultSet();
        String cor="";
        int color[] = new int[9];
        while (rs.next()){
            cor = rs.getString("cores");
        }
        String[] corStr = cor.split(",");
        color[0] = Integer.parseInt(corStr[0]);
        color[1] = Integer.parseInt(corStr[1]);
        color[2] = Integer.parseInt(corStr[2]);
        color[3] = Integer.parseInt(corStr[3]);
        color[4] = Integer.parseInt(corStr[4]);
        color[5] = Integer.parseInt(corStr[5]);
        color[6] = Integer.parseInt(corStr[6]);
        color[7] = Integer.parseInt(corStr[7]);
        color[8] = Integer.parseInt(corStr[8]);
        return color;
    }
    
    
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
                if (dados[0].equalsIgnoreCase(getSenha())){
                    st.executeUpdate("update gerenciadores set senha = "+dados[1]+" where id=1");
                }
                else{
                    JOptionPane.showMessageDialog(null, "A senha atual está incorreta");
                }
            }
            if (tipo=="cores"){
                st.executeUpdate("update gerenciadores set cores = "+dados[0]+","+dados[1]+","+dados[2]+" where id=1");
            }
            st.closeOnCompletion();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados");
        }
    }
    
    public void parseToTable(ArrayList arl, DefaultTableModel dtmTable, String tipo){
        clearTable(dtmTable);
        
        try{            
            for(int i = 0; i<arl.size();i++){                               
                if (tipo=="usuarios"){
                    ArrayList<usuario> al = arl;
                    usuario atual = al.get(i); 
                    String stt;
                    if (atual.isStatus()){stt = "Ativo";}
                    else{stt = "Inativo";}
                    String data[]={atual.getNome(),atual.getTelefone(),atual.getTurma(),stt,atual.getID()+""};                    
                    dtmTable.addRow(data);                    
                }
                if (tipo=="dispositivos"){
                    ArrayList<dispositivo> al = arl;
                    dispositivo atual = al.get(i); 
                    String stt;
                    if (atual.isStatus()){stt = "Ativo";}
                    else{stt = "Inativo";}
                    String data[]={atual.getNome(),atual.getID(),atual.getObservacoes(),atual.convertTime()+"",stt};                    
                    dtmTable.addRow(data);                    
                }
                if (tipo=="atividades"){
                    ArrayList<atividade> al = arl;
                    atividade atual = al.get(i); 
                    String stt;
                    if (atual.isAutomatic()){stt = "Automárico";}
                    else{stt = "Não automático";}
                    String data[]={atual.getUsuario(),atual.getDispositivo(),atual.formatedTime(),stt};                    
                    dtmTable.addRow(data);                    
                }
                if (tipo=="historico"){
                    System.out.println("dsad");
                    ArrayList<historico> al = arl;                    
                    historico atual = al.get(i);                    
                    String data[]={atual.getUserName(),atual.getDispName(),atual.getData()};
                    dtmTable.addRow(data);
                }
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao passar dados para a tabela");
        }
    }    
   
    public void parseToCombo(ArrayList arl, JComboBox jb, String tipo){
        ArrayList<usuario> us = new ArrayList();
        ArrayList<dispositivo> ds = new ArrayList();
        jb.removeAll();
        jb.addItem("Selecione");
        if (tipo=="usuario"){
            us = arl;
            for (int i=0;i < arl.size();i++){
                jb.addItem(us.get(i).getNome());
            }
        }
        if (tipo=="dispositivo"){
            ds = arl;
            for (int i=0;i < arl.size();i++){
                jb.addItem(ds.get(i).getNome());
            }
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

