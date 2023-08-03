
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/****************************************************************************
 Program Name: HealthProfileGUI.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: Health Profile GUI used in CIS355AWeek2Lab.java
 ****************************************************************************/
public class HealthProfileGUI extends javax.swing.JFrame {

    /**
     * Creates new form HealthProfileGUI
     */
    public HealthProfileGUI() {
        initComponents();
        
        // center the form and change background color
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.PINK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtHeightFt = new javax.swing.JTextField();
        lblHeightFt = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblHeightInches = new javax.swing.JLabel();
        txtHeightInches = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        lblBMI = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtBMI = new javax.swing.JTextField();
        lblMaxHR = new javax.swing.JLabel();
        txtMaxHR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Profile App");
        setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("Name:");

        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAge.setText("Age:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblWeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWeight.setText("Weight:");

        txtHeightFt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblHeightFt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHeightFt.setText("Height - Feet:");

        txtWeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblHeightInches.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHeightInches.setText("Height - Inches:");

        txtHeightInches.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDisplay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        lblBMI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBMI.setText("BMI:");

        lblCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCategory.setText("Category:");

        txtCategory.setEditable(false);
        txtCategory.setBackground(new java.awt.Color(255, 255, 255));
        txtCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtBMI.setEditable(false);
        txtBMI.setBackground(new java.awt.Color(255, 255, 255));
        txtBMI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblMaxHR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMaxHR.setText("Max Heart Rate:");

        txtMaxHR.setEditable(false);
        txtMaxHR.setBackground(new java.awt.Color(255, 255, 255));
        txtMaxHR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaxHR, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaxHR, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblHeightInches)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHeightInches, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblHeightFt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHeightFt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeightFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeightFt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeightInches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeightInches))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplay)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBMI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaxHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxHR))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // Verify textfields are not empty --> missing input
        if (txtName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Name is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocus();
            return;  //stop the method from running
        }
        
        if (txtAge.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Age is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtAge.requestFocus();
            return;  //stop the method from running
        }
        
        if (txtWeight.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Weight is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtWeight.requestFocus();
            return;  //stop the method from running
        }
        
        if (txtHeightFt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Height - Feet is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtHeightFt.requestFocus();
            return;  //stop the method from running
        }
        
        if (txtHeightInches.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Height - Inches is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtHeightInches.requestFocus();
            return;  //stop the method from running
        }
        // get data from textFields
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        double weight = Double.parseDouble(txtWeight.getText());
        int feet = Integer.parseInt(txtHeightFt.getText());
        double inches = Double.parseDouble(txtHeightInches.getText());
        
        //create HealthProfile object
        HealthProfile profile = new HealthProfile(name, age, weight, feet, inches);
        
        //show output
        double bmi = profile.calculateBMI();
        DecimalFormat fmt = new DecimalFormat("0.0");
        txtBMI.setText(fmt.format(bmi)); //since numbers can't keep a format, it automatically converts the number into a String
        txtCategory.setText(profile.calculateCategory());
        txtMaxHR.setText("" + profile.calculateMaxHR());
        
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // clear all fields
        txtName.setText("");
        txtAge.setText("");
        txtWeight.setText("");
        txtHeightFt.setText("");
        txtHeightInches.setText("");
        txtBMI.setText("");
        txtCategory.setText("");
        txtMaxHR.setText("");
        
        //move insertion point to name textfield
        txtName.requestFocus();

    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthProfileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblHeightFt;
    private javax.swing.JLabel lblHeightInches;
    private javax.swing.JLabel lblMaxHR;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtHeightFt;
    private javax.swing.JTextField txtHeightInches;
    private javax.swing.JTextField txtMaxHR;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
