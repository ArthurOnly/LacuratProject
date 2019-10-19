package view;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class configuracoes extends javax.swing.JInternalFrame {

   
    public configuracoes() {
        initComponents();        
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoColor = new javax.swing.ButtonGroup();
        buttonGroupCoresDefault = new javax.swing.ButtonGroup();
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
        jTextFieldRed3 = new javax.swing.JTextField();
        jLabelPersonalizedTheme7 = new javax.swing.JLabel();
        jLabelPersonalizedTheme8 = new javax.swing.JLabel();
        jTextFieldRed4 = new javax.swing.JTextField();
        jLabelPersonalizedTheme9 = new javax.swing.JLabel();
        jTextFieldRed5 = new javax.swing.JTextField();
        jLabelPersonalizedTheme10 = new javax.swing.JLabel();
        jLabelPersonalizedTheme11 = new javax.swing.JLabel();
        jLabelPersonalizedTheme12 = new javax.swing.JLabel();
        jTextFieldRed6 = new javax.swing.JTextField();
        jTextFieldRed7 = new javax.swing.JTextField();
        jLabelPersonalizedTheme13 = new javax.swing.JLabel();
        jTextFieldRed8 = new javax.swing.JTextField();
        jLabelPersonalizedTheme14 = new javax.swing.JLabel();
        jLabelPersonalizedTheme15 = new javax.swing.JLabel();
        jRadioButtonPreDef = new javax.swing.JRadioButton();
        jRadioButtonPers = new javax.swing.JRadioButton();
        jRadioButtonPurple = new javax.swing.JRadioButton();
        jRadioButtonDefault = new javax.swing.JRadioButton();
        jRadioButtonYellow = new javax.swing.JRadioButton();
        jRadioButtonRed = new javax.swing.JRadioButton();

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAplyColorsMouseClicked(evt);
            }
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
        jLabelAplyColors.setBounds(660, 210, 110, 60);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNome.setText("Configurações");
        jPanelConfig.add(jLabelNome);
        jLabelNome.setBounds(118, 20, 163, 29);

        jLabelPersonalizedTheme.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme.setText("R");
        jPanelConfig.add(jLabelPersonalizedTheme);
        jLabelPersonalizedTheme.setBounds(150, 160, 11, 22);
        jPanelConfig.add(jTextFieldRed);
        jTextFieldRed.setBounds(170, 150, 39, 32);

        jLabelPersonalizedTheme1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme1.setText("Cor Secundária");
        jPanelConfig.add(jLabelPersonalizedTheme1);
        jLabelPersonalizedTheme1.setBounds(180, 200, 130, 22);
        jPanelConfig.add(jTextFieldRed1);
        jTextFieldRed1.setBounds(230, 150, 39, 32);

        jLabelPersonalizedTheme2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme2.setText("G");
        jPanelConfig.add(jLabelPersonalizedTheme2);
        jLabelPersonalizedTheme2.setBounds(213, 160, 12, 22);
        jPanelConfig.add(jTextFieldRed2);
        jTextFieldRed2.setBounds(290, 150, 39, 32);

        jLabelPersonalizedTheme3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme3.setText("B");
        jPanelConfig.add(jLabelPersonalizedTheme3);
        jLabelPersonalizedTheme3.setBounds(275, 160, 11, 22);

        jLabelPersonalizedTheme4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme4.setText("Alterar senha padrão:");
        jPanelConfig.add(jLabelPersonalizedTheme4);
        jLabelPersonalizedTheme4.setBounds(120, 420, 184, 22);

        jLabelPersonalizedTheme5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme5.setText("Senha atual:");
        jPanelConfig.add(jLabelPersonalizedTheme5);
        jLabelPersonalizedTheme5.setBounds(120, 450, 98, 22);

        jLabelPersonalizedTheme6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme6.setText("Nova senha:");
        jPanelConfig.add(jLabelPersonalizedTheme6);
        jLabelPersonalizedTheme6.setBounds(120, 490, 98, 22);
        jPanelConfig.add(jPasswordField1);
        jPasswordField1.setBounds(220, 490, 320, 20);
        jPanelConfig.add(jPasswordField2);
        jPasswordField2.setBounds(220, 450, 320, 20);

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
        jLabelAplyPassword.setBounds(660, 450, 110, 60);
        jPanelConfig.add(jSeparator1);
        jSeparator1.setBounds(120, 390, 780, 10);
        jPanelConfig.add(jTextFieldRed3);
        jTextFieldRed3.setBounds(170, 230, 39, 32);

        jLabelPersonalizedTheme7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme7.setText("R");
        jPanelConfig.add(jLabelPersonalizedTheme7);
        jLabelPersonalizedTheme7.setBounds(150, 230, 11, 22);

        jLabelPersonalizedTheme8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme8.setText("G");
        jPanelConfig.add(jLabelPersonalizedTheme8);
        jLabelPersonalizedTheme8.setBounds(213, 230, 12, 22);
        jPanelConfig.add(jTextFieldRed4);
        jTextFieldRed4.setBounds(230, 230, 39, 32);

        jLabelPersonalizedTheme9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme9.setText("B");
        jPanelConfig.add(jLabelPersonalizedTheme9);
        jLabelPersonalizedTheme9.setBounds(275, 230, 11, 22);
        jPanelConfig.add(jTextFieldRed5);
        jTextFieldRed5.setBounds(290, 230, 39, 32);

        jLabelPersonalizedTheme10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme10.setText("Inserir tema personalizado (RGB):");
        jPanelConfig.add(jLabelPersonalizedTheme10);
        jLabelPersonalizedTheme10.setBounds(120, 80, 299, 22);

        jLabelPersonalizedTheme11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme11.setText("Cor primária");
        jPanelConfig.add(jLabelPersonalizedTheme11);
        jLabelPersonalizedTheme11.setBounds(190, 120, 110, 22);

        jLabelPersonalizedTheme12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme12.setText("G");
        jPanelConfig.add(jLabelPersonalizedTheme12);
        jLabelPersonalizedTheme12.setBounds(213, 310, 12, 22);
        jPanelConfig.add(jTextFieldRed6);
        jTextFieldRed6.setBounds(170, 310, 39, 32);
        jPanelConfig.add(jTextFieldRed7);
        jTextFieldRed7.setBounds(230, 310, 39, 32);

        jLabelPersonalizedTheme13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme13.setText("B");
        jPanelConfig.add(jLabelPersonalizedTheme13);
        jLabelPersonalizedTheme13.setBounds(275, 310, 11, 22);
        jPanelConfig.add(jTextFieldRed8);
        jTextFieldRed8.setBounds(290, 310, 39, 32);

        jLabelPersonalizedTheme14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme14.setText("R");
        jPanelConfig.add(jLabelPersonalizedTheme14);
        jLabelPersonalizedTheme14.setBounds(150, 310, 11, 22);

        jLabelPersonalizedTheme15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme15.setText("Cor Terciária");
        jPanelConfig.add(jLabelPersonalizedTheme15);
        jLabelPersonalizedTheme15.setBounds(190, 280, 110, 22);

        buttonGroupTipoColor.add(jRadioButtonPreDef);
        jRadioButtonPreDef.setText("Pré-definido");
        jPanelConfig.add(jRadioButtonPreDef);
        jRadioButtonPreDef.setBounds(450, 360, 130, 23);

        buttonGroupTipoColor.add(jRadioButtonPers);
        jRadioButtonPers.setText("Personalizado");
        jPanelConfig.add(jRadioButtonPers);
        jRadioButtonPers.setBounds(190, 360, 120, 23);

        buttonGroupCoresDefault.add(jRadioButtonPurple);
        jRadioButtonPurple.setText("Roxo");
        jPanelConfig.add(jRadioButtonPurple);
        jRadioButtonPurple.setBounds(450, 240, 93, 23);

        buttonGroupCoresDefault.add(jRadioButtonDefault);
        jRadioButtonDefault.setText("Padrão");
        jPanelConfig.add(jRadioButtonDefault);
        jRadioButtonDefault.setBounds(450, 150, 90, 23);

        buttonGroupCoresDefault.add(jRadioButtonYellow);
        jRadioButtonYellow.setText("Amarelo");
        jPanelConfig.add(jRadioButtonYellow);
        jRadioButtonYellow.setBounds(450, 180, 93, 23);

        buttonGroupCoresDefault.add(jRadioButtonRed);
        jRadioButtonRed.setText("Vermelho");
        jPanelConfig.add(jRadioButtonRed);
        jRadioButtonRed.setBounds(450, 210, 93, 23);

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

    private void jLabelAplyColorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyColorsMouseClicked
        if (buttonGroupTipoColor.isSelected(jRadioButtonPreDef.getModel())){
            if (buttonGroupCoresDefault.isSelected(jRadioButtonYellow.getModel())){
                /*primary = new java.awt.Color(255, 255, 0);
                secondary = new java.awt.Color(204, 204, 0);
                tertiary = new java.awt.Color(255, 255, 153);  */
                //Adcicionar cor aq
            }
        }
    }//GEN-LAST:event_jLabelAplyColorsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCoresDefault;
    private javax.swing.ButtonGroup buttonGroupTipoColor;
    private javax.swing.JLabel jLabelAplyColors;
    private javax.swing.JLabel jLabelAplyPassword;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPersonalizedTheme;
    private javax.swing.JLabel jLabelPersonalizedTheme1;
    private javax.swing.JLabel jLabelPersonalizedTheme10;
    private javax.swing.JLabel jLabelPersonalizedTheme11;
    private javax.swing.JLabel jLabelPersonalizedTheme12;
    private javax.swing.JLabel jLabelPersonalizedTheme13;
    private javax.swing.JLabel jLabelPersonalizedTheme14;
    private javax.swing.JLabel jLabelPersonalizedTheme15;
    private javax.swing.JLabel jLabelPersonalizedTheme2;
    private javax.swing.JLabel jLabelPersonalizedTheme3;
    private javax.swing.JLabel jLabelPersonalizedTheme4;
    private javax.swing.JLabel jLabelPersonalizedTheme5;
    private javax.swing.JLabel jLabelPersonalizedTheme6;
    private javax.swing.JLabel jLabelPersonalizedTheme7;
    private javax.swing.JLabel jLabelPersonalizedTheme8;
    private javax.swing.JLabel jLabelPersonalizedTheme9;
    private javax.swing.JPanel jPanelConfig;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButtonDefault;
    private javax.swing.JRadioButton jRadioButtonPers;
    private javax.swing.JRadioButton jRadioButtonPreDef;
    private javax.swing.JRadioButton jRadioButtonPurple;
    private javax.swing.JRadioButton jRadioButtonRed;
    private javax.swing.JRadioButton jRadioButtonYellow;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldRed;
    private javax.swing.JTextField jTextFieldRed1;
    private javax.swing.JTextField jTextFieldRed2;
    private javax.swing.JTextField jTextFieldRed3;
    private javax.swing.JTextField jTextFieldRed4;
    private javax.swing.JTextField jTextFieldRed5;
    private javax.swing.JTextField jTextFieldRed6;
    private javax.swing.JTextField jTextFieldRed7;
    private javax.swing.JTextField jTextFieldRed8;
    // End of variables declaration//GEN-END:variables
}
