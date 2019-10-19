package view;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class historyHome extends javax.swing.JInternalFrame {

   
    public historyHome() {
        initComponents();        
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAutomaticEnd = new javax.swing.ButtonGroup();
        jPanelActivityCRUD = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableHistorico = new javax.swing.JTable();
        jLabelDelete = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelDispositivo = new javax.swing.JLabel();
        jComboBoxUser = new javax.swing.JComboBox();
        jComboBoxDispositivo = new javax.swing.JComboBox();
        jTextFieldUser = new javax.swing.JTextField();
        jTextFieldUser1 = new javax.swing.JTextField();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(null);

        jPanelActivityCRUD.setBackground(new java.awt.Color(255, 255, 255));
        jPanelActivityCRUD.setPreferredSize(new java.awt.Dimension(1000, 720));
        jPanelActivityCRUD.setLayout(null);

        jScrollPane.setForeground(new java.awt.Color(255, 255, 255));

        jTableHistorico.setForeground(new java.awt.Color(255, 255, 255));
        jTableHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuário", "Dispositivo", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableHistorico.setGridColor(new java.awt.Color(204, 204, 204));
        jTableHistorico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane.setViewportView(jTableHistorico);

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
        jLabelDelete.setBounds(430, 190, 110, 40);

        jLabelUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUser.setText("Usuário:");
        jPanelActivityCRUD.add(jLabelUser);
        jLabelUser.setBounds(280, 20, 65, 22);

        jLabelDispositivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDispositivo.setText("Dispositivo:");
        jPanelActivityCRUD.add(jLabelDispositivo);
        jLabelDispositivo.setBounds(280, 90, 119, 22);

        jComboBoxUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelActivityCRUD.add(jComboBoxUser);
        jComboBoxUser.setBounds(580, 50, 180, 30);

        jComboBoxDispositivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelActivityCRUD.add(jComboBoxDispositivo);
        jComboBoxDispositivo.setBounds(580, 110, 180, 30);

        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        jPanelActivityCRUD.add(jTextFieldUser);
        jTextFieldUser.setBounds(280, 110, 300, 30);

        jTextFieldUser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanelActivityCRUD.add(jTextFieldUser1);
        jTextFieldUser1.setBounds(280, 50, 300, 30);

        getContentPane().add(jPanelActivityCRUD);
        jPanelActivityCRUD.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    java.awt.Color secondary;
    java.awt.Color primary;
    java.awt.Color tertiary;
    
    public void themeChanger(){        
        jLabelDelete.setBackground(primary);
    }
    
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

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAutomaticEnd;
    private javax.swing.JComboBox jComboBoxDispositivo;
    private javax.swing.JComboBox jComboBoxUser;
    public javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelDispositivo;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelActivityCRUD;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableHistorico;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JTextField jTextFieldUser1;
    // End of variables declaration//GEN-END:variables
}
