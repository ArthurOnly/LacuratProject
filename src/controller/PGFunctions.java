package controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.atividade;
import model.dispositivo;
import model.historico;
import model.usuario;

public class PGFunctions {
    
    DBFunctions bdfunctions = new DBFunctions();
    
    public String getSenha(){
        bdfunctions.reloadSelect("gerenciadores");
        if (bdfunctions.gerenciadores.size()>0){
            return bdfunctions.gerenciadores.get(0)[0];
        }
        else {
            return null;
        }
    }

    public void parseToTable(ArrayList arl, DefaultTableModel dtmTable, String tipo) {
        clearTable(dtmTable);
        try {
            for (int i = 0; i < arl.size(); i++) {
                if (tipo == "usuarios") {
                    ArrayList<usuario> al = arl;
                    usuario atual = al.get(i);
                    String stt;
                    if (atual.isStatus()) {
                        stt = "Ativo";
                    } else {
                        stt = "Inativo";
                    }
                    String[] data = {atual.getNome(), atual.getTelefone(), atual.getTurma(), stt, atual.getID() + ""};
                    dtmTable.addRow(data);
                }
                if (tipo == "dispositivos") {
                    ArrayList<dispositivo> al = arl;
                    dispositivo atual = al.get(i);
                    String stt;
                    if (atual.isStatus()) {
                        stt = "Ativo";
                    } else {
                        stt = "Inativo";
                    }
                    String[] data = {atual.getNome(), atual.getID(), atual.getObservacoes(), atual.convertTime() + "", stt};
                    dtmTable.addRow(data);
                }
                if (tipo == "atividades") {
                    ArrayList<atividade> al = arl;
                    atividade atual = al.get(i);
                    String stt;
                    if (atual.isAutomatic()) {
                        stt = "Autom\u00e1rico";
                    } else {
                        stt = "N\u00e3o autom\u00e1tico";
                    }
                    String[] data = {getUserNameByID(atual.getUsuarioID()), getDispNameByID(atual.getDispositovID()), atual.formatedTime(), stt};
                    dtmTable.addRow(data);
                }
                if (tipo == "historico") {
                    ArrayList<historico> al = arl;
                    historico atual = al.get(i);
                    String[] data = {getUserNameByID(atual.getUserId()), getDispNameByID(atual.getDispId()), atual.getData()};
                    dtmTable.addRow(data);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao passar dados para a tabela");
        }
    }

    public int[] getColors(){       
        bdfunctions.reloadSelect("gerenciadores");
        String[] corStr = bdfunctions.gerenciadores.get(0)[1].split(",");
        int[] color = new int[9];
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

    public void parseToCombo(ArrayList arl, JComboBox jb, String tipo) {
        ArrayList<usuario> us = new ArrayList();
        ArrayList<dispositivo> ds = new ArrayList();
        jb.removeAll();
        jb.addItem("Selecione");
        if (tipo == "usuario") {
            us = arl;
            for (int i = 0; i < arl.size(); i++) {
                jb.addItem(us.get(i).getNome());
            }
        }
        if (tipo == "dispositivo") {
            ds = arl;
            for (int i = 0; i < arl.size(); i++) {
                jb.addItem(ds.get(i).getNome());
            }
        }
    }

    public void clearTable(DefaultTableModel dtmTable) {
        int max = dtmTable.getRowCount() - 1;
        if (dtmTable.getRowCount() != 0) {
            while (max > -1) {
                dtmTable.removeRow(max);
                max--;
            }
        }
    }
    
    public String getUserNameByID(String id){
        bdfunctions.reloadSelect("usuarios");        
        for (int i=0;i<bdfunctions.usuarios.size();i++){            
            if (bdfunctions.usuarios.get(i).getID().equals(id)){
                return bdfunctions.usuarios.get(i).getNome();
            }
        }
        return "error";
    }
    public String getDispNameByID(String id){
        bdfunctions.reloadSelect("dispositivos");        
        for (int i=0;i<bdfunctions.dispositivos.size();i++){            
            if (bdfunctions.dispositivos.get(i).getID().equals(id)){
                return bdfunctions.dispositivos.get(i).getNome();
            }
        }
        return "error";
    }
    
    public String getUserIdbyName(String username){
        bdfunctions.reloadSelect("usuarios");        
        for (int i=0;i<bdfunctions.usuarios.size();i++){            
            if (bdfunctions.usuarios.get(i).getNome().equals(username)){
                return bdfunctions.usuarios.get(i).getID();
            }
        }
        return "error";
    }
    public String getDispIdbyName(String dispname){
        bdfunctions.reloadSelect("dispositivos");        
        for (int i=0;i<bdfunctions.dispositivos.size();i++){            
            if (bdfunctions.dispositivos.get(i).getNome().equals(dispname)){
                return bdfunctions.dispositivos.get(i).getID();
            }
        }
        return "error";
    }
}
