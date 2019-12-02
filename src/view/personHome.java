package view;

import controller.DBFunctions;
import controller.PGFunctions;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class personHome extends javax.swing.JInternalFrame {

    DefaultTableModel dtmUsers;
    public personHome() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); 
        dtmUsers = (DefaultTableModel) jTablePessoas.getModel(); 
        jTablePessoas.setRowSorter(new TableRowSorter(dtmUsers));
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPersonCRUD = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();
        jLabelDelete = new javax.swing.JLabel();
        jLabelADD = new javax.swing.JLabel();
        jLabelAtualizar = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldTurma = new javax.swing.JTextField();
        jLabelTurma = new javax.swing.JLabel();
        jLabelOBS = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaOBS = new javax.swing.JTextArea();
        jLabelPesquisarPorNome = new javax.swing.JLabel();
        jLabelPesquisarPorNTelefone = new javax.swing.JLabel();
        jLabelPesquisarPorTurma = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(null);

        jPanelPersonCRUD.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPersonCRUD.setPreferredSize(new java.awt.Dimension(1000, 720));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTablePessoas.setForeground(new java.awt.Color(0, 0, 0));
        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Turma", "Telefone", "Status", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablePessoas.setGridColor(new java.awt.Color(204, 204, 204));
        jTablePessoas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTablePessoas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTablePessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePessoas);

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
        jLabelNome.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefone.setText("Telefone:");

        jTextFieldTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTurma.setText("Turma:");

        jLabelOBS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelOBS.setText("Observações:");

        jTextAreaOBS.setColumns(20);
        jTextAreaOBS.setRows(5);
        jScrollPane2.setViewportView(jTextAreaOBS);

        jLabelPesquisarPorNome.setBackground(new java.awt.Color(16, 125, 172));
        jLabelPesquisarPorNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesquisarPorNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jLabelPesquisarPorNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPesquisarPorNome.setMinimumSize(new java.awt.Dimension(35, 35));
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

        jLabelPesquisarPorNTelefone.setBackground(new java.awt.Color(16, 125, 172));
        jLabelPesquisarPorNTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesquisarPorNTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jLabelPesquisarPorNTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPesquisarPorNTelefone.setOpaque(true);
        jLabelPesquisarPorNTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNTelefoneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNTelefoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNTelefoneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNTelefoneMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorNTelefoneMouseReleased(evt);
            }
        });

        jLabelPesquisarPorTurma.setBackground(new java.awt.Color(16, 125, 172));
        jLabelPesquisarPorTurma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesquisarPorTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jLabelPesquisarPorTurma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPesquisarPorTurma.setOpaque(true);
        jLabelPesquisarPorTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorTurmaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorTurmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorTurmaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorTurmaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPesquisarPorTurmaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelPersonCRUDLayout = new javax.swing.GroupLayout(jPanelPersonCRUD);
        jPanelPersonCRUD.setLayout(jPanelPersonCRUDLayout);
        jPanelPersonCRUDLayout.setHorizontalGroup(
            jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPesquisarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                                .addComponent(jTextFieldTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPesquisarPorTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                        .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelPesquisarPorNTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPersonCRUDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelADD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabelAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOBS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanelPersonCRUDLayout.setVerticalGroup(
            jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                        .addComponent(jLabelTurma)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPesquisarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarPorTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelOBS))
                .addGap(10, 10, 10)
                .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPersonCRUDLayout.createSequentialGroup()
                        .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPesquisarPorNTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanelPersonCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelADD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelPersonCRUD);
        jPanelPersonCRUD.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    DBFunctions bdfunctions = new DBFunctions();
    PGFunctions pgfunctions = new PGFunctions();
    java.awt.Color secondary;
    java.awt.Color primary;
    java.awt.Color tertiary;
    java.awt.Color black = new java.awt.Color(0, 0, 0);
    
    public void themeChanger(java.awt.Color primary, java.awt.Color secondary, java.awt.Color tertiary){
        this.primary=primary;
        this.secondary=secondary;
        this.tertiary=tertiary;
        jLabelDelete.setBackground(primary);
        jLabelADD.setBackground(primary);
        jLabelAtualizar.setBackground(primary);
        jLabelPesquisarPorNome.setBackground(primary);
        jLabelPesquisarPorTurma.setBackground(primary);
        jLabelPesquisarPorNTelefone.setBackground(primary);
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

    private void jLabelPesquisarPorNTelefoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNTelefoneMouseEntered
        jLabelPesquisarPorNTelefone.setBackground(tertiary);
    }//GEN-LAST:event_jLabelPesquisarPorNTelefoneMouseEntered

    private void jLabelPesquisarPorNTelefoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNTelefoneMouseExited
        jLabelPesquisarPorNTelefone.setBackground(primary);
    }//GEN-LAST:event_jLabelPesquisarPorNTelefoneMouseExited

    private void jLabelPesquisarPorNTelefoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNTelefoneMousePressed
        jLabelPesquisarPorNTelefone.setBackground(secondary);
    }//GEN-LAST:event_jLabelPesquisarPorNTelefoneMousePressed

    private void jLabelPesquisarPorNTelefoneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNTelefoneMouseReleased
        if(jLabelPesquisarPorNTelefone.getBackground()==secondary){
            jLabelPesquisarPorNTelefone.setBackground(tertiary);
        }
    }//GEN-LAST:event_jLabelPesquisarPorNTelefoneMouseReleased

    private void jLabelPesquisarPorTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorTurmaMouseEntered
        jLabelPesquisarPorTurma.setBackground(tertiary);
    }//GEN-LAST:event_jLabelPesquisarPorTurmaMouseEntered

    private void jLabelPesquisarPorTurmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorTurmaMouseExited
        jLabelPesquisarPorTurma.setBackground(primary);
    }//GEN-LAST:event_jLabelPesquisarPorTurmaMouseExited

    private void jLabelPesquisarPorTurmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorTurmaMousePressed
        jLabelPesquisarPorTurma.setBackground(secondary);
    }//GEN-LAST:event_jLabelPesquisarPorTurmaMousePressed

    private void jLabelPesquisarPorTurmaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorTurmaMouseReleased
        if(jLabelPesquisarPorTurma.getBackground()==secondary){
            jLabelPesquisarPorTurma.setBackground(tertiary);
        }
    }//GEN-LAST:event_jLabelPesquisarPorTurmaMouseReleased

    private void jLabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseClicked
        if (jTablePessoas.getSelectedRow()!=-1){
            int input = JOptionPane.showConfirmDialog(null, "Deseja deletar este usuário?");
            if (input==0){
                bdfunctions.deletSelected(bdfunctions.usuarios.get(jTablePessoas.getSelectedRow()));
                reload();
                clearFields();
            }
            if (input==1){                    
                clearFields();
            }            
        }        
    }//GEN-LAST:event_jLabelDeleteMouseClicked

    private void jLabelADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelADDMouseClicked
        try{
            if (jTextFieldNome.getText().equals("") || jTextFieldTurma.getText().equals("") || jTextFieldTelefone.getText().equals("")){                
                JOptionPane.showMessageDialog(null, "Preencha os campos indicados");
                System.out.println("texto:"+jTextFieldNome.getText());
                if (jTextFieldNome.getText().equals("")){                    
                    jLabelNome.setForeground(primary);
                }
                if (jTextFieldTelefone.getText().equals("")){                    
                    jLabelTelefone.setForeground(primary);
                }
                if (jTextFieldTurma.getText().equals("")){                    
                    jLabelTurma.setForeground(primary);
                }
            }
            else{                
                String[] dados = new String[4];
                dados[0]='"'+jTextFieldNome.getText()+'"';
                dados[1]='"'+jTextFieldTelefone.getText()+'"';
                dados[2]='"'+jTextFieldTurma.getText()+'"';
                dados[3]='"'+jTextAreaOBS.getText()+'"';
                int input = JOptionPane.showConfirmDialog(null, "Deseja adicionar novo usuário?");
                if (input==0){
                    bdfunctions.insertValue("usuario", dados);
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

    private void jLabelPesquisarPorNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNomeMouseClicked
        bdfunctions.reloadSelect("usuarios", "nome LIKE '"+jTextFieldNome.getText()+"%'");
        pgfunctions.parseToTable(bdfunctions.usuarios, dtmUsers, "usuarios");
    }//GEN-LAST:event_jLabelPesquisarPorNomeMouseClicked

    private void jLabelPesquisarPorNTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorNTelefoneMouseClicked
        bdfunctions.reloadSelect("usuarios", "telefone LIKE '"+jTextFieldTelefone.getText()+"%'");
        pgfunctions.parseToTable(bdfunctions.usuarios, dtmUsers, "usuarios");
    }//GEN-LAST:event_jLabelPesquisarPorNTelefoneMouseClicked

    private void jLabelPesquisarPorTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarPorTurmaMouseClicked
        bdfunctions.reloadSelect("usuarios", "turma LIKE '"+jTextFieldTurma.getText()+"%'");
        pgfunctions.parseToTable(bdfunctions.usuarios, dtmUsers, "usuarios");
    }//GEN-LAST:event_jLabelPesquisarPorTurmaMouseClicked

    private void jLabelAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtualizarMouseClicked
        try{
            if (jTablePessoas.getSelectedRow()!=-1){
                if (jTextFieldNome.getText().equals("") || jTextFieldTurma.getText().equals("") || jTextFieldTelefone.getText().equals("")){                
                    JOptionPane.showMessageDialog(null, "Preencha os campos indicados");
                    System.out.println("texto:"+jTextFieldNome.getText());
                    if (jTextFieldNome.getText().equals("")){                    
                        jLabelNome.setForeground(primary);
                    }
                    if (jTextFieldTelefone.getText().equals("")){                    
                        jLabelTelefone.setForeground(primary);
                    }
                    if (jTextFieldTurma.getText().equals("")){                    
                        jLabelTurma.setForeground(primary);
                    }
                }
                else{                
                    String[] dados = new String[5];
                    dados[0]='"'+jTextFieldNome.getText()+'"';
                    dados[1]='"'+jTextFieldTelefone.getText()+'"';
                    dados[2]='"'+jTextFieldTurma.getText()+'"';
                    dados[3]='"'+jTextAreaOBS.getText()+'"';
                    dados[4]='"'+jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 4).toString()+'"';
                    int input = JOptionPane.showConfirmDialog(null, "Deseja atualizar este usuário?");
                    if (input==0){
                        bdfunctions.updateValue("usuario", dados);
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

    private void jTablePessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoasMouseClicked
        if (jTablePessoas.getSelectedRow()!=-1){
            jTextFieldNome.setText(jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 0).toString());
            jTextFieldTurma.setText(jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 1).toString());
            jTextFieldTelefone.setText(jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 2).toString());
            jTextAreaOBS.setText(bdfunctions.usuarios.get(jTablePessoas.getSelectedRow()).getObservações());
        }
    }//GEN-LAST:event_jTablePessoasMouseClicked

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            bdfunctions.reloadSelect("usuarios", "nome LIKE '"+jTextFieldNome.getText()+"%'");
            pgfunctions.parseToTable(bdfunctions.usuarios, dtmUsers, "usuarios");
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        
    }//GEN-LAST:event_jTextFieldNomeKeyTyped
    
    void clearFields(){
        jTextFieldNome.setText("");
        jTextFieldTelefone.setText("");
        jTextAreaOBS.setText("");
        jTextFieldTurma.setText("");
        jLabelNome.setForeground(black);
        jLabelTurma.setForeground(black);
        jLabelTelefone.setForeground(black);
    }
    
    void reload(){
        bdfunctions.reloadSelect("usuarios");
        pgfunctions.parseToTable(bdfunctions.usuarios, dtmUsers, "usuarios");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelADD;
    private javax.swing.JLabel jLabelAtualizar;
    private javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelOBS;
    private javax.swing.JLabel jLabelPesquisarPorNTelefone;
    private javax.swing.JLabel jLabelPesquisarPorNome;
    private javax.swing.JLabel jLabelPesquisarPorTurma;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTurma;
    private javax.swing.JPanel jPanelPersonCRUD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTablePessoas;
    private javax.swing.JTextArea jTextAreaOBS;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTurma;
    // End of variables declaration//GEN-END:variables
}
