package view;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class configuracoes extends javax.swing.JInternalFrame {

   
    public configuracoes() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConfig = new javax.swing.JPanel();
        jLabelAplyColors = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelPersonalizedTheme = new javax.swing.JLabel();
        jTextFieldRed = new javax.swing.JTextField();
        jLabelPersonalizedTheme1 = new javax.swing.JLabel();
        jTextFieldRed1 = new javax.swing.JTextField();
        jLabelPersonalizedTheme2 = new javax.swing.JLabel();
        jTextFieldRed2 = new javax.swing.JTextField();
        jLabelPersonalizedTheme3 = new javax.swing.JLabel();
        jLabelPersonalizedTheme4 = new javax.swing.JLabel();
        jLabelPersonalizedTheme5 = new javax.swing.JLabel();
        jLabelPersonalizedTheme6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabelAplyPassword = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(null);

        jPanelConfig.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConfig.setPreferredSize(new java.awt.Dimension(1000, 720));
        jPanelConfig.setLayout(null);

        jLabelAplyColors.setBackground(new java.awt.Color(16, 125, 172));
        jLabelAplyColors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAplyColors.setText("Aplicar");
        jLabelAplyColors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAplyColors.setOpaque(true);
        jLabelAplyColors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAplyColorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAplyColorsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAplyColorsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelAplyColorsMouseReleased(evt);
            }
        });
        jPanelConfig.add(jLabelAplyColors);
        jLabelAplyColors.setBounds(434, 99, 110, 60);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNome.setText("Configurações");
        jPanelConfig.add(jLabelNome);
        jLabelNome.setBounds(118, 20, 163, 29);

        jLabelPersonalizedTheme.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme.setText("R");
        jPanelConfig.add(jLabelPersonalizedTheme);
        jLabelPersonalizedTheme.setBounds(149, 130, 11, 22);
        jPanelConfig.add(jTextFieldRed);
        jTextFieldRed.setBounds(166, 127, 39, 32);

        jLabelPersonalizedTheme1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme1.setText("Inserir tema personalizado (RGB):");
        jPanelConfig.add(jLabelPersonalizedTheme1);
        jLabelPersonalizedTheme1.setBounds(117, 99, 299, 22);
        jPanelConfig.add(jTextFieldRed1);
        jTextFieldRed1.setBounds(229, 127, 39, 32);

        jLabelPersonalizedTheme2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme2.setText("G");
        jPanelConfig.add(jLabelPersonalizedTheme2);
        jLabelPersonalizedTheme2.setBounds(211, 130, 12, 22);
        jPanelConfig.add(jTextFieldRed2);
        jTextFieldRed2.setBounds(291, 127, 39, 32);

        jLabelPersonalizedTheme3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme3.setText("B");
        jPanelConfig.add(jLabelPersonalizedTheme3);
        jLabelPersonalizedTheme3.setBounds(274, 130, 11, 22);

        jLabelPersonalizedTheme4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme4.setText("Alterar senha padrão:");
        jPanelConfig.add(jLabelPersonalizedTheme4);
        jLabelPersonalizedTheme4.setBounds(117, 220, 184, 22);

        jLabelPersonalizedTheme5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme5.setText("Senha atual:");
        jPanelConfig.add(jLabelPersonalizedTheme5);
        jLabelPersonalizedTheme5.setBounds(117, 254, 98, 22);

        jLabelPersonalizedTheme6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme6.setText("Nova senha:");
        jPanelConfig.add(jLabelPersonalizedTheme6);
        jLabelPersonalizedTheme6.setBounds(117, 288, 98, 22);
        jPanelConfig.add(jPasswordField1);
        jPasswordField1.setBounds(221, 290, 171, 22);
        jPanelConfig.add(jPasswordField2);
        jPasswordField2.setBounds(221, 256, 171, 22);

        jLabelAplyPassword.setBackground(new java.awt.Color(16, 125, 172));
        jLabelAplyPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAplyPassword.setText("Aplicar");
        jLabelAplyPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAplyPassword.setOpaque(true);
        jLabelAplyPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAplyPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAplyPasswordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAplyPasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelAplyPasswordMouseReleased(evt);
            }
        });
        jPanelConfig.add(jLabelAplyPassword);
        jLabelAplyPassword.setBounds(434, 252, 110, 60);
        jPanelConfig.add(jSeparator1);
        jSeparator1.setBounds(116, 197, 430, 10);

        getContentPane().add(jPanelConfig);
        jPanelConfig.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    java.awt.Color secondary = new java.awt.Color(24, 154, 211);
    java.awt.Color primary = new java.awt.Color(16, 125, 172);
    java.awt.Color tertiary = new java.awt.Color(113, 199, 236);
    
    private void jLabelAplyColorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyColorsMouseEntered
        jLabelAplyColors.setBackground(tertiary);
    }//GEN-LAST:event_jLabelAplyColorsMouseEntered

    private void jLabelAplyColorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyColorsMouseExited
        jLabelAplyColors.setBackground(primary);
    }//GEN-LAST:event_jLabelAplyColorsMouseExited

    private void jLabelAplyColorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyColorsMousePressed
        jLabelAplyColors.setBackground(secondary);
    }//GEN-LAST:event_jLabelAplyColorsMousePressed

    private void jLabelAplyColorsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyColorsMouseReleased
        if(jLabelAplyColors.getBackground()==secondary){
            jLabelAplyColors.setBackground(tertiary);
        }        
    }//GEN-LAST:event_jLabelAplyColorsMouseReleased

    private void jLabelAplyPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyPasswordMouseEntered
        jLabelAplyPassword.setBackground(tertiary);
    }//GEN-LAST:event_jLabelAplyPasswordMouseEntered

    private void jLabelAplyPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyPasswordMouseExited
        jLabelAplyPassword.setBackground(primary);
    }//GEN-LAST:event_jLabelAplyPasswordMouseExited

    private void jLabelAplyPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyPasswordMousePressed
        jLabelAplyPassword.setBackground(secondary);
    }//GEN-LAST:event_jLabelAplyPasswordMousePressed

    private void jLabelAplyPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyPasswordMouseReleased
        if(jLabelAplyPassword.getBackground()==secondary){
            jLabelAplyPassword.setBackground(tertiary);
        } 
    }//GEN-LAST:event_jLabelAplyPasswordMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAplyColors;
    private javax.swing.JLabel jLabelAplyPassword;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPersonalizedTheme;
    private javax.swing.JLabel jLabelPersonalizedTheme1;
    private javax.swing.JLabel jLabelPersonalizedTheme2;
    private javax.swing.JLabel jLabelPersonalizedTheme3;
    private javax.swing.JLabel jLabelPersonalizedTheme4;
    private javax.swing.JLabel jLabelPersonalizedTheme5;
    private javax.swing.JLabel jLabelPersonalizedTheme6;
    private javax.swing.JPanel jPanelConfig;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldRed;
    private javax.swing.JTextField jTextFieldRed1;
    private javax.swing.JTextField jTextFieldRed2;
    // End of variables declaration//GEN-END:variables
}
