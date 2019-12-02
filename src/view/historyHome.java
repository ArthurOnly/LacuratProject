package view;

import controller.DBFunctions;
import controller.PGFunctions;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class historyHome extends javax.swing.JInternalFrame {

    DefaultTableModel dtmHist;
    public historyHome() {
        initComponents();        
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        dtmHist = (DefaultTableModel) jTableHistorico.getModel(); 
        jTableHistorico.setRowSorter(new TableRowSorter(dtmHist));
    }
    
    public void themeChanger(java.awt.Color primary, java.awt.Color secondary, java.awt.Color tertiary){
        this.primary=primary;
        this.secondary=secondary;
        this.tertiary=tertiary;
        jLabelDelete.setBackground(primary);
        jLabelPesquisarPorNome.setBackground(primary);
        jLabelPesquisarPorDisp.setBackground(primary);
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
        jTextFieldDisp = new javax.swing.JTextField();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelPesquisarPorNome = new javax.swing.JLabel();
        jLabelPesquisarPorDisp = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanelActivityCRUD.setBackground(new java.awt.Color(255, 255, 255));
        jPanelActivityCRUD.setPreferredSize(new java.awt.Dimension(1000, 720));
        jPanelActivityCRUD.setLayout(null);

        jScrollPane.setForeground(new java.awt.Color(255, 255, 255));

        jTableHistorico.setForeground(new java.awt.Color(0, 0, 0));
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeleteMouseClicked(evt);
            }
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
        jLabelUser.setBounds(300, 20, 65, 22);

        jLabelDispositivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDispositivo.setText("Dispositivo:");
        jPanelActivityCRUD.add(jLabelDispositivo);
        jLabelDispositivo.setBounds(300, 90, 119, 22);

        jTextFieldDisp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDispActionPerformed(evt);
            }
        });
        jTextFieldDisp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDispKeyPressed(evt);
            }
        });
        jPanelActivityCRUD.add(jTextFieldDisp);
        jTextFieldDisp.setBounds(300, 110, 300, 35);

        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUserKeyPressed(evt);
            }
        });
        jPanelActivityCRUD.add(jTextFieldUser);
        jTextFieldUser.setBounds(300, 50, 300, 35);

        jLabelPesquisarPorNome.setBackground(new java.awt.Color(16, 125, 172));
        jLabelPesquisarPorNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesquisarPorNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jLabelPesquisarPorNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPesquisarPorNome.setMaximumSize(new java.awt.Dimension(35, 35));
        jLabelPesquisarPorNome.setOpaque(true);
        jLabelPesquisarPorNome.setPreferredSize(new java.awt.Dimension(35, 35));
        jLabelPesquisarPorNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNomeMouseReleased(evt);
            }
        });
        jPanelActivityCRUD.add(jLabelPesquisarPorNome);
        jLabelPesquisarPorNome.setBounds(610, 50, 35, 35);

        jLabelPesquisarPorDisp.setBackground(new java.awt.Color(16, 125, 172));
        jLabelPesquisarPorDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesquisarPorDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jLabelPesquisarPorDisp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPesquisarPorDisp.setMaximumSize(new java.awt.Dimension(35, 35));
        jLabelPesquisarPorDisp.setOpaque(true);
        jLabelPesquisarPorDisp.setPreferredSize(new java.awt.Dimension(35, 35));
        jLabelPesquisarPorDisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorDispMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorDispMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorDispMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorDispMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorDispMouseReleased(evt);
            }
        });
        jPanelActivityCRUD.add(jLabelPesquisarPorDisp);
        jLabelPesquisarPorDisp.setBounds(610, 110, 35, 35);

        getContentPane().add(jPanelActivityCRUD);
        jPanelActivityCRUD.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    java.awt.Color secondary;
    java.awt.Color primary;
    java.awt.Color tertiary;
    
    DBFunctions bdfunctions = new DBFunctions();
    PGFunctions pgfunctions = new PGFunctions();
    
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

    private void jTextFieldDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDispActionPerformed

    private void jLabelPesquisarPorNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNomeMouseClicked
        bdfunctions.reloadSelect("historico", "userName LIKE '"+jTextFieldUser.getText()+"%'");
        pgfunctions.parseToTable(bdfunctions.historico, dtmHist, "historico");
    }//GEN-LAST:event_jLabelPesquisarPorNomeMouseClicked

    private void jLabelPesquisarPorNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNomeMouseEntered
        jLabelPesquisarPorNome.setBackground(tertiary);
    }//GEN-LAST:event_jLabelPesquisarPorNomeMouseEntered

    private void jLabelPesquisarPorNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNomeMouseExited
        jLabelPesquisarPorNome.setBackground(primary);
    }//GEN-LAST:event_jLabelPesquisarPorNomeMouseExited

    private void jLabelPesquisarPorNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNomeMousePressed
        jLabelPesquisarPorNome.setBackground(secondary);
    }//GEN-LAST:event_jLabelPesquisarPorNomeMousePressed

    private void jLabelPesquisarPorNomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNomeMouseReleased
        if(jLabelPesquisarPorNome.getBackground()==secondary){
            jLabelPesquisarPorNome.setBackground(tertiary);
        }
    }//GEN-LAST:event_jLabelPesquisarPorNomeMouseReleased

    private void jLabelPesquisarPorDispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorDispMouseClicked
        bdfunctions.reloadSelect("historico", "dispName LIKE '"+jTextFieldDisp.getText()+"%'");
        pgfunctions.parseToTable(bdfunctions.historico, dtmHist, "historico");
    }//GEN-LAST:event_jLabelPesquisarPorDispMouseClicked

    private void jLabelPesquisarPorDispMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorDispMouseEntered
        jLabelPesquisarPorDisp.setBackground(tertiary);
    }//GEN-LAST:event_jLabelPesquisarPorDispMouseEntered

    private void jLabelPesquisarPorDispMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorDispMouseExited
        jLabelPesquisarPorDisp.setBackground(primary);
    }//GEN-LAST:event_jLabelPesquisarPorDispMouseExited

    private void jLabelPesquisarPorDispMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorDispMousePressed
        jLabelPesquisarPorDisp.setBackground(secondary);
    }//GEN-LAST:event_jLabelPesquisarPorDispMousePressed

    private void jLabelPesquisarPorDispMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorDispMouseReleased
        if(jLabelPesquisarPorDisp.getBackground()==secondary){
            jLabelPesquisarPorDisp.setBackground(tertiary);
        }
    }//GEN-LAST:event_jLabelPesquisarPorDispMouseReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        bdfunctions.reloadSelect("historico");
        pgfunctions.parseToTable(bdfunctions.historico, dtmHist, "historico");        
    }//GEN-LAST:event_formComponentShown

    private void jTextFieldUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUserKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            bdfunctions.reloadSelect("historico", "userName LIKE '"+jTextFieldUser.getText()+"%'");
            pgfunctions.parseToTable(bdfunctions.historico, dtmHist, "historico");
        }
    }//GEN-LAST:event_jTextFieldUserKeyPressed

    private void jTextFieldDispKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDispKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            bdfunctions.reloadSelect("historico", "dispName LIKE '"+jTextFieldDisp.getText()+"%'");
            pgfunctions.parseToTable(bdfunctions.historico, dtmHist, "historico");
        }
    }//GEN-LAST:event_jTextFieldDispKeyPressed

    private void jLabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseClicked
        if (jTableHistorico.getSelectedRow()!=-1){
            int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo deletar este registro?");
            if (input==0){
                bdfunctions.deletSelected(bdfunctions.historico.get(jTableHistorico.getSelectedRow()));
                bdfunctions.reloadSelect("historico");
                pgfunctions.parseToTable(bdfunctions.historico, dtmHist, "historico");                
            }
            if (input==1){                    
                
            }            
        }
    }//GEN-LAST:event_jLabelDeleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAutomaticEnd;
    public javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelDispositivo;
    private javax.swing.JLabel jLabelPesquisarPorDisp;
    private javax.swing.JLabel jLabelPesquisarPorNome;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelActivityCRUD;
    private javax.swing.JScrollPane jScrollPane;
    public javax.swing.JTable jTableHistorico;
    private javax.swing.JTextField jTextFieldDisp;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}