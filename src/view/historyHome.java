package view;

import controller.interacFunctions;
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
        jTextFieldUser = new javax.swing.JTextField();
        jTextFieldUser1 = new javax.swing.JTextField();
        jLabelPesquisarPorNome = new javax.swing.JLabel();
        jLabelPesquisarPorNome1 = new javax.swing.JLabel();

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

        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        jPanelActivityCRUD.add(jTextFieldUser);
        jTextFieldUser.setBounds(300, 110, 300, 35);

        jTextFieldUser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanelActivityCRUD.add(jTextFieldUser1);
        jTextFieldUser1.setBounds(300, 50, 300, 35);

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

        jLabelPesquisarPorNome1.setBackground(new java.awt.Color(16, 125, 172));
        jLabelPesquisarPorNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesquisarPorNome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jLabelPesquisarPorNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPesquisarPorNome1.setMaximumSize(new java.awt.Dimension(35, 35));
        jLabelPesquisarPorNome1.setOpaque(true);
        jLabelPesquisarPorNome1.setPreferredSize(new java.awt.Dimension(35, 35));
        jLabelPesquisarPorNome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNome1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNome1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNome1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNome1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNome1MouseReleased(evt);
            }
        });
        jPanelActivityCRUD.add(jLabelPesquisarPorNome1);
        jLabelPesquisarPorNome1.setBounds(610, 110, 35, 35);

        getContentPane().add(jPanelActivityCRUD);
        jPanelActivityCRUD.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    java.awt.Color secondary;
    java.awt.Color primary;
    java.awt.Color tertiary;
    
    interacFunctions bdfunctions = new interacFunctions();
    
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

    private void jLabelPesquisarPorNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNomeMouseClicked
        //bdfunctions.reloadSelect("dispositivos", "nome LIKE '"+jTextFieldNome.getText()+"%'");
        //bdfunctions.parseToTable(bdfunctions.usuarios, dtmDisp, "dispositivos");
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

    private void jLabelPesquisarPorNome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNome1MouseClicked
        //bdfunctions.reloadSelect("dispositivos", "nome LIKE '"+jTextFieldNome.getText()+"%'");
        //bdfunctions.parseToTable(bdfunctions.usuarios, dtmDisp, "dispositivos");
    }//GEN-LAST:event_jLabelPesquisarPorNome1MouseClicked

    private void jLabelPesquisarPorNome1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNome1MouseEntered
        jLabelPesquisarPorNome.setBackground(tertiary);
    }//GEN-LAST:event_jLabelPesquisarPorNome1MouseEntered

    private void jLabelPesquisarPorNome1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNome1MouseExited
        jLabelPesquisarPorNome.setBackground(primary);
    }//GEN-LAST:event_jLabelPesquisarPorNome1MouseExited

    private void jLabelPesquisarPorNome1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNome1MousePressed
        jLabelPesquisarPorNome.setBackground(secondary);
    }//GEN-LAST:event_jLabelPesquisarPorNome1MousePressed

    private void jLabelPesquisarPorNome1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNome1MouseReleased
        if(jLabelPesquisarPorNome.getBackground()==secondary){
            jLabelPesquisarPorNome.setBackground(tertiary);
        }
    }//GEN-LAST:event_jLabelPesquisarPorNome1MouseReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        bdfunctions.reloadSelect("historico");
        bdfunctions.parseToTable(bdfunctions.historico, dtmHist, "historico");        
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAutomaticEnd;
    public javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelDispositivo;
    private javax.swing.JLabel jLabelPesquisarPorNome;
    private javax.swing.JLabel jLabelPesquisarPorNome1;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelActivityCRUD;
    private javax.swing.JScrollPane jScrollPane;
    public javax.swing.JTable jTableHistorico;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JTextField jTextFieldUser1;
    // End of variables declaration//GEN-END:variables
}
