package view;

import controller.interacFunctions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.functionScripts;
public class activityHome extends javax.swing.JInternalFrame {

    DefaultTableModel dtmAtv;
    public activityHome() {
        initComponents();        
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);              
        dtmAtv = (DefaultTableModel) jTableAtividade.getModel(); 
        jTableAtividade.setRowSorter(new TableRowSorter(dtmAtv));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAutomaticEnd = new javax.swing.ButtonGroup();
        jPanelActivityCRUD = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableAtividade = new javax.swing.JTable();
        jLabelDelete = new javax.swing.JLabel();
        jLabelADD = new javax.swing.JLabel();
        jLabelAtualizar = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelDispositivo = new javax.swing.JLabel();
        jLabelAutomatic = new javax.swing.JLabel();
        jComboBoxUser = new javax.swing.JComboBox();
        jComboBoxDispositivo = new javax.swing.JComboBox();
        jRadioButtonSectionEndNo = new javax.swing.JRadioButton();
        jRadioButtonSectionEndYes = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextFieldDisp = new javax.swing.JTextField();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelUser2 = new javax.swing.JLabel();
        jSliderSecond = new javax.swing.JSlider();
        jSliderHora = new javax.swing.JSlider();
        jSliderMinute = new javax.swing.JSlider();
        jLabelSecondCont = new javax.swing.JLabel();
        jLabelMinuteCont = new javax.swing.JLabel();
        jLabelHoraCont = new javax.swing.JLabel();

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

        jTableAtividade.setForeground(new java.awt.Color(0, 0, 0));
        jTableAtividade.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAtividade.setGridColor(new java.awt.Color(204, 204, 204));
        jTableAtividade.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane.setViewportView(jTableAtividade);

        jPanelActivityCRUD.add(jScrollPane);
        jScrollPane.setBounds(60, 250, 850, 402);

        jLabelDelete.setBackground(new java.awt.Color(16, 125, 172));
        jLabelDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDelete.setText("Finalizar");
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
        jLabelDelete.setBounds(356, 185, 110, 40);

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

        jLabelAutomatic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAutomatic.setText("Finalizar sesão automaticamente?");
        jPanelActivityCRUD.add(jLabelAutomatic);
        jLabelAutomatic.setBounds(540, 150, 280, 22);

