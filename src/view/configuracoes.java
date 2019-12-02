package view;

import controller.DBFunctions;
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

        buttonGroupCoresDefault = new javax.swing.ButtonGroup();
        jPanelConfig = new javax.swing.JPanel();
        jLabelAplyColors = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelPersonalizedTheme = new javax.swing.JLabel();
        jLabelPersonalizedTheme1 = new javax.swing.JLabel();
        jLabelPersonalizedTheme4 = new javax.swing.JLabel();
        jLabelPersonalizedTheme5 = new javax.swing.JLabel();
        jLabelPersonalizedTheme6 = new javax.swing.JLabel();
        jPasswordSenhaNova = new javax.swing.JPasswordField();
        jPasswordSenhaAtual = new javax.swing.JPasswordField();
        jLabelAplyPassword = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPersonalizedTheme10 = new javax.swing.JLabel();
        jLabelPersonalizedTheme11 = new javax.swing.JLabel();
        jLabelPersonalizedTheme15 = new javax.swing.JLabel();
        jRadioButtonPurple = new javax.swing.JRadioButton();
        jRadioButtonDefault = new javax.swing.JRadioButton();
        jRadioButtonYellow = new javax.swing.JRadioButton();
        jRadioButtonRed = new javax.swing.JRadioButton();
        jLabelPersonalizedTheme16 = new javax.swing.JLabel();
        jFormattedTextFieldTertiary = new javax.swing.JFormattedTextField();
        jFormattedTextPrimary = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSecondary = new javax.swing.JFormattedTextField();
        jRadioButtonTemaPronto = new javax.swing.JRadioButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
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
        jLabelPersonalizedTheme.setText("exemplo: 122,122,122");
        jPanelConfig.add(jLabelPersonalizedTheme);
        jLabelPersonalizedTheme.setBounds(150, 360, 200, 22);

        jLabelPersonalizedTheme1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme1.setText("Cor Secundária");
        jPanelConfig.add(jLabelPersonalizedTheme1);
        jLabelPersonalizedTheme1.setBounds(180, 200, 130, 22);

        jLabelPersonalizedTheme4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme4.setText("Alterar senha padrão:");
        jPanelConfig.add(jLabelPersonalizedTheme4);
        jLabelPersonalizedTheme4.setBounds(120, 420, 184, 22);

        jLabelPersonalizedTheme5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme5.setText("Senha atual:");
        jPanelConfig.add(jLabelPersonalizedTheme5);
        jLabelPersonalizedTheme5.setBounds(120, 460, 98, 22);

        jLabelPersonalizedTheme6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme6.setText("Nova senha:");
        jPanelConfig.add(jLabelPersonalizedTheme6);
        jLabelPersonalizedTheme6.setBounds(120, 500, 98, 22);

        jPasswordSenhaNova.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanelConfig.add(jPasswordSenhaNova);
        jPasswordSenhaNova.setBounds(220, 490, 320, 30);

        jPasswordSenhaAtual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanelConfig.add(jPasswordSenhaAtual);
        jPasswordSenhaAtual.setBounds(220, 450, 320, 30);

        jLabelAplyPassword.setBackground(new java.awt.Color(16, 125, 172));
        jLabelAplyPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAplyPassword.setText("Aplicar");
        jLabelAplyPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAplyPassword.setOpaque(true);
        jLabelAplyPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAplyPasswordMouseClicked(evt);
            }
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

        jLabelPersonalizedTheme10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme10.setText("Inserir tema personalizado (RGB):");
        jPanelConfig.add(jLabelPersonalizedTheme10);
        jLabelPersonalizedTheme10.setBounds(120, 80, 299, 22);

        jLabelPersonalizedTheme11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme11.setText("Temas prontos");
        jPanelConfig.add(jLabelPersonalizedTheme11);
        jLabelPersonalizedTheme11.setBounds(420, 130, 130, 22);

        jLabelPersonalizedTheme15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme15.setText("Cor Terciária");
        jPanelConfig.add(jLabelPersonalizedTheme15);
        jLabelPersonalizedTheme15.setBounds(190, 280, 110, 22);

        buttonGroupCoresDefault.add(jRadioButtonPurple);
        jRadioButtonPurple.setText("Roxo");
        jPanelConfig.add(jRadioButtonPurple);
        jRadioButtonPurple.setBounds(440, 250, 93, 28);

        buttonGroupCoresDefault.add(jRadioButtonDefault);
        jRadioButtonDefault.setText("Azul");
        jPanelConfig.add(jRadioButtonDefault);
        jRadioButtonDefault.setBounds(440, 160, 90, 28);

        buttonGroupCoresDefault.add(jRadioButtonYellow);
        jRadioButtonYellow.setText("Amarelo");
        jPanelConfig.add(jRadioButtonYellow);
        jRadioButtonYellow.setBounds(440, 190, 93, 28);

        buttonGroupCoresDefault.add(jRadioButtonRed);
        jRadioButtonRed.setText("Vermelho");
        jPanelConfig.add(jRadioButtonRed);
        jRadioButtonRed.setBounds(440, 220, 93, 28);

        jLabelPersonalizedTheme16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPersonalizedTheme16.setText("Cor primária");
        jPanelConfig.add(jLabelPersonalizedTheme16);
        jLabelPersonalizedTheme16.setBounds(190, 130, 110, 22);

        try {
            jFormattedTextFieldTertiary.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###,###,###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelConfig.add(jFormattedTextFieldTertiary);
        jFormattedTextFieldTertiary.setBounds(170, 310, 160, 35);

        try {
            jFormattedTextPrimary.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###,###,###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelConfig.add(jFormattedTextPrimary);
        jFormattedTextPrimary.setBounds(170, 160, 160, 35);

        try {
            jFormattedTextFieldSecondary.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###,###,###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelConfig.add(jFormattedTextFieldSecondary);
        jFormattedTextFieldSecondary.setBounds(170, 230, 160, 35);

        jRadioButtonTemaPronto.setText("Usar tema pronto");
        jRadioButtonTemaPronto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonTemaProntoItemStateChanged(evt);
            }
        });
        jRadioButtonTemaPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTemaProntoActionPerformed(evt);
            }
        });
        jPanelConfig.add(jRadioButtonTemaPronto);
        jRadioButtonTemaPronto.setBounds(440, 280, 150, 28);

        getContentPane().add(jPanelConfig);
        jPanelConfig.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    DBFunctions bdfunctions = new DBFunctions();
    java.awt.Color primary;
    java.awt.Color secondary;
    java.awt.Color tertiary;
    
    
    public void themeChanger(java.awt.Color primary, java.awt.Color secondary, java.awt.Color tertiary){
        this.primary=primary;
        this.secondary=secondary;
        this.tertiary=tertiary;
        jLabelAplyColors.setBackground(primary);
        jLabelAplyPassword.setBackground(primary);
    }
    
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
        String dados[] = new String[3];
        if (jRadioButtonTemaPronto.isSelected()==false){
            dados[0] = jFormattedTextPrimary.getText();
            dados[1] = jFormattedTextFieldSecondary.getText();
            dados[2] = jFormattedTextFieldTertiary.getText();
        }
        else{
            if (jRadioButtonDefault.isSelected()){
                dados[0] = "016,125,172";
                dados[1] = "024,154,211";
                dados[2] = "113,199,236";
            }
            if (jRadioButtonPurple.isSelected()){
                dados[0] = "138,043,226";
                dados[1] = "148,000,211";
                dados[2] = "153,050,204";
            }
            if (jRadioButtonRed.isSelected()){
                dados[0] = "255,000,000";
                dados[1] = "178,034,034";
                dados[2] = "139,000,000";
            }
            if (jRadioButtonYellow.isSelected()){
                dados[0] = "240,230,140";
                dados[1] = "255,255,000";
                dados[2] = "232,238,170";
            }
        }
        bdfunctions.updateValue("cores", dados);
        JOptionPane.showMessageDialog(null, "Reaabra o programa para cosolidar as alterações");
    }//GEN-LAST:event_jLabelAplyColorsMouseClicked

    private void jLabelAplyPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAplyPasswordMouseClicked
        String dados[] = new String[2];
        dados[0]=jPasswordSenhaAtual.getText();
        dados[1]=jPasswordSenhaNova.getText();
        bdfunctions.updateValue("senha", dados);
        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");
    }//GEN-LAST:event_jLabelAplyPasswordMouseClicked

    private void jRadioButtonTemaProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTemaProntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTemaProntoActionPerformed

    private void jRadioButtonTemaProntoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonTemaProntoItemStateChanged
        if (jRadioButtonPurple.isEnabled()){
            jRadioButtonPurple.setEnabled(false);
            jRadioButtonRed.setEnabled(false);
            jRadioButtonYellow.setEnabled(false);
            jRadioButtonDefault.setEnabled(false);
            
            jFormattedTextFieldSecondary.setEnabled(true);
            jFormattedTextPrimary.setEnabled(true);
            jFormattedTextFieldTertiary.setEnabled(true);
        }
        else{
            jRadioButtonPurple.setEnabled(true);
            jRadioButtonRed.setEnabled(true);
            jRadioButtonYellow.setEnabled(true);
            jRadioButtonDefault.setEnabled(true);
            
            jFormattedTextFieldSecondary.setEnabled(false);
            jFormattedTextPrimary.setEnabled(false);
            jFormattedTextFieldTertiary.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButtonTemaProntoItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jRadioButtonTemaPronto.setSelected(false);
        jRadioButtonPurple.setEnabled(false);
        jRadioButtonRed.setEnabled(false);
        jRadioButtonYellow.setEnabled(false);
        jRadioButtonDefault.setEnabled(false);
            
        jFormattedTextFieldSecondary.setEnabled(true);
        jFormattedTextPrimary.setEnabled(true);
        jFormattedTextFieldTertiary.setEnabled(true);
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCoresDefault;
    private javax.swing.JFormattedTextField jFormattedTextFieldSecondary;
    private javax.swing.JFormattedTextField jFormattedTextFieldTertiary;
    private javax.swing.JFormattedTextField jFormattedTextPrimary;
    private javax.swing.JLabel jLabelAplyColors;
    private javax.swing.JLabel jLabelAplyPassword;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPersonalizedTheme;
    private javax.swing.JLabel jLabelPersonalizedTheme1;
    private javax.swing.JLabel jLabelPersonalizedTheme10;
    private javax.swing.JLabel jLabelPersonalizedTheme11;
    private javax.swing.JLabel jLabelPersonalizedTheme15;
    private javax.swing.JLabel jLabelPersonalizedTheme16;
    private javax.swing.JLabel jLabelPersonalizedTheme4;
    private javax.swing.JLabel jLabelPersonalizedTheme5;
    private javax.swing.JLabel jLabelPersonalizedTheme6;
    private javax.swing.JPanel jPanelConfig;
    private javax.swing.JPasswordField jPasswordSenhaAtual;
    private javax.swing.JPasswordField jPasswordSenhaNova;
    private javax.swing.JRadioButton jRadioButtonDefault;
    private javax.swing.JRadioButton jRadioButtonPurple;
    private javax.swing.JRadioButton jRadioButtonRed;
    private javax.swing.JRadioButton jRadioButtonTemaPronto;
    private javax.swing.JRadioButton jRadioButtonYellow;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
