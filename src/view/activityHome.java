package view;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class activityHome extends javax.swing.JInternalFrame {

   
    public activityHome() {
        initComponents();        
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAutomaticEnd = new javax.swing.ButtonGroup();
        jPanelActivityCRUD = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableDispositivos = new javax.swing.JTable();
        jLabelDelete = new javax.swing.JLabel();
        jLabelADD = new javax.swing.JLabel();
        jLabelAtualizar = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelDispositivo = new javax.swing.JLabel();
        jLabelOBS = new javax.swing.JLabel();
        jComboBoxUser = new javax.swing.JComboBox();
        jComboBoxDispositivo = new javax.swing.JComboBox();
        jLabelUser1 = new javax.swing.JLabel();
        jRadioButtonSectionEndNo = new javax.swing.JRadioButton();
        jRadioButtonSectionEndYes = new javax.swing.JRadioButton();
        jFormattedTextFieldHourLimit = new javax.swing.JFormattedTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(null);

        jPanelActivityCRUD.setBackground(new java.awt.Color(255, 255, 255));
        jPanelActivityCRUD.setPreferredSize(new java.awt.Dimension(1000, 720));
        jPanelActivityCRUD.setLayout(null);

        jScrollPane.setForeground(new java.awt.Color(255, 255, 255));

        jTableDispositivos.setForeground(new java.awt.Color(255, 255, 255));
        jTableDispositivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuário", "Dispositivo", "Cedido até", "Finalizará automaticamente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableDispositivos.setGridColor(new java.awt.Color(204, 204, 204));
        jTableDispositivos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane.setViewportView(jTableDispositivos);

        jPanelActivityCRUD.add(jScrollPane);
        jScrollPane.setBounds(60, 250, 850, 402);

        jLabelDelete.setBackground(new java.awt.Color(16, 125, 172));
        jLabelDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDelete.setText("Deletar");
        jLabelDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDelete.setOpaque(true);
        jLabelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelDeleteMouseReleased(evt);
            }
        });
        jPanelActivityCRUD.add(jLabelDelete);
        jLabelDelete.setBounds(356, 185, 110, 40);

        jLabelADD.setBackground(new java.awt.Color(16, 125, 172));
        jLabelADD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelADD.setText("Adicionar");
        jLabelADD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelADD.setOpaque(true);
        jLabelADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelADDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelADDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelADDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelADDMouseReleased(evt);
            }
        });
        jPanelActivityCRUD.add(jLabelADD);
        jLabelADD.setBounds(108, 185, 110, 40);

        jLabelAtualizar.setBackground(new java.awt.Color(16, 125, 172));
        jLabelAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtualizar.setText("Atualizar");
        jLabelAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAtualizar.setOpaque(true);
        jLabelAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAtualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAtualizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelAtualizarMouseReleased(evt);
            }
        });
        jPanelActivityCRUD.add(jLabelAtualizar);
        jLabelAtualizar.setBounds(232, 185, 110, 40);

        jLabelUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUser.setText("Usuário:");
        jPanelActivityCRUD.add(jLabelUser);
        jLabelUser.setBounds(118, 20, 65, 22);

        jLabelDispositivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDispositivo.setText("Dispositivo:");
        jPanelActivityCRUD.add(jLabelDispositivo);
        jLabelDispositivo.setBounds(118, 86, 119, 22);

        jLabelOBS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelOBS.setText("Finalizar sesão automaticamente?");
        jPanelActivityCRUD.add(jLabelOBS);
        jLabelOBS.setBounds(540, 86, 280, 22);

        jComboBoxUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelActivityCRUD.add(jComboBoxUser);
        jComboBoxUser.setBounds(118, 52, 340, 34);

        jComboBoxDispositivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelActivityCRUD.add(jComboBoxDispositivo);
        jComboBoxDispositivo.setBounds(118, 114, 340, 34);

        jLabelUser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUser1.setText("Tempo cedido (em horas):");
        jPanelActivityCRUD.add(jLabelUser1);
        jLabelUser1.setBounds(538, 20, 220, 22);

        buttonGroupAutomaticEnd.add(jRadioButtonSectionEndNo);
        jRadioButtonSectionEndNo.setText("Não");
        jRadioButtonSectionEndNo.setEnabled(false);
        jPanelActivityCRUD.add(jRadioButtonSectionEndNo);
        jRadioButtonSectionEndNo.setBounds(610, 114, 111, 23);

        buttonGroupAutomaticEnd.add(jRadioButtonSectionEndYes);
        jRadioButtonSectionEndYes.setText("Sim");
        jRadioButtonSectionEndYes.setEnabled(false);
        jPanelActivityCRUD.add(jRadioButtonSectionEndYes);
        jRadioButtonSectionEndYes.setBounds(540, 114, 41, 23);

        try {
            jFormattedTextFieldHourLimit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## hora(s)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHourLimit.setEnabled(false);
        jPanelActivityCRUD.add(jFormattedTextFieldHourLimit);
        jFormattedTextFieldHourLimit.setBounds(610, 50, 250, 34);

        jCheckBox1.setText("Sim");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jPanelActivityCRUD.add(jCheckBox1);
        jCheckBox1.setBounds(540, 44, 60, 40);

        getContentPane().add(jPanelActivityCRUD);
        jPanelActivityCRUD.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    java.awt.Color secondary;
    java.awt.Color primary;
    java.awt.Color tertiary;
    
    public void themeChanger(){
        jLabelADD.setBackground(primary);
        jLabelAtualizar.setBackground(primary);
        jLabelDelete.setBackground(primary);
    }
    
    private void jLabelADDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelADDMouseEntered
        jLabelADD.setBackground(tertiary);
    }//GEN-LAST:event_jLabelADDMouseEntered

    private void jLabelADDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelADDMouseExited
        jLabelADD.setBackground(primary);
    }//GEN-LAST:event_jLabelADDMouseExited

    private void jLabelADDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelADDMousePressed
        jLabelADD.setBackground(secondary);
    }//GEN-LAST:event_jLabelADDMousePressed

    private void jLabelADDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelADDMouseReleased
        if(jLabelADD.getBackground()==secondary){
            jLabelADD.setBackground(tertiary);
        }        
    }//GEN-LAST:event_jLabelADDMouseReleased

    private void jLabelAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarMouseEntered
        jLabelAtualizar.setBackground(tertiary);
    }//GEN-LAST:event_jLabelAtualizarMouseEntered

    private void jLabelAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarMouseExited
        jLabelAtualizar.setBackground(primary);
    }//GEN-LAST:event_jLabelAtualizarMouseExited

    private void jLabelAtualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarMousePressed
        jLabelAtualizar.setBackground(secondary);
    }//GEN-LAST:event_jLabelAtualizarMousePressed

    private void jLabelAtualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarMouseReleased
        if(jLabelAtualizar.getBackground()==secondary){
            jLabelAtualizar.setBackground(tertiary);
        }
    }//GEN-LAST:event_jLabelAtualizarMouseReleased

    private void jLabelDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseEntered
        jLabelDelete.setBackground(tertiary);
    }//GEN-LAST:event_jLabelDeleteMouseEntered

    private void jLabelDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseExited
        jLabelDelete.setBackground(primary);
    }//GEN-LAST:event_jLabelDeleteMouseExited

    private void jLabelDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMousePressed
        jLabelDelete.setBackground(secondary);
    }//GEN-LAST:event_jLabelDeleteMousePressed

    private void jLabelDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseReleased
        if(jLabelDelete.getBackground()==secondary){
            jLabelDelete.setBackground(tertiary);
        }
    }//GEN-LAST:event_jLabelDeleteMouseReleased

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        if (jFormattedTextFieldHourLimit.isEnabled()){
            jFormattedTextFieldHourLimit.setEnabled(false);
            jRadioButtonSectionEndNo.setEnabled(false);
            jRadioButtonSectionEndYes.setEnabled(false);
            
            buttonGroupAutomaticEnd.clearSelection();
            jFormattedTextFieldHourLimit.setText("");            
        }
        else{
            jFormattedTextFieldHourLimit.setEnabled(true);
            jRadioButtonSectionEndNo.setEnabled(true);
            jRadioButtonSectionEndYes.setEnabled(true);
        }        
    }//GEN-LAST:event_jCheckBox1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAutomaticEnd;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBoxDispositivo;
    private javax.swing.JComboBox jComboBoxUser;
    private javax.swing.JFormattedTextField jFormattedTextFieldHourLimit;
    public javax.swing.JLabel jLabelADD;
    public javax.swing.JLabel jLabelAtualizar;
    public javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelDispositivo;
    private javax.swing.JLabel jLabelOBS;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUser1;
    private javax.swing.JPanel jPanelActivityCRUD;
    private javax.swing.JRadioButton jRadioButtonSectionEndNo;
    private javax.swing.JRadioButton jRadioButtonSectionEndYes;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableDispositivos;
    // End of variables declaration//GEN-END:variables
}