        jComboBoxUser.setMaximumRowCount(10000);
        jComboBoxUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUserItemStateChanged(evt);
            }
        });
        jPanelActivityCRUD.add(jComboBoxUser);
        jComboBoxUser.setBounds(320, 50, 140, 35);

        jComboBoxDispositivo.setMaximumRowCount(10000);
        jComboBoxDispositivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelActivityCRUD.add(jComboBoxDispositivo);
        jComboBoxDispositivo.setBounds(320, 114, 140, 35);

        buttonGroupAutomaticEnd.add(jRadioButtonSectionEndNo);
        jRadioButtonSectionEndNo.setText("Não");
        jRadioButtonSectionEndNo.setEnabled(false);
        jPanelActivityCRUD.add(jRadioButtonSectionEndNo);
        jRadioButtonSectionEndNo.setBounds(610, 180, 111, 28);

        buttonGroupAutomaticEnd.add(jRadioButtonSectionEndYes);
        jRadioButtonSectionEndYes.setText("Sim");
        jRadioButtonSectionEndYes.setEnabled(false);
        jPanelActivityCRUD.add(jRadioButtonSectionEndYes);
        jRadioButtonSectionEndYes.setBounds(540, 180, 54, 28);

        jCheckBox1.setText("Sim");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jPanelActivityCRUD.add(jCheckBox1);
        jCheckBox1.setBounds(540, 44, 60, 40);

        jTextFieldDisp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldDisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldDispMouseClicked(evt);
            }
        });
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
        jTextFieldDisp.setBounds(120, 114, 200, 35);

        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUserKeyPressed(evt);
            }
        });
        jPanelActivityCRUD.add(jTextFieldUser);
        jTextFieldUser.setBounds(120, 50, 200, 35);

        jLabelUser2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUser2.setText("Tempo cedido:");
        jPanelActivityCRUD.add(jLabelUser2);
        jLabelUser2.setBounds(538, 20, 220, 22);

        jSliderSecond.setMaximum(59);
        jSliderSecond.setValue(0);
        jSliderSecond.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderSecondStateChanged(evt);
            }
        });
        jPanelActivityCRUD.add(jSliderSecond);
        jSliderSecond.setBounds(610, 120, 220, 16);

        jSliderHora.setMaximum(23);
        jSliderHora.setSnapToTicks(true);
        jSliderHora.setValue(0);
        jSliderHora.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderHoraStateChanged(evt);
            }
        });
        jSliderHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSliderHoraMousePressed(evt);
            }
        });
        jSliderHora.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jSliderHoraCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jSliderHoraInputMethodTextChanged(evt);
            }
        });
        jPanelActivityCRUD.add(jSliderHora);
        jSliderHora.setBounds(610, 60, 220, 16);

        jSliderMinute.setMaximum(59);
        jSliderMinute.setValue(0);
        jSliderMinute.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderMinuteStateChanged(evt);
            }
        });
        jPanelActivityCRUD.add(jSliderMinute);
        jSliderMinute.setBounds(610, 90, 220, 16);

        jLabelSecondCont.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSecondCont.setText("0 segundos");
        jPanelActivityCRUD.add(jLabelSecondCont);
        jLabelSecondCont.setBounds(840, 120, 110, 22);

        jLabelMinuteCont.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMinuteCont.setText("0 minutos");
        jPanelActivityCRUD.add(jLabelMinuteCont);
        jLabelMinuteCont.setBounds(840, 90, 110, 22);

        jLabelHoraCont.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelHoraCont.setText("0 horas");
        jPanelActivityCRUD.add(jLabelHoraCont);
        jLabelHoraCont.setBounds(840, 60, 130, 20);

        getContentPane().add(jPanelActivityCRUD);
        jPanelActivityCRUD.setBounds(0, 0, 1000, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //functionScripts fs = new functionScripts();
    interacFunctions bdfunctions = new interacFunctions(); 
    java.awt.Color secondary;
    java.awt.Color primary;
    java.awt.Color tertiary; 
    java.awt.Color black = new java.awt.Color(0, 0, 0);
    
    String createData(){
        Calendar cal = Calendar.getInstance();        
        String[] data = cal.getTime().toString().split(" ");
        String month = (cal.get(Calendar.MONTH)+1+"");
        data[1]=month;  
        System.out.println(data[0]+" "+data[1]+" "+data[2]+" "+data[3]+" "+data[4]+" "+data[5]);
        return data[0]+" "+data[1]+" "+data[2]+" "+data[3]+" "+data[4]+" "+data[5];        
    }
    
    String createDataEnd(){
        Calendar cal = Calendar.getInstance();        
        String[] data = cal.getTime().toString().split(" ");
        String month = (cal.get(Calendar.MONTH)+1+"");
        data[1]=month;  
        System.out.println(data[2]+"/"+data[1]+"/"+data[5]+" "+data[3]);
        return data[2]+"/"+data[1]+"/"+data[5]+" "+data[3];
    }
    
    String endData(int[] tempo) throws ParseException{
        Calendar cal = Calendar.getInstance();         
        cal.add(cal.SECOND, tempo[2]);
        cal.add(cal.MINUTE, tempo[1]);
        cal.add(cal.HOUR, tempo[0]); 
        String month = (cal.get(Calendar.MONTH)+1+"");
        String[] data = cal.getTime().toString().split(" ");             
        data[1]=month;           
        return data[0]+" "+data[1]+" "+data[2]+" "+data[3]+" "+data[4]+" "+data[5];
    }
    
    public void parseToCombo(){
        jComboBoxUser.removeAllItems();
        jComboBoxDispositivo.removeAllItems();
    }
    
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
      
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jTextFieldDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDispActionPerformed

    private void jTextFieldUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUserKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            jComboBoxUser.removeAllItems();
            bdfunctions.reloadSelect("usuarios", "nome LIKE '"+jTextFieldUser.getText()+"%'");
            bdfunctions.parseToCombo(bdfunctions.usuarios, jComboBoxUser, "usuario");
        }
    }//GEN-LAST:event_jTextFieldUserKeyPressed

    private void jSliderHoraCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jSliderHoraCaretPositionChanged
        
    }//GEN-LAST:event_jSliderHoraCaretPositionChanged

    private void jSliderHoraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderHoraMousePressed
        
    }//GEN-LAST:event_jSliderHoraMousePressed

    private void jSliderHoraInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jSliderHoraInputMethodTextChanged
        
    }//GEN-LAST:event_jSliderHoraInputMethodTextChanged

    private void jSliderHoraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderHoraStateChanged
        if (jSliderHora.getValue()==1){
            jLabelHoraCont.setText(jSliderHora.getValue()+" hora");
        }
        else{
            jLabelHoraCont.setText(jSliderHora.getValue()+" horas");
        }
    }//GEN-LAST:event_jSliderHoraStateChanged

    private void jSliderMinuteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderMinuteStateChanged
        if (jSliderMinute.getValue()==1){
            jLabelMinuteCont.setText(jSliderMinute.getValue()+" minuto");
        }
        else{
            jLabelMinuteCont.setText(jSliderMinute.getValue()+" minutos");
        }
    }//GEN-LAST:event_jSliderMinuteStateChanged

    private void jSliderSecondStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderSecondStateChanged
        if (jSliderHora.getValue()==1){
            jLabelSecondCont.setText(jSliderSecond.getValue()+" segundo");
        }
        else{
            jLabelSecondCont.setText(jSliderSecond.getValue()+" segundos");
        }
    }//GEN-LAST:event_jSliderSecondStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        bdfunctions.reloadSelect("atividade");
        bdfunctions.parseToTable(bdfunctions.atividades, dtmAtv, "atividades");
        bdfunctions.reloadSelect("usuarios");
        bdfunctions.reloadSelect("dispositivos");
        jCheckBox1.setSelected(false);
        jSliderHora.setEnabled(false);
        jSliderMinute.setEnabled(false);
        jSliderSecond.setEnabled(false);        
        jRadioButtonSectionEndNo.setSelected(false);
        jRadioButtonSectionEndNo.setEnabled(false);
        jRadioButtonSectionEndYes.setSelected(false);
        jRadioButtonSectionEndYes.setEnabled(false);
        buttonGroupAutomaticEnd.clearSelection();
        parseToCombo();         
        bdfunctions.parseToCombo(bdfunctions.usuarios, jComboBoxUser, "usuario");
        bdfunctions.parseToCombo(bdfunctions.dispositivos, jComboBoxDispositivo, "dispositivo");
    }//GEN-LAST:event_formComponentShown

    private void jTextFieldDispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDispMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDispMouseClicked

    private void jTextFieldDispKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDispKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            jComboBoxDispositivo.removeAllItems();
            bdfunctions.reloadSelect("dispositivos", "nome LIKE '"+jTextFieldDisp.getText()+"%'");
            bdfunctions.parseToCombo(bdfunctions.dispositivos, jComboBoxDispositivo, "dispositivo");
        }
    }//GEN-LAST:event_jTextFieldDispKeyPressed

    private void jComboBoxUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUserItemStateChanged
            
    }//GEN-LAST:event_jComboBoxUserItemStateChanged
  
    
    private void jLabelADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelADDMouseClicked
        try{
            if (jComboBoxUser.getSelectedIndex()==0 || jComboBoxDispositivo.getSelectedIndex()==0 || (jRadioButtonSectionEndNo.isSelected()==false && jRadioButtonSectionEndYes.isSelected()==false && jCheckBox1.isSelected())){                
                JOptionPane.showMessageDialog(null, "Preencha os campos indicados");                
                if (jComboBoxUser.getSelectedIndex()==0){                    
                    jLabelUser.setForeground(primary);
                } 
                if (jComboBoxDispositivo.getSelectedIndex()==0){                    
                    jLabelDispositivo.setForeground(primary);
                } 
                if (jRadioButtonSectionEndNo.isSelected()==false && jRadioButtonSectionEndYes.isSelected()==false){
                    jLabelAutomatic.setForeground(primary);
                }
            }
            else{                
                String[] dados = new String[8];
                int[] tempo = new int[4];
                tempo[0]=jSliderHora.getValue();
                tempo[1]=jSliderMinute.getValue();
                tempo[2]=jSliderSecond.getValue();
                String at;
                if (jRadioButtonSectionEndYes.isSelected()){
                    at="true";
                }
                else{
                    at="false";
                }                
                dados[0]='"'+(jComboBoxUser.getSelectedItem()+"")+'"';                
                dados[1]='"'+bdfunctions.usuarios.get(jComboBoxUser.getSelectedIndex()-1).getID()+'"';                     
                dados[2]='"'+(jComboBoxDispositivo.getSelectedItem()+"")+'"';                
                dados[3]='"'+bdfunctions.dispositivos.get(jComboBoxDispositivo.getSelectedIndex()-1).getID()+'"';                  
                dados[4]=at;                  
                dados[5]='"'+createData()+'"';               
                dados[6]='"'+endData(tempo)+'"';                
                int input = JOptionPane.showConfirmDialog(null, "Deseja adicionar esta nova atividade?");
                if (input==0){
                    bdfunctions.insertValue("atividade", dados);
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

    private void jLabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseClicked
        if (jTableAtividade.getSelectedRow()!=-1){
            int input = JOptionPane.showConfirmDialog(null, "Deseja finalizar esta atividade?");
            if (input==0){
                bdfunctions.reloadSelect("dispositivos");
                double actual=0;
                try {
                    actual += bdfunctions.atividades.get(jTableAtividade.getSelectedRow()).minutesParsed(0);
                } catch (ParseException ex) {
                    Logger.getLogger(activityHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int b=0;b<bdfunctions.dispositivos.size();b++){
                    if (bdfunctions.dispositivos.get(b).getID().equalsIgnoreCase(bdfunctions.atividades.get(jTableAtividade.getSelectedRow()).getDispositovID())){
                        actual+=bdfunctions.dispositivos.get(b).getTempoDeUso();
                    }
                }
                String[] dadosEnv =  new String[2];                
                dadosEnv[1] = bdfunctions.atividades.get(jTableAtividade.getSelectedRow()).getDispositovID();
                dadosEnv[0] = actual+"";
                String[] dadosEnvHistory =  new String[3];
                dadosEnvHistory[0] = "'"+bdfunctions.atividades.get(jTableAtividade.getSelectedRow()).getUsuario()+"'";
                dadosEnvHistory[1] = "'"+bdfunctions.atividades.get(jTableAtividade.getSelectedRow()).getDispositivo()+"'";
                dadosEnvHistory[2] = "'"+bdfunctions.atividades.get(jTableAtividade.getSelectedRow()).dataToString(bdfunctions.atividades.get(jTableAtividade.getSelectedRow()).getDataInicial())+" à "+createDataEnd()+"'";
                bdfunctions.updateValue("dispositivoTime", dadosEnv);
                bdfunctions.insertValue("historico", dadosEnvHistory);
                bdfunctions.deletSelected(bdfunctions.atividades.get(jTableAtividade.getSelectedRow()));
                reload();
                clearFields();
            }
            if (input==1){                    
                clearFields();
            }            
        }
    }//GEN-LAST:event_jLabelDeleteMouseClicked

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jSliderHora.isEnabled()){
            jSliderHora.setEnabled(false);
            jSliderMinute.setEnabled(false);
            jSliderSecond.setEnabled(false);
            jSliderHora.setEnabled(false);
            jRadioButtonSectionEndNo.setEnabled(false);
            jRadioButtonSectionEndYes.setEnabled(false);
            
            buttonGroupAutomaticEnd.clearSelection();
            jSliderHora.setValue(0);
            jSliderMinute.setValue(0);
            jSliderSecond.setValue(0);
        }
        else{            
            jSliderHora.setEnabled(true);
            jSliderMinute.setEnabled(true);
            jSliderSecond.setEnabled(true);
            jRadioButtonSectionEndNo.setEnabled(true);
            jRadioButtonSectionEndYes.setEnabled(true);
            jRadioButtonSectionEndYes.setSelected(true);
        } 
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        
    }//GEN-LAST:event_jCheckBox1StateChanged
    
    void clearFields(){
        jTextFieldUser.setText("");        
        jTextFieldDisp.setText("");        
        jLabelUser.setForeground(black); 
        jLabelDispositivo.setForeground(black);
        jLabelAutomatic.setForeground(black);
        buttonGroupAutomaticEnd.clearSelection();
        jCheckBox1.setSelected(false);        
    }
    
    void reload(){
        bdfunctions.reloadSelect("atividade");
        bdfunctions.reloadSelect("usuarios");
        bdfunctions.reloadSelect("dispositivos");
        bdfunctions.parseToTable(bdfunctions.atividades, dtmAtv , "atividades");
        parseToCombo();
        bdfunctions.parseToCombo(bdfunctions.usuarios, jComboBoxUser, "usuario");
        bdfunctions.parseToCombo(bdfunctions.dispositivos, jComboBoxDispositivo, "dispositivo");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAutomaticEnd;
    private javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JComboBox jComboBoxDispositivo;
    public javax.swing.JComboBox jComboBoxUser;
    public javax.swing.JLabel jLabelADD;
    public javax.swing.JLabel jLabelAtualizar;
    private javax.swing.JLabel jLabelAutomatic;
    public javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelDispositivo;
    private javax.swing.JLabel jLabelHoraCont;
    private javax.swing.JLabel jLabelMinuteCont;
    private javax.swing.JLabel jLabelSecondCont;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUser2;
    private javax.swing.JPanel jPanelActivityCRUD;
    private javax.swing.JRadioButton jRadioButtonSectionEndNo;
    private javax.swing.JRadioButton jRadioButtonSectionEndYes;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSlider jSliderHora;
    private javax.swing.JSlider jSliderMinute;
    private javax.swing.JSlider jSliderSecond;
    private javax.swing.JTable jTableAtividade;
    private javax.swing.JTextField jTextFieldDisp;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
