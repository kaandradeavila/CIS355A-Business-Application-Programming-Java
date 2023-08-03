import javax.swing.JOptionPane;

/****************************************************************************
 Program Name: LandscapeGUI.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: Landscape GUI used in CIS355A Week 2 Course Project.
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

        lblTitle = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblInstructions2 = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        lblLength = new javax.swing.JLabel();
        lblSummary = new javax.swing.JLabel();
        scrOrderSummary = new javax.swing.JScrollPane();
        txaOrderSummary = new javax.swing.JTextArea();
        txtWidth = new javax.swing.JTextField();
        txtLength = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnSubmitOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kyrenia Ailen Andrade Avila Landscaping");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setText("Kyrenia Ailen Andrade Avila Landscapes");

        lblInstructions1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInstructions1.setText("Please enter your information:");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("Name:");

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAddress.setText("Address:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtName.setNextFocusableComponent(txtAddress);

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAddress.setNextFocusableComponent(txtWidth);

        lblInstructions2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInstructions2.setText("Enter the length and width of your yard:");

        lblWidth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWidth.setText("Width (ft):");

        lblLength.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLength.setText("Length (ft):");

        lblSummary.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSummary.setText("Order Summary:");

        txaOrderSummary.setEditable(false);
        txaOrderSummary.setBackground(new java.awt.Color(255, 255, 255));
        txaOrderSummary.setColumns(16);
        txaOrderSummary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txaOrderSummary.setRows(5);
        scrOrderSummary.setViewportView(txaOrderSummary);

        txtWidth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtWidth.setNextFocusableComponent(txtLength);

        txtLength.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLength.setNextFocusableComponent(btnCalculate);

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setNextFocusableComponent(btnSubmitOrder);
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnSubmitOrder.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSubmitOrder.setText("Submit Order");
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstructions1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(txtAddress)))
                            .addComponent(lblInstructions2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(scrOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSummary)
                                .addGap(104, 104, 104))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(439, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSubmitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstructions1)
                    .addComponent(lblSummary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblInstructions2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWidth)
                            .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLength)))
                    .addComponent(scrOrderSummary))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnSubmitOrder))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // validate the inputs
        if (validateInputs() == false)
        {
            return;         //end the method if validation failed
        }
        //create the Customer object and show the information
        Customer cust = createCustomer();
        txaOrderSummary.setText(cust.getDetails());
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrderActionPerformed
        submitOrder();
    }//GEN-LAST:event_btnSubmitOrderActionPerformed

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
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSummary;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JScrollPane scrOrderSummary;
    private javax.swing.JTextArea txaOrderSummary;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs()
    {
        String sName = txtName.getText();
        String sAddress = txtAddress.getText();
        String sWidth = txtWidth.getText();
        String sLength = txtLength.getText();

        if (sName.equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Enter a Name",
                    "Name Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocusInWindow();
            return false;
        }

        if (sAddress.equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Enter a Address",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sAddress.length() <= 5) 
        {
            JOptionPane.showMessageDialog(this,
                    "Address isn't long enough.",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sWidth.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter a Width",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.requestFocusInWindow();
            return false;
        }

        try 
        {
            Double.parseDouble(sWidth);
        } 
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Width must be a number",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.setText("");
            txtWidth.requestFocusInWindow();
            return false;
        }

        if (Double.parseDouble(sWidth) <= 0) 
        {
            JOptionPane.showMessageDialog(this,
                    "Width must be greater than 0",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }

        if (sLength.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter a Length",
                    "Length Error", JOptionPane.ERROR_MESSAGE);

            txtLength.requestFocusInWindow();
            return false;
        }

        try 
        {
            Double.parseDouble(sLength);
        } 
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Length must be a number",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;

        }

        if (Double.parseDouble(sLength) <= 0) {
            JOptionPane.showMessageDialog(this,
                    "Length must be must be greater than 0",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        } 
        else
        {
            // all is good so return true
            return true;
        }
    }

    private Customer createCustomer() 
    {
        String name = txtName.getText();
        String address = txtAddress.getText();
        double width = Double.parseDouble(txtWidth.getText());
        double length = Double.parseDouble(txtLength.getText());
        String yardType = "Grass";                // FIX THE TYPE
        double totalCost = width * length * 5.0;  // FIX THE PRICE

        Customer cust = new Customer(0, name, address, yardType, length, width, totalCost);
        return cust;
    }

    private void submitOrder()
    {
        JOptionPane.showMessageDialog(this, "Method is not complete.");
    }
}
