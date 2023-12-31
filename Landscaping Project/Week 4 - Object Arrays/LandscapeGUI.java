import java.net.URL;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/****************************************************************************
 Program Name: LandscapeGUI.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: LandscapeGUI where we ask customer to choose if they
 want grass or gravel for their yard, and customer information for an order,
 gives customer an estimate, and then customer can submit order, each in
 different tabs.
 ****************************************************************************/

public class LandscapeGUI extends javax.swing.JFrame 
{
    //class level references and attributes
    DefaultListModel<Customer> customerList = new DefaultListModel();
    private final double GRASS_PER_SQFT = 5.00;
    private final double GRAVEL_PER_SQFT = 2.00;
    
    //constructor
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
        tabMain = new javax.swing.JTabbedPane();
        pnlWelcome = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblGravelPrice = new javax.swing.JLabel();
        lblGrassPrice = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        rdoGrass = new javax.swing.JRadioButton();
        rdoGravel = new javax.swing.JRadioButton();
        lblImage = new javax.swing.JLabel();
        pnlInformation = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblInstructions2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblInstructions3 = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        lblLength = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblSummary = new javax.swing.JLabel();
        scrOrderSummary = new javax.swing.JScrollPane();
        txaOrderSummary = new javax.swing.JTextArea();
        btnSubmitOrder = new javax.swing.JButton();
        pnlCustomerList = new javax.swing.JPanel();
        lblTitle3 = new javax.swing.JLabel();
        lblCustomerList = new javax.swing.JLabel();
        lblCustomerDetails = new javax.swing.JLabel();
        btnLoadList = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        scrCustomerDetails = new javax.swing.JScrollPane();
        txaCustomerDetails = new javax.swing.JTextArea();
        scrCustomerList = new javax.swing.JScrollPane();
        lstCustomerList = new javax.swing.JList<>();
        mnbMain = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        mniSubmitOrder = new javax.swing.JMenuItem();
        mniReset = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kyrenia Ailen Andrade Avila Landscaping");

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle1.setText("Kyrenia Ailen Andrade Avila Landscapes");

        lblInstructions1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInstructions1.setText("Would you like a grass or gravel yard?");

        lblGravelPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGravelPrice.setText("$2 per sqft");

        lblGrassPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGrassPrice.setText("$5 per sqft");

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNext.setText("Next");
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

