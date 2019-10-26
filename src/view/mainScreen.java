package view;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.functionScripts;
import controller.interacFunctions;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mainScreen extends javax.swing.JFrame {

    personHome personCRUD = new personHome();
    dispositivosHome dispositivosCRUD = new dispositivosHome();
    activityHome activityCRUD = new activityHome(); 
    configuracoes configuracoes = new configuracoes();  
    historyHome historyHome = new historyHome();
    Home home = new Home();   
    interacFunctions bdfunctions = new interacFunctions();    
    
    public mainScreen() {
        initComponents();             
        internalFramesInstances();
        themeChanger(); 
        setFramesVisible(home);
        repaintAll();              
    }      
    
     
    void internalFramesInstances(){
        jDesktopPaneAbas.add(personCRUD);
        jDesktopPaneAbas.add(dispositivosCRUD);
        jDesktopPaneAbas.add(activityCRUD);
        jDesktopPaneAbas.add(configuracoes);
        jDesktopPaneAbas.add(historyHome);
        jDesktopPaneAbas.add(home);
        personCRUD.setLocation(-8, -4);
        dispositivosCRUD.setLocation(-8,-4);
        activityCRUD.setLocation(-8,-4);
        configuracoes.setLocation(-8,-4);
        historyHome.setLocation(-8,-4);
        home.setLocation(-8,-4);
        //Theme
        activityCRUD.themeChanger();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jDesktopPaneAbas = new javax.swing.JDesktopPane();
        jPanelMenuBG = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelHOME = new javax.swing.JLabel();
        jLabelPESSOAS = new javax.swing.JLabel();
        jLabelATIVOS = new javax.swing.JLabel();
        jLabelDISPOSITIVOS = new javax.swing.JLabel();
        jLabelCONFIGURACOES = new javax.swing.JLabel();
        jLabelHOMEI = new javax.swing.JLabel();
        jLabelPESSOAI = new javax.swing.JLabel();
        jLabelDISPOSITIVOSI = new javax.swing.JLabel();
        jLabelATIVOSI = new javax.swing.JLabel();
        jLabelCONFIGURACOESI = new javax.swing.JLabel();
        jLabelHistoricoNome = new javax.swing.JLabel();
        jLabelHistoricoI = new javax.swing.JLabel();
        jPanelSelector = new javax.swing.JPanel();
        jLabelPesSelect = new javax.swing.JLabel();
        jLabelATISelect = new javax.swing.JLabel();
        jLabelDisSelect = new javax.swing.JLabel();
        jLabelHomeSelect = new javax.swing.JLabel();
        jLabelCONSelect = new javax.swing.JLabel();
        jLabelHISSelect = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jDesktopPaneAbas.setPreferredSize(new java.awt.Dimension(1000, 720));

        javax.swing.GroupLayout jDesktopPaneAbasLayout = new javax.swing.GroupLayout(jDesktopPaneAbas);
        jDesktopPaneAbas.setLayout(jDesktopPaneAbasLayout);
        jDesktopPaneAbasLayout.setHorizontalGroup(
            jDesktopPaneAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jDesktopPaneAbasLayout.setVerticalGroup(
            jDesktopPaneAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPaneAbas);
        jDesktopPaneAbas.setBounds(280, 0, 1000, 720);

        jPanelMenuBG.setBackground(new java.awt.Color(16, 125, 172));
        jPanelMenuBG.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabelHOME.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelHOME.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHOME.setText("HOME");
        jLabelHOME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelHOME);
        jLabelHOME.setBounds(63, 157, 72, 32);

        jLabelPESSOAS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelPESSOAS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPESSOAS.setText("PESSOAS");
        jLabelPESSOAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelPESSOAS);
        jLabelPESSOAS.setBounds(63, 219, 115, 32);

        jLabelATIVOS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelATIVOS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelATIVOS.setText("ATIVOS");
        jLabelATIVOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelATIVOS);
        jLabelATIVOS.setBounds(63, 343, 89, 32);

        jLabelDISPOSITIVOS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelDISPOSITIVOS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDISPOSITIVOS.setText("DISPOSITIVOS");
        jLabelDISPOSITIVOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelDISPOSITIVOS);
        jLabelDISPOSITIVOS.setBounds(63, 281, 169, 32);

        jLabelCONFIGURACOES.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCONFIGURACOES.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCONFIGURACOES.setText("CONFIGURAÇÕES");
        jLabelCONFIGURACOES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelCONFIGURACOES);
        jLabelCONFIGURACOES.setBounds(63, 465, 211, 32);

        jLabelHOMEI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home_1.png"))); // NOI18N
        jLabelHOMEI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelHOMEI);
        jLabelHOMEI.setBounds(10, 150, 40, 40);

        jLabelPESSOAI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person.png"))); // NOI18N
        jLabelPESSOAI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelPESSOAI);
        jLabelPESSOAI.setBounds(10, 220, 40, 30);

        jLabelDISPOSITIVOSI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pc.png"))); // NOI18N
        jLabelDISPOSITIVOSI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelDISPOSITIVOSI);
        jLabelDISPOSITIVOSI.setBounds(10, 280, 40, 40);

        jLabelATIVOSI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lampada.png"))); // NOI18N
        jLabelATIVOSI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelATIVOSI);
        jLabelATIVOSI.setBounds(10, 340, 50, 40);

        jLabelCONFIGURACOESI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/engrenagem.png"))); // NOI18N
        jLabelCONFIGURACOESI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelCONFIGURACOESI);
        jLabelCONFIGURACOESI.setBounds(10, 460, 40, 40);

        jLabelHistoricoNome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelHistoricoNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHistoricoNome.setText("HISTÓRICO");
        jLabelHistoricoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelHistoricoNome);
        jLabelHistoricoNome.setBounds(60, 405, 132, 32);

        jLabelHistoricoI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historico.png"))); // NOI18N
        jLabelHistoricoI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelHistoricoI);
        jLabelHistoricoI.setBounds(10, 400, 40, 40);

        jPanelSelector.setBackground(primary);
        jPanelSelector.setForeground(new java.awt.Color(204, 255, 51));
        jPanelSelector.setLayout(null);

        jLabelPesSelect.setBackground(new java.awt.Color(16, 125, 172));
        jLabelPesSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPesSelect.setOpaque(true);
        jLabelPesSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPesSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPesSelectMouseExited(evt);
            }
        });
        jPanelSelector.add(jLabelPesSelect);
        jLabelPesSelect.setBounds(0, 210, 280, 50);

        jLabelATISelect.setBackground(new java.awt.Color(16, 125, 172));
        jLabelATISelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelATISelect.setOpaque(true);
        jLabelATISelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelATISelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelATISelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelATISelectMouseExited(evt);
            }
        });
        jPanelSelector.add(jLabelATISelect);
        jLabelATISelect.setBounds(0, 335, 280, 50);

        jLabelDisSelect.setBackground(new java.awt.Color(16, 125, 172));
        jLabelDisSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDisSelect.setOpaque(true);
        jLabelDisSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDisSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDisSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDisSelectMouseExited(evt);
            }
        });
        jPanelSelector.add(jLabelDisSelect);
        jLabelDisSelect.setBounds(0, 275, 280, 50);

        jLabelHomeSelect.setBackground(new java.awt.Color(16, 125, 172));
        jLabelHomeSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeSelect.setOpaque(true);
        jLabelHomeSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeSelectMouseExited(evt);
            }
        });
        jPanelSelector.add(jLabelHomeSelect);
        jLabelHomeSelect.setBounds(0, 145, 280, 50);

        jLabelCONSelect.setBackground(new java.awt.Color(16, 125, 172));
        jLabelCONSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCONSelect.setOpaque(true);
        jLabelCONSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCONSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCONSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCONSelectMouseExited(evt);
            }
        });
        jPanelSelector.add(jLabelCONSelect);
        jLabelCONSelect.setBounds(0, 455, 280, 50);

        jLabelHISSelect.setBackground(new java.awt.Color(16, 125, 172));
        jLabelHISSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHISSelect.setOpaque(true);
        jLabelHISSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHISSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHISSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHISSelectMouseExited(evt);
            }
        });
        jPanelSelector.add(jLabelHISSelect);
        jLabelHISSelect.setBounds(0, 395, 280, 50);

        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoMin.png"))); // NOI18N
        jLabelTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelSelector.add(jLabelTitle);
        jLabelTitle.setBounds(30, 40, 220, 50);

        jPanel1.add(jPanelSelector);
        jPanelSelector.setBounds(0, 0, 280, 720);

        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 280, 720);

        jPanelMenuBG.add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 280, 720);

        getContentPane().add(jPanelMenuBG);
        jPanelMenuBG.setBounds(0, 0, 280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void themeChanger(){
        activityCRUD.primary=this.primary;
        activityCRUD.secondary=this.secondary;
        activityCRUD.tertiary=this.tertiary; 
        activityCRUD.themeChanger();
    }
    
    void setFramesVisible(JInternalFrame jf){
        if (jf==personCRUD){
            personCRUD.setVisible(true);
            dispositivosCRUD.setVisible(false);
            activityCRUD.setVisible(false);
            configuracoes.setVisible(false); 
            historyHome.setVisible(false);
            home.setVisible(false);
            
            jLabelHomeSelect.setBackground(primary);
            jLabelATISelect.setBackground(primary);
            jLabelCONSelect.setBackground(primary);
            jLabelDisSelect.setBackground(primary);
            jLabelPesSelect.setBackground(secondary);
            jLabelHISSelect.setBackground(primary);
        }
        if (jf==dispositivosCRUD){
            personCRUD.setVisible(false);
            dispositivosCRUD.setVisible(true);
            activityCRUD.setVisible(false);
            configuracoes.setVisible(false);
            historyHome.setVisible(false);
            home.setVisible(false);
            
            jLabelHomeSelect.setBackground(primary);
            jLabelATISelect.setBackground(primary);
            jLabelCONSelect.setBackground(primary);
            jLabelDisSelect.setBackground(secondary);
            jLabelPesSelect.setBackground(primary);
            jLabelHISSelect.setBackground(primary);
        }
        if (jf==activityCRUD){
            personCRUD.setVisible(false);
            dispositivosCRUD.setVisible(false);
            activityCRUD.setVisible(true);
            configuracoes.setVisible(false);
            historyHome.setVisible(false);
            home.setVisible(false);
            
            jLabelHomeSelect.setBackground(primary);
            jLabelATISelect.setBackground(secondary);
            jLabelCONSelect.setBackground(primary);
            jLabelDisSelect.setBackground(primary);
            jLabelPesSelect.setBackground(primary);
            jLabelHISSelect.setBackground(primary);
        }
        if (jf==configuracoes){
            configuracoes.setVisible(true);
            personCRUD.setVisible(false);
            dispositivosCRUD.setVisible(false);
            activityCRUD.setVisible(false);
            historyHome.setVisible(false);
            home.setVisible(false);
            
            jLabelHomeSelect.setBackground(primary);
            jLabelATISelect.setBackground(primary);
            jLabelCONSelect.setBackground(secondary);
            jLabelDisSelect.setBackground(primary);
            jLabelPesSelect.setBackground(primary);
            jLabelHISSelect.setBackground(primary);
        }
        if (jf==historyHome){
            historyHome.setVisible(true);
            configuracoes.setVisible(false);
            personCRUD.setVisible(false);
            dispositivosCRUD.setVisible(false);
            activityCRUD.setVisible(false);
            home.setVisible(false);
            
            jLabelHomeSelect.setBackground(primary);
            jLabelATISelect.setBackground(primary);
            jLabelCONSelect.setBackground(primary);
            jLabelDisSelect.setBackground(primary);
            jLabelPesSelect.setBackground(primary);
            jLabelHISSelect.setBackground(secondary);
        }
        if (jf==home){
            home.setVisible(true);
            historyHome.setVisible(false);
            configuracoes.setVisible(false);
            personCRUD.setVisible(false);
            dispositivosCRUD.setVisible(false);
            activityCRUD.setVisible(false);
            
            jLabelHomeSelect.setBackground(secondary);
            jLabelATISelect.setBackground(primary);
            jLabelCONSelect.setBackground(primary);
            jLabelDisSelect.setBackground(primary);
            jLabelPesSelect.setBackground(primary);
            jLabelHISSelect.setBackground(primary);
        }
        repaintAll();
    }
    
    private void jLabelHomeSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeSelectMouseClicked
        setFramesVisible(home);         
        bdfunctions.getSelect("usuarios");
        
        repaintAll();
    }//GEN-LAST:event_jLabelHomeSelectMouseClicked

    private void jLabelPesSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesSelectMouseClicked
        setFramesVisible(personCRUD);        
        bdfunctions.parseUserToTable(bdfunctions.usuarios, personCRUD.dtmUsers, "usuarios");
    }//GEN-LAST:event_jLabelPesSelectMouseClicked

    private void jLabelDisSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDisSelectMouseClicked
        setFramesVisible(dispositivosCRUD);        
    }//GEN-LAST:event_jLabelDisSelectMouseClicked

    private void jLabelATISelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelATISelectMouseClicked
        setFramesVisible(activityCRUD);        
    }//GEN-LAST:event_jLabelATISelectMouseClicked

    private void jLabelCONSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCONSelectMouseClicked
        setFramesVisible(configuracoes);
    }//GEN-LAST:event_jLabelCONSelectMouseClicked

    private void jLabelHomeSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeSelectMouseEntered
        if (jLabelHomeSelect.getBackground()==primary){
            jLabelHomeSelect.setBackground(tertiary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelHomeSelectMouseEntered

    private void jLabelHomeSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeSelectMouseExited
        if (jLabelHomeSelect.getBackground()!=secondary){
            jLabelHomeSelect.setBackground(primary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelHomeSelectMouseExited

    private void jLabelPesSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesSelectMouseEntered
        if (jLabelPesSelect.getBackground()==primary){
            jLabelPesSelect.setBackground(tertiary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelPesSelectMouseEntered

    private void jLabelPesSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesSelectMouseExited
        if (jLabelPesSelect.getBackground()!=secondary){
            jLabelPesSelect.setBackground(primary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelPesSelectMouseExited

    private void jLabelDisSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDisSelectMouseEntered
        if (jLabelDisSelect.getBackground()==primary){
            jLabelDisSelect.setBackground(tertiary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelDisSelectMouseEntered

    private void jLabelDisSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDisSelectMouseExited
        if (jLabelDisSelect.getBackground()!=secondary){
            jLabelDisSelect.setBackground(primary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelDisSelectMouseExited

    private void jLabelATISelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelATISelectMouseEntered
        if (jLabelATISelect.getBackground()==primary){
            jLabelATISelect.setBackground(tertiary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelATISelectMouseEntered

    private void jLabelATISelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelATISelectMouseExited
        if (jLabelATISelect.getBackground()!=secondary){
            jLabelATISelect.setBackground(primary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelATISelectMouseExited

    private void jLabelCONSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCONSelectMouseEntered
        if (jLabelCONSelect.getBackground()==primary){
            jLabelCONSelect.setBackground(tertiary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelCONSelectMouseEntered

    private void jLabelCONSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCONSelectMouseExited
        if (jLabelCONSelect.getBackground()!=secondary){
            jLabelCONSelect.setBackground(primary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelCONSelectMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabelHISSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHISSelectMouseClicked
       setFramesVisible(historyHome);      
    }//GEN-LAST:event_jLabelHISSelectMouseClicked

    private void jLabelHISSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHISSelectMouseEntered
        if (jLabelHISSelect.getBackground()==primary){
            jLabelHISSelect.setBackground(tertiary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelHISSelectMouseEntered

    private void jLabelHISSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHISSelectMouseExited
        if (jLabelHISSelect.getBackground()!=secondary){
            jLabelHISSelect.setBackground(primary);
        }
        repaintAll();
    }//GEN-LAST:event_jLabelHISSelectMouseExited
    
    java.awt.Color secondary = new java.awt.Color(24, 154, 211);
    java.awt.Color primary = new java.awt.Color(16, 125, 172);
    java.awt.Color tertiary = new java.awt.Color(113, 199, 236);     
   
    void repaintAll(){          
        jPanelSelector.setVisible(false);
        jPanel1.setVisible(true);
        jPanelSelector.setVisible(true);
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPaneAbas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelATISelect;
    private javax.swing.JLabel jLabelATIVOS;
    private javax.swing.JLabel jLabelATIVOSI;
    private javax.swing.JLabel jLabelCONFIGURACOES;
    private javax.swing.JLabel jLabelCONFIGURACOESI;
    private javax.swing.JLabel jLabelCONSelect;
    private javax.swing.JLabel jLabelDISPOSITIVOS;
    private javax.swing.JLabel jLabelDISPOSITIVOSI;
    private javax.swing.JLabel jLabelDisSelect;
    private javax.swing.JLabel jLabelHISSelect;
    private javax.swing.JLabel jLabelHOME;
    private javax.swing.JLabel jLabelHOMEI;
    private javax.swing.JLabel jLabelHistoricoI;
    private javax.swing.JLabel jLabelHistoricoNome;
    private javax.swing.JLabel jLabelHomeSelect;
    private javax.swing.JLabel jLabelPESSOAI;
    private javax.swing.JLabel jLabelPESSOAS;
    private javax.swing.JLabel jLabelPesSelect;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMenuBG;
    private javax.swing.JPanel jPanelSelector;
    // End of variables declaration//GEN-END:variables
}
