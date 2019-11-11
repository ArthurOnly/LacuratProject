package view;

import controller.interacFunctions;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class dispositivosHome extends javax.swing.JInternalFrame {

    DefaultTableModel dtmDisp;
    public dispositivosHome() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        dtmDisp = (DefaultTableModel) jTableDispositivos.getModel(); 
        jTableDispositivos.setRowSorter(new TableRowSorter(dtmDisp));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDispositivosCRUD = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableDispositivos = new javax.swing.JTable();
        jLabelDelete = new javax.swing.JLabel();
        jLabelADD = new javax.swing.JLabel();
        jLabelAtualizar = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelOBS = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaOBS = new javax.swing.JTextArea();
        jLabelPesquisarPorNome = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(null);

        jPanelDispositivosCRUD.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDispositivosCRUD.setPreferredSize(new java.awt.Dimension(1000, 720));

        jScrollPane.setForeground(new java.awt.Color(255, 255, 255));

        jTableDispositivos.setForeground(new java.awt.Color(0, 0, 0));
        jTableDispositivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Identificador", "Observações", "Tempo de uso", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableDispositivos.setGridColor(new java.awt.Color(204, 204, 204));
        jTableDispositivos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableDispositivos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableDispositivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDispositivosMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jTableDispositivos);

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

        jLabelADD.setBackground(new java.awt.Color(16, 125, 172));
        jLabelADD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelADD.setText("Adicionar");
        jLabelADD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelADD.setOpaque(true);
        jLabelADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelADDMouseClicked(evt);
            }
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

        jLabelAtualizar.setBackground(new java.awt.Color(16, 125, 172));
        jLabelAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtualizar.setText("Atualizar");
        jLabelAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAtualizar.setOpaque(true);
        jLabelAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAtualizarMouseClicked(evt);
            }
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

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jLabelOBS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelOBS.setText("Observações:");

        jTextAreaOBS.setColumns(20);
        jTextAreaOBS.setRows(5);
        jTextAreaOBS.setPreferredSize(new java.awt.Dimension(220, 50));
        jScrollPane2.setViewportView(jTextAreaOBS);

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

        javax.swing.GroupLayout jPanelDispositivosCRUDLayout = new javax.swing.GroupLayout(jPanelDispositivosCRUD);
        jPanelDispositivosCRUD.setLayout(jPanelDispositivosCRUDLayout);
        jPanelDispositivosCRUDLayout.setHorizontalGroup(
            jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDispositivosCRUDLayout.createSequentialGroup()
                .addGroup(jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDispositivosCRUDLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDispositivosCRUDLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDispositivosCRUDLayout.createSequentialGroup()
                                .addComponent(jLabelADD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabelAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDispositivosCRUDLayout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPesquisarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOBS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanelDispositivosCRUDLayout.setVerticalGroup(
            jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDispositivosCRUDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelOBS)
                .addGap(10, 10, 10)
                .addGroup(jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDispositivosCRUDLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelADD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDispositivosCRUDLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelDispositivosCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPesquisarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        getContentPane().add(jPanelDispositivosCRUD);
        jPanelDispositivosCRUD.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    interacFunctions bdfunctions = new interacFunctions(); 
    java.awt.Color secondary = new java.awt.Color(24, 154, 211);
    java.awt.Color primary = new java.awt.Color(16, 125, 172);
    java.awt.Color tertiary = new java.awt.Color(113, 199, 236);
    java.awt.Color black = new java.awt.Color(0, 0, 0);
    
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

    private void jLabelADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelADDMouseClicked
        try{
            if (jTextFieldNome.getText().equals("")){                
                JOptionPane.showMessageDialog(null, "Preencha os campos indicados");                
                if (jTextFieldNome.getText().equals("")){                    
                    jLabelNome.setForeground(primary);
                }               
            }
            else{                
                String[] dados = new String[4];
                dados[0]='"'+jTextFieldNome.getText()+'"';                
                dados[1]='"'+jTextAreaOBS.getText()+'"';
                int input = JOptionPane.showConfirmDialog(null, "Deseja adicionar novo dispositivo?");
                if (input==0){
                    bdfunctions.insertValue("dispositivo", dados);
                    reload();
                    clearFields();
                }
                if (input==1){                    
                    clearFields();
                }                
            }
        }   
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados");
        }
    }//GEN-LAST:event_jLabelADDMouseClicked

    private void jLabelAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarMouseClicked
        try{
            if (jTableDispositivos.getSelectedRow()!=-1){
                if (jTextFieldNome.getText().equals("")){                
                    JOptionPane.showMessageDialog(null, "Preencha os campos indicados");                    
                    if (jTextFieldNome.getText().equals("")){                    
                        jLabelNome.setForeground(primary);
                    }                    
                }
                else{                
                    String[] dados = new String[5];
                    dados[0]='"'+jTextFieldNome.getText()+'"';                    
                    dados[1]='"'+jTextAreaOBS.getText()+'"'; 
                    dados[2]='"'+jTableDispositivos.getValueAt(jTableDispositivos.getSelectedRow(), 1).toString()+'"'; 
                    int input = JOptionPane.showConfirmDialog(null, "Deseja atualizar este dispositivo?");
                    if (input==0){
                        bdfunctions.updateValue("dispositivo", dados);
                        reload();
                        clearFields();
                    }
                    if (input==1){                    
                        clearFields();
                    }                     
                }
            }
        }   
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados");
        
        }
    }//GEN-LAST:event_jLabelAtualizarMouseClicked

    private void jLabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseClicked
        if (jTableDispositivos.getSelectedRow()!=-1){
            int input = JOptionPane.showConfirmDialog(null, "Deseja deletar este dispositivo?");
            if (input==0){
                bdfunctions.deletSelected(bdfunctions.dispositivos.get(jTableDispositivos.getSelectedRow()));
                reload();
                clearFields();
            }
            if (input==1){                    
                clearFields();
            }            
        }
    }//GEN-LAST:event_jLabelDeleteMouseClicked

    private void jTableDispositivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDispositivosMouseClicked
         if (jTableDispositivos.getSelectedRow()!=-1){
            jTextFieldNome.setText(jTableDispositivos.getValueAt(jTableDispositivos.getSelectedRow(), 0).toString());            
            jTextAreaOBS.setText(bdfunctions.dispositivos.get(jTableDispositivos.getSelectedRow()).getObservacoes());
        }
    }//GEN-LAST:event_jTableDispositivosMouseClicked

    private void jLabelPesquisarPorNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNomeMouseClicked
        bdfunctions.reloadSelect("dispositivos", "nome LIKE '"+jTextFieldNome.getText()+"%'");
        bdfunctions.parseToTable(bdfunctions.usuarios, dtmDisp, "dispositivos");
    }//GEN-LAST:event_jLabelPesquisarPorNomeMouseClicked

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            bdfunctions.reloadSelect("dispositivos", "nome LIKE '"+jTextFieldNome.getText()+"%'");
            bdfunctions.parseToTable(bdfunctions.dispositivos, dtmDisp, "dispositivos");
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    void clearFields(){
        jTextFieldNome.setText("");        
        jTextAreaOBS.setText("");        
        jLabelNome.setForeground(black);        
    }
    
    void reload(){
        bdfunctions.reloadSelect("dispositivos");
        bdfunctions.parseToTable(bdfunctions.dispositivos, dtmDisp , "dispositivos");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelADD;
    private javax.swing.JLabel jLabelAtualizar;
    private javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelOBS;
    private javax.swing.JLabel jLabelPesquisarPorNome;
    private javax.swing.JPanel jPanelDispositivosCRUD;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDispositivos;
    private javax.swing.JTextArea jTextAreaOBS;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
