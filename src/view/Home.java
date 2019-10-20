package view;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Home extends javax.swing.JInternalFrame {

   
    public Home() {
        initComponents();        
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConfig = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelPersonalizedTheme10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPersonalizedTheme16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelPersonalizedTheme17 = new javax.swing.JLabel();
        jLabelPersonalizedTheme18 = new javax.swing.JLabel();
        jLabelPersonalizedTheme19 = new javax.swing.JLabel();
        jLabelPersonalizedTheme20 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(null);

        jPanelConfig.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConfig.setPreferredSize(new java.awt.Dimension(1000, 720));
        jPanelConfig.setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNome.setText("Bem vindo!");
        jPanelConfig.add(jLabelNome);
        jLabelNome.setBounds(118, 20, 163, 29);

        jLabelPersonalizedTheme10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme10.setText("70 dispositivos cadastrados");
        jPanelConfig.add(jLabelPersonalizedTheme10);
        jLabelPersonalizedTheme10.setBounds(180, 300, 230, 22);

        jLabel1.setOpaque(true);
        jPanelConfig.add(jLabel1);
        jLabel1.setBounds(90, 280, 70, 70);

        jLabel2.setOpaque(true);
        jPanelConfig.add(jLabel2);
        jLabel2.setBounds(90, 180, 70, 70);

        jLabelPersonalizedTheme16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme16.setText("Sesões que finalizarão automaticamente");
        jPanelConfig.add(jLabelPersonalizedTheme16);
        jLabelPersonalizedTheme16.setBounds(510, 410, 320, 22);

        jLabel3.setOpaque(true);
        jPanelConfig.add(jLabel3);
        jLabel3.setBounds(90, 380, 70, 70);

        jLabelPersonalizedTheme17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme17.setText("70 dispositivos em uso");
        jPanelConfig.add(jLabelPersonalizedTheme17);
        jLabelPersonalizedTheme17.setBounds(180, 400, 230, 22);

        jLabelPersonalizedTheme18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme18.setText("70 usuários cadastrados");
        jPanelConfig.add(jLabelPersonalizedTheme18);
        jLabelPersonalizedTheme18.setBounds(180, 200, 299, 22);

        jLabelPersonalizedTheme19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme19.setText("Dados gerais");
        jPanelConfig.add(jLabelPersonalizedTheme19);
        jLabelPersonalizedTheme19.setBounds(90, 130, 130, 22);

        jLabelPersonalizedTheme20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme20.setText("Sesões que necessitam ser expiradas manualmente");
        jPanelConfig.add(jLabelPersonalizedTheme20);
        jLabelPersonalizedTheme20.setBounds(510, 130, 430, 22);

        getContentPane().add(jPanelConfig);
        jPanelConfig.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Colocar no construtor
    //java.awt.Color secondary = new java.awt.Color(24, 154, 211);
    //java.awt.Color primary = new java.awt.Color(16, 125, 172);
    //java.awt.Color tertiary = new java.awt.Color(113, 199, 236);    
    
    java.awt.Color primary;
    java.awt.Color secondary;
    java.awt.Color tertiary;
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPersonalizedTheme10;
    private javax.swing.JLabel jLabelPersonalizedTheme16;
    private javax.swing.JLabel jLabelPersonalizedTheme17;
    private javax.swing.JLabel jLabelPersonalizedTheme18;
    private javax.swing.JLabel jLabelPersonalizedTheme19;
    private javax.swing.JLabel jLabelPersonalizedTheme20;
    private javax.swing.JPanel jPanelConfig;
    // End of variables declaration//GEN-END:variables
}
