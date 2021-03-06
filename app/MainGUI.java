/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author USER
 */
public class MainGUI extends javax.swing.JFrame {

    boolean profileButtonBool = false, settingsButtonBool = false;
    int xMouse, yMouse;
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        profileDropContainer.setVisible(false);
        settingsDropContainer.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        profileButton = new javax.swing.JLabel();
        settingsButton = new javax.swing.JLabel();
        graphicsButton = new javax.swing.JLabel();
        acButton = new javax.swing.JLabel();
        profileDropContainer = new javax.swing.JPanel();
        gsButton = new javax.swing.JButton();
        pcButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        settingsDropContainer = new javax.swing.JPanel();
        regionButton = new javax.swing.JButton();
        currencyButton = new javax.swing.JButton();
        attButton = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        chart = new javax.swing.JLabel();
        chart2 = new javax.swing.JLabel();
        plusButton = new javax.swing.JLabel();
        minusButton = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(900, 900));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        contentPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/profileButton.png"))); // NOI18N
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileButtonMouseExited(evt);
            }
        });
        contentPane.add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 40));

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/settings.png"))); // NOI18N
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        contentPane.add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 53, 105, 40));

        graphicsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/graphics.png"))); // NOI18N
        graphicsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        graphicsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graphicsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graphicsButtonMouseExited(evt);
            }
        });
        contentPane.add(graphicsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 53, 110, 40));

        acButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/acButton.png"))); // NOI18N
        acButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acButtonMouseExited(evt);
            }
        });
        contentPane.add(acButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 53, 220, 40));

        profileDropContainer.setOpaque(false);
        profileDropContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gsButton.setBackground(new java.awt.Color(255, 255, 255));
        gsButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gsButton.setText("General Settings");
        gsButton.setBorder(null);
        gsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileDropContainer.add(gsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        pcButton.setBackground(new java.awt.Color(255, 255, 255));
        pcButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pcButton.setText("Password Change");
        pcButton.setBorder(null);
        pcButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileDropContainer.add(pcButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 30));

        logButton.setBackground(new java.awt.Color(255, 255, 255));
        logButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logButton.setText("Logout");
        logButton.setBorder(null);
        logButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileDropContainer.add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 30));

        contentPane.add(profileDropContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 182, 90));

        settingsDropContainer.setOpaque(false);
        settingsDropContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regionButton.setText("Region");
        regionButton.setActionCommand("");
        regionButton.setBorder(null);
        regionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsDropContainer.add(regionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 182, 30));

        currencyButton.setText("Currency");
        currencyButton.setBorder(null);
        currencyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsDropContainer.add(currencyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 182, 30));

        attButton.setText("Add Transaction Type");
        attButton.setBorder(null);
        attButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsDropContainer.add(attButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 182, 30));

        contentPane.add(settingsDropContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 182, 90));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        contentPane.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        contentPane.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 0, 38, 40));

        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        contentPane.add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        chart.setBackground(new java.awt.Color(255, 255, 255));
        chart.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        chart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chart.setText("Mini Chart One Goes Here");
        chart.setOpaque(true);
        contentPane.add(chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 380, 310));

        chart2.setBackground(new java.awt.Color(255, 255, 255));
        chart2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        chart2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chart2.setText("Mini Chart Two Goes Here");
        chart2.setOpaque(true);
        contentPane.add(chart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 380, 310));

        plusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/plusButton.png"))); // NOI18N
        plusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusButtonMouseExited(evt);
            }
        });
        contentPane.add(plusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 80, 80));

        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/minusButton.png"))); // NOI18N
        minusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusButtonMouseExited(evt);
            }
        });
        contentPane.add(minusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 80, 80));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        contentPane.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 560, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Activity Timeline");
        contentPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, 120, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Summary of timeline goes here");
        jLabel2.setOpaque(true);
        contentPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 760, 130));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/MainGUI.png"))); // NOI18N
        contentPane.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseEntered
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/profileButtonHover.png")));
    }//GEN-LAST:event_profileButtonMouseEntered

    private void profileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseExited
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/profileButton.png")));
    }//GEN-LAST:event_profileButtonMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        if(profileButtonBool == true){
            profileDropContainer.setVisible(false);
            profileButtonBool = false;
        }else  if(profileButtonBool == false){
            profileDropContainer.setVisible(true);
            profileButtonBool = true;
        }  
    }//GEN-LAST:event_profileButtonMouseClicked

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/settingsHover.png")));
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/settings.png")));
    }//GEN-LAST:event_settingsButtonMouseExited

    private void graphicsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphicsButtonMouseEntered
        graphicsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/graphicsHover.png")));
    }//GEN-LAST:event_graphicsButtonMouseEntered

    private void graphicsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphicsButtonMouseExited
       graphicsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/graphics.png")));
    }//GEN-LAST:event_graphicsButtonMouseExited

    private void acButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acButtonMouseEntered
        acButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/acButtonHover.png")));
    }//GEN-LAST:event_acButtonMouseEntered

    private void acButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acButtonMouseExited
        acButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/acButton.png")));
    }//GEN-LAST:event_acButtonMouseExited

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int x = evt.getXOnScreen();
	int y = evt.getYOnScreen();				
	this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
         if(settingsButtonBool == true){
            settingsDropContainer.setVisible(false);
            settingsButtonBool = false;
        }else  if(settingsButtonBool == false){
            settingsDropContainer.setVisible(true);
            settingsButtonBool = true;
        }
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        settingsButtonBool = false;
        settingsDropContainer.setVisible(false);
        profileButtonBool = false;
        profileDropContainer.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void plusButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseEntered
        plusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/plusButtonHover.png")));
    }//GEN-LAST:event_plusButtonMouseEntered

    private void plusButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseExited
        plusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/plusButton.png")));
    }//GEN-LAST:event_plusButtonMouseExited

    private void minusButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseEntered
        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/minusButtonHover.png")));
    }//GEN-LAST:event_minusButtonMouseEntered

    private void minusButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseExited
        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/pics/minusButton.png")));
    }//GEN-LAST:event_minusButtonMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acButton;
    private javax.swing.JButton attButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel chart;
    private javax.swing.JLabel chart2;
    private javax.swing.JLabel close;
    private javax.swing.JPanel contentPane;
    private javax.swing.JButton currencyButton;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel graphicsButton;
    private javax.swing.JButton gsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logButton;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel minusButton;
    private javax.swing.JButton pcButton;
    private javax.swing.JLabel plusButton;
    private javax.swing.JLabel profileButton;
    private javax.swing.JPanel profileDropContainer;
    private javax.swing.JButton regionButton;
    private javax.swing.JLabel settingsButton;
    private javax.swing.JPanel settingsDropContainer;
    // End of variables declaration//GEN-END:variables
}