        btgYardType.add(rdoGrass);
        rdoGrass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoGrass.setText("Grass");
        rdoGrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGrassActionPerformed(evt);
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

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dirt.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoGrass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrassPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoGravel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGravelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblTitle1)
                .addGap(0, 116, Short.MAX_VALUE))
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(lblInstructions1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInstructions1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoGravel)
                    .addComponent(rdoGrass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGravelPrice)
                    .addComponent(lblGrassPrice))
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(58, 58, 58))))
        );

        tabMain.addTab("Welcome", pnlWelcome);

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle2.setText("Kyrenia Ailen Andrade Avila Landscapes");

        lblInstructions2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInstructions2.setText("Please enter your information:");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("Name:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setNextFocusableComponent(txtAddress);

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAddress.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAddress.setNextFocusableComponent(txtWidth);

        lblInstructions3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInstructions3.setText("Enter the length and width of your yard:");

        lblWidth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWidth.setText("Width (ft):");

        txtWidth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtWidth.setNextFocusableComponent(txtLength);

        lblLength.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLength.setText("Length (ft):");

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

        lblSummary.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSummary.setText("Order Summary:");

        txaOrderSummary.setEditable(false);
        txaOrderSummary.setBackground(new java.awt.Color(255, 255, 255));
        txaOrderSummary.setColumns(16);
        txaOrderSummary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txaOrderSummary.setRows(5);
        scrOrderSummary.setViewportView(txaOrderSummary);

        btnSubmitOrder.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSubmitOrder.setText("Submit Order");
        btnSubmitOrder.setNextFocusableComponent(txtName);
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInformationLayout = new javax.swing.GroupLayout(pnlInformation);
        pnlInformation.setLayout(pnlInformationLayout);
        pnlInformationLayout.setHorizontalGroup(
            pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle2)
                .addGap(89, 89, 89))
            .addGroup(pnlInformationLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstructions2)
                            .addComponent(lblInstructions3)
                            .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlInformationLayout.createSequentialGroup()
                                    .addComponent(lblWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlInformationLayout.createSequentialGroup()
                                    .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformationLayout.createSequentialGroup()
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)))
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addComponent(lblSummary)
                        .addGap(76, 76, 76))
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addComponent(btnSubmitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addGap(29, 29, 29))
        );
        pnlInformationLayout.setVerticalGroup(
            pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformationLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle2)
                .addGap(18, 18, 18)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstructions2)
                    .addComponent(lblSummary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblInstructions3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWidth)
                            .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLength)))
                    .addComponent(scrOrderSummary, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnSubmitOrder))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tabMain.addTab("Information", pnlInformation);

        lblTitle3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle3.setText("Kyrenia Ailen Andrade Avila Landscapes");

        lblCustomerList.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCustomerList.setText("Customer List");

        lblCustomerDetails.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCustomerDetails.setText("Customer Details");

        btnLoadList.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLoadList.setText("Load List");
        btnLoadList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadListActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDeleteCustomer.setText("Delete Customer");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        txaCustomerDetails.setEditable(false);
        txaCustomerDetails.setBackground(new java.awt.Color(255, 255, 255));
        txaCustomerDetails.setColumns(20);
        txaCustomerDetails.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txaCustomerDetails.setRows(5);
        scrCustomerDetails.setViewportView(txaCustomerDetails);

        scrCustomerList.setToolTipText("");
        scrCustomerList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lstCustomerList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstCustomerList.setModel(customerList);
        lstCustomerList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCustomerListValueChanged(evt);
            }
        });
        scrCustomerList.setViewportView(lstCustomerList);

        javax.swing.GroupLayout pnlCustomerListLayout = new javax.swing.GroupLayout(pnlCustomerList);
        pnlCustomerList.setLayout(pnlCustomerListLayout);
        pnlCustomerListLayout.setHorizontalGroup(
            pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCustomerListLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblTitle3))
                    .addGroup(pnlCustomerListLayout.createSequentialGroup()
                        .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(lblCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(scrCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(scrCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustomerListLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnLoadList, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteCustomer)
                .addGap(140, 140, 140))
        );
        pnlCustomerListLayout.setVerticalGroup(
            pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerListLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerList)
                    .addComponent(lblCustomerDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrCustomerDetails)
                    .addComponent(scrCustomerList, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoadList)
                    .addComponent(btnDeleteCustomer))
                .addGap(44, 44, 44))
        );

        tabMain.addTab("Customer List", pnlCustomerList);

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
                .addContainerGap()
                .addComponent(tabMain)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // exit application
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSubmitOrderActionPerformed
        submitOrder();
    }//GEN-LAST:event_mniSubmitOrderActionPerformed

    private void mniResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniResetActionPerformed
        reset();
    }//GEN-LAST:event_mniResetActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        //confirm that a selection was made, then move to the next tab
        if(rdoGrass.isSelected() == false
                && rdoGravel.isSelected() == false)
        {
            JOptionPane.showMessageDialog(this, "Please select the type of yard.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            tabMain.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void rdoGravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGravelActionPerformed
        if (rdoGravel.isSelected())
        {
            //find image, create image icon, and set image icon to label
            lblImage.setIcon(new ImageIcon (this.getClass().getResource("gravel.jpg")));
        }
    }//GEN-LAST:event_rdoGravelActionPerformed

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

    private void btnLoadListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadListActionPerformed
        // we will work on this method next week
        JOptionPane.showMessageDialog(this, "Method is incomplete");
    }//GEN-LAST:event_btnLoadListActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        // get the index for the selected item
        int index = lstCustomerList.getSelectedIndex();
        
        //if something is selected, delete it and clear the details in the txaCustomerDetails
        if (index > -1)
        {
            customerList.remove(index);
            txaCustomerDetails.setText("");
        }
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void lstCustomerListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCustomerListValueChanged
        // get selected item’s index number
        int index = lstCustomerList.getSelectedIndex();

        // if something was selected, show the object’s details
        if (index > -1)
        {
            Customer cust = customerList.getElementAt(index);
            txaCustomerDetails.setText(cust.getDetails());
        }

    }//GEN-LAST:event_lstCustomerListValueChanged

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
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnLoadList;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCustomerDetails;
    private javax.swing.JLabel lblCustomerList;
    private javax.swing.JLabel lblGrassPrice;
    private javax.swing.JLabel lblGravelPrice;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblInstructions3;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSummary;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JList<Customer> lstCustomerList;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniReset;
    private javax.swing.JMenuItem mniSubmitOrder;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JPanel pnlCustomerList;
    private javax.swing.JPanel pnlInformation;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JRadioButton rdoGrass;
    private javax.swing.JRadioButton rdoGravel;
    private javax.swing.JScrollPane scrCustomerDetails;
    private javax.swing.JScrollPane scrCustomerList;
    private javax.swing.JScrollPane scrOrderSummary;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTextArea txaCustomerDetails;
    private javax.swing.JTextArea txaOrderSummary;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs()
    {
        //get inputs from user using the textboxes
        String sName = txtName.getText();
        String sAddress = txtAddress.getText();
        String sWidth = txtWidth.getText();
        String sLength = txtLength.getText();
        
        //confirm that a radiobutton has been selected
        if(btgYardType.getSelection() == null){
            JOptionPane.showMessageDialog(this, "Please select a type of yard.", "Error", JOptionPane.ERROR_MESSAGE);
            tabMain.setSelectedIndex(0);
            return false;
        }
        
        if (sName.equals("")) //you can also use if (sName.isBlank())
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

        if (sAddress.length() < 6) 
        {
            JOptionPane.showMessageDialog(this,
                    "Address isn't long enough. Address must be six characters or more.",
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

        //check to see if the width is a valid number
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
        //get input from textboxes
        String name = txtName.getText();
        String address = txtAddress.getText();
        double width = Double.parseDouble(txtWidth.getText());
        double length = Double.parseDouble(txtLength.getText());
        
        //variables that will change depending on the radiobutton selected by the customer
        String yardType = "";
        double totalCost = 0.0;
        
        if (rdoGrass.isSelected())
        {
            yardType = "Grass";
            totalCost = GRASS_PER_SQFT * width * length;
        }
        
        else if (rdoGravel.isSelected())
        {
            yardType = "Gravel";
            totalCost = GRAVEL_PER_SQFT * width * length;
        }
        
        //create customer object
        Customer cust = new Customer(0, name, address, yardType, length, width, totalCost);
        return cust;
    }

    private void submitOrder()
    {
        //validate the input data
        if(validateInputs() == false)
        {
            return;     //end method if validation failed
        }
        
        //creating customer object and adding it to the Customer List
        Customer cust = createCustomer();
        customerList.addElement(cust);
        txaCustomerDetails.setText(cust.getDetails());
        
        //reset for the next customer
        reset();
        
        //move to the client order tab
        tabMain.setSelectedIndex(2);
    }
    
    private void reset() {
        //clear the radiobutton selection
        btgYardType.clearSelection();
        
        //put the image back to dirt
        lblImage.setIcon(new ImageIcon(this.getClass().getResource("dirt.jpg")));
        
        //clear the fields in the Information Tab
        txtName.setText("");
        this.txtName.requestFocusInWindow();
        txtAddress.setText("");
        txtLength.setText("");
        txtWidth.setText("");
        txaOrderSummary.setText("");
    }

} //end LandscapeGUI.java
