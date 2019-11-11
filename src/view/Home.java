package view;

import controller.interacFunctions;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Home extends javax.swing.JInternalFrame {

    public Home() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        homeRealTime();
    }

    interacFunctions bdfunctions = new interacFunctions();

    void themeChanger() {
        jLabelBG50.setBackground(secondary);
    }

    void verifyModels() {
        if (bdfunctions.usuarios.size() < 2) {
            jLabelUserCad.setText(bdfunctions.usuarios.size() + " usuário cadastrado!");
        } else {
            jLabelUserCad.setText(bdfunctions.usuarios.size() + " usuários cadastrados!");
        }
        if (bdfunctions.dispositivos.size() < 2) {
            jLabelDispCad.setText(bdfunctions.dispositivos.size() + " dispositivo cadastrado!");
        } else {
            jLabelDispCad.setText(bdfunctions.dispositivos.size() + " dispositivos cadastrados!");
        }
        if (bdfunctions.atividades.size() < 2) {
            jLabelDispUse.setText(bdfunctions.atividades.size() + " dispositivo em uso!");
        } else {
            jLabelDispUse.setText(bdfunctions.atividades.size() + " dispositivos em uso!");
        }
        if (bdfunctions.historico.size() < 2) {
            jLabelRegistros.setText(bdfunctions.historico.size() + " registro encontrado!");
        } else {
            jLabelRegistros.setText(bdfunctions.historico.size() + " registros encontrados!");
        }
    }
    
    void verifyTypeOfSesions() throws ParseException{
        int automaticas=0;
        int manuais=0;
        int ultrapassaram=0;
        int ilimitadas=0;
        for(int i=0;i<bdfunctions.atividades.size();i++){
            if (bdfunctions.atividades.get(i).isAutomatic()){
                automaticas++;
            } else{
                manuais++;
            }
            if (bdfunctions.atividades.get(i).getDataInicial().equalsIgnoreCase(bdfunctions.atividades.get(i).getDataFinal())){
                ilimitadas++;
            }
            if (bdfunctions.atividades.get(i).convertDate(bdfunctions.atividades.get(i).getDataFinal()).before(new Date()) 
                    && bdfunctions.atividades.get(i).isUnlimited()==false){                
                ultrapassaram++;
            }
        }
        if (automaticas<2){
            jLabelAutomaticas.setText("<html>"+automaticas+" seção será finalizada automaticamente</html>");
        } else{
            jLabelAutomaticas.setText("<html>"+automaticas+" seções serão finalizadas automaticamente</html>");
        }
        if (manuais<2){
            jLabelManuais.setText("<html>"+manuais+" seção precisa ser finalizada manualmente</html>");
        } else{
            jLabelManuais.setText("<html>"+manuais+" seções precisam ser finalizadas manualmente</html>");
        }
        if (ultrapassaram<2){
            jLabelUtrapassaram.setText("<html>"+ultrapassaram+" seção manual já ultrapassou o tempo definido</html>");
        } else{
            jLabelUtrapassaram.setText("<html>"+ultrapassaram+" seções manuais já ultrapassaram o tempo definido</html>");
        }
        if (ilimitadas<2){
            jLabelIlimitadas.setText("<html>"+ilimitadas+ " seção possí tempo ilimitado</html>");
        } else{
            jLabelIlimitadas.setText("<html>"+ilimitadas+ " seções possuem tempo ilimitado</html>");
        }
    }

    void homeRealTime() {
        new Thread() {
            public void run() {
                while (true) {
                    bdfunctions.reloadSelect("usuarios");
                    bdfunctions.reloadSelect("dispositivos");
                    bdfunctions.reloadSelect("atividade");
                    bdfunctions.reloadSelect("historico");
                    verifyModels();
                    try {
                        verifyTypeOfSesions();
                    } catch (ParseException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConfig = new javax.swing.JPanel();
        jLabelRegistros = new javax.swing.JLabel();
        jLabelRegImg = new javax.swing.JLabel();
        jLabelManuais = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelBemVindo = new javax.swing.JLabel();
        jLabelDispCad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDispUse = new javax.swing.JLabel();
        jLabelUserCad = new javax.swing.JLabel();
        jLabelDadosGerais = new javax.swing.JLabel();
        jLabelBG50 = new javax.swing.JLabel();
        jLabelUtrapassaram = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelAutomaticas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelIlimitadas = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(null);

        jPanelConfig.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConfig.setPreferredSize(new java.awt.Dimension(1000, 720));
        jPanelConfig.setLayout(null);

        jLabelRegistros.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelRegistros.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistros.setText("70 registros");
        jPanelConfig.add(jLabelRegistros);
        jLabelRegistros.setBounds(150, 510, 260, 29);

        jLabelRegImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historico.png"))); // NOI18N
        jPanelConfig.add(jLabelRegImg);
        jLabelRegImg.setBounds(90, 500, 45, 45);

        jLabelManuais.setBackground(new java.awt.Color(255, 255, 255));
        jLabelManuais.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelManuais.setForeground(new java.awt.Color(0, 0, 0));
        jLabelManuais.setText("<html>70 seções precisam ser <br>finalizadas manualmente</html>");
        jPanelConfig.add(jLabelManuais);
        jLabelManuais.setBounds(570, 90, 299, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pcBlack.png"))); // NOI18N
        jPanelConfig.add(jLabel6);
        jLabel6.setBounds(520, 90, 45, 45);

        jLabelBemVindo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBemVindo.setText("Bem vindo!");
        jPanelConfig.add(jLabelBemVindo);
        jLabelBemVindo.setBounds(90, 50, 163, 29);

        jLabelDispCad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDispCad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDispCad.setText("70 dispositivos cadastrados");
        jPanelConfig.add(jLabelDispCad);
        jLabelDispCad.setBounds(150, 320, 310, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pc.png"))); // NOI18N
        jPanelConfig.add(jLabel1);
        jLabel1.setBounds(90, 310, 45, 45);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person.png"))); // NOI18N
        jPanelConfig.add(jLabel2);
        jLabel2.setBounds(90, 210, 45, 45);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lampada.png"))); // NOI18N
        jPanelConfig.add(jLabel3);
        jLabel3.setBounds(90, 410, 45, 45);

        jLabelDispUse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDispUse.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDispUse.setText("70 dispositivos em uso");
        jPanelConfig.add(jLabelDispUse);
        jLabelDispUse.setBounds(150, 420, 260, 29);

        jLabelUserCad.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUserCad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUserCad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserCad.setText("70 usuários cadastrados");
        jPanelConfig.add(jLabelUserCad);
        jLabelUserCad.setBounds(150, 220, 299, 29);

        jLabelDadosGerais.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelDadosGerais.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDadosGerais.setText("Dados gerais");
        jPanelConfig.add(jLabelDadosGerais);
        jLabelDadosGerais.setBounds(90, 130, 250, 44);

        jLabelBG50.setBackground(secondary);
        jLabelBG50.setOpaque(true);
        jPanelConfig.add(jLabelBG50);
        jLabelBG50.setBounds(0, 0, 500, 710);

        jLabelUtrapassaram.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUtrapassaram.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUtrapassaram.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUtrapassaram.setText("<html>70 seções manuais já ultrapassaram o tempo definido</html>");
        jPanelConfig.add(jLabelUtrapassaram);
        jLabelUtrapassaram.setBounds(570, 210, 270, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pcBlack.png"))); // NOI18N
        jPanelConfig.add(jLabel7);
        jLabel7.setBounds(520, 220, 45, 45);

        jLabelAutomaticas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAutomaticas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAutomaticas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAutomaticas.setText("<html>70 seções serão finalizadas automaticamente</html>");
        jPanelConfig.add(jLabelAutomaticas);
        jLabelAutomaticas.setBounds(570, 370, 299, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pcBlack.png"))); // NOI18N
        jPanelConfig.add(jLabel8);
        jLabel8.setBounds(520, 370, 45, 45);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pcBlack.png"))); // NOI18N
        jPanelConfig.add(jLabel9);
        jLabel9.setBounds(520, 510, 45, 45);

        jLabelIlimitadas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIlimitadas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelIlimitadas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIlimitadas.setText("<html>70 seções possuem tempo ilimitado</html>");
        jPanelConfig.add(jLabelIlimitadas);
        jLabelIlimitadas.setBounds(570, 510, 299, 50);

        getContentPane().add(jPanelConfig);
        jPanelConfig.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    java.awt.Color primary;
    java.awt.Color secondary;
    java.awt.Color tertiary;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAutomaticas;
    private javax.swing.JLabel jLabelBG50;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JLabel jLabelDadosGerais;
    private javax.swing.JLabel jLabelDispCad;
    private javax.swing.JLabel jLabelDispUse;
    private javax.swing.JLabel jLabelIlimitadas;
    private javax.swing.JLabel jLabelManuais;
    private javax.swing.JLabel jLabelRegImg;
    private javax.swing.JLabel jLabelRegistros;
    private javax.swing.JLabel jLabelUserCad;
    private javax.swing.JLabel jLabelUtrapassaram;
    private javax.swing.JPanel jPanelConfig;
    // End of variables declaration//GEN-END:variables
}
