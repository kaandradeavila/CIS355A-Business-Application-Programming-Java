import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/****************************************************************************
 Program Name: LandscapeGUI_Info.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: LandscapeGUI where we ask customer to choose if they
 want grass or gravel for their yard, and sends them to the next page, in
 LandscapeGUI_Info.
 ****************************************************************************/

public class LandscapeGUI extends javax.swing.JFrame 
{
    public LandscapeGUI()
    {
        initComponents();

        //center the form
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgYardType = new javax.swing.ButtonGroup();
        lblCompanyName = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblGravelPrice = new javax.swing.JLabel();
        lblGrassPrice = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        rdoGravel = new javax.swing.JRadioButton();
        rdoGrass = new javax.swing.JRadioButton();
        lblImage = new javax.swing.JLabel();
        mnbMain = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        mniSubmitOrder = new javax.swing.JMenuItem();
        mniReset = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kyrenia Ailen Andrade Avila Landscaping");

        lblCompanyName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCompanyName.setText("Kyrenia Ailen Andrade Avila Landscapes");

        lblInstructions1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInstructions1.setText("Would you like a grass or gravel yard?");

        lblGravelPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGravelPrice.setText("$2 per sqft");

        lblGrassPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGrassPrice.setText("$5 per sqft");

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNext.setText("Next");
        btnNext.setNextFocusableComponent(btnReset);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btgYardType.add(rdoGravel);
        rdoGravel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoGravel.setText("Gravel");
        rdoGravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGravelActionPerformed(evt);
            }
        });

        btgYardType.add(rdoGrass);
        rdoGrass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoGrass.setText("Grass");
        rdoGrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGrassActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dirt.jpg"))); // NOI18N

        mnuFile.setText("File");

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuFile.add(mniExit);

        mnbMain.add(mnuFile);

        mnuOrder.setText("Order");

        mniSubmitOrder.setText("Submit Order");
        mniSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSubmitOrderActionPerformed(evt);
            }
        });
        mnuOrder.add(mniSubmitOrder);

        mniReset.setText("Reset");
        mniReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniResetActionPerformed(evt);
            }
        });
        mnuOrder.add(mniReset);

        mnbMain.add(mnuOrder);

        setJMenuBar(mnbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCompanyName)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGrassPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoGrass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoGravel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGravelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(304, 304, 304))))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(lblInstructions1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructions1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoGravel)
                    .addComponent(rdoGrass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGravelPrice)
                    .addComponent(lblGrassPrice))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnNext)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // create the second GUI form
        LandscapeGUI_Info infoForm = new LandscapeGUI_Info();
        
        //set default close operation to "dispose" so application stays open
        infoForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // launch the second GUI form by making it visible
        infoForm.setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void rdoGrassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGrassActionPerformed
        if (rdoGrass.isSelected())
        {
            // look in directory where the class exists the location of the "grass.jpg"
            URL location = this.getClass().getResource("grass.jpg");
            
            // create image using the location of "grass.jpg"
            ImageIcon icon = new ImageIcon(location);
            
            //set the image icon to the label
            lblImage.setIcon(icon);
        }
    }//GEN-LAST:event_rdoGrassActionPerformed

    private void rdoGravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGravelActionPerformed
        if (rdoGravel.isSelected())
        {
            //find image, create image icon, and set image icon to label
            lblImage.setIcon(new ImageIcon (this.getClass().getResource("gravel.jpg")));
        }
    }//GEN-LAST:event_rdoGravelActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // exit application
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSubmitOrderActionPerformed
        JOptionPane.showMessageDialog(this, "Method is not complete");
    }//GEN-LAST:event_mniSubmitOrderActionPerformed

    private void mniResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniResetActionPerformed
        reset();
    }//GEN-LAST:event_mniResetActionPerformed

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
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new LandscapeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgYardType;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblGrassPrice;
    private javax.swing.JLabel lblGravelPrice;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniReset;
    private javax.swing.JMenuItem mniSubmitOrder;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JRadioButton rdoGrass;
    private javax.swing.JRadioButton rdoGravel;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        //clear the radiobutton selection
        btgYardType.clearSelection();
        
        //put the image back to dirt
        lblImage.setIcon(new ImageIcon(this.getClass().getResource("dirt.jpg")));
    }

} //end LandscapeGUI.java
