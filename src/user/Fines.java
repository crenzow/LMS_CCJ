/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;



import dbConnection.DatabaseConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import main.Login;


public class Fines extends javax.swing.JFrame {
    private int userID;

    /**
     * Creates new form Admin
     */
    public Fines(int userID) {
        this.userID = userID;
        initComponents();
        loadFines();
        loadPayments();
        
    }
    
    public Fines() {
        this(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        finesBTN = new javax.swing.JButton();
        logoLBL = new javax.swing.JLabel();
        borrowingsBTN = new javax.swing.JButton();
        reservationBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        libraryBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fineIDTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amountPaidTXT = new javax.swing.JTextField();
        dateCalendarCBX = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel5 = new javax.swing.JLabel();
        payBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        statusCBX = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USER");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 109, 119));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finesBTN.setBackground(new java.awt.Color(131, 197, 190));
        finesBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        finesBTN.setText("FINES");
        finesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finesBTNActionPerformed(evt);
            }
        });
        jPanel2.add(finesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 170, 40));

        logoLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/200blackLOGO.png"))); // NOI18N
        jPanel2.add(logoLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        borrowingsBTN.setBackground(new java.awt.Color(131, 197, 190));
        borrowingsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        borrowingsBTN.setText("BORROWINGS");
        borrowingsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowingsBTNActionPerformed(evt);
            }
        });
        jPanel2.add(borrowingsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 40));

        reservationBTN.setBackground(new java.awt.Color(131, 197, 190));
        reservationBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reservationBTN.setText("RESERVATIONS");
        reservationBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationBTNActionPerformed(evt);
            }
        });
        jPanel2.add(reservationBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 170, 40));

        logoutBTN.setBackground(new java.awt.Color(131, 197, 190));
        logoutBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutBTN.setText("LOGOUT");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });
        jPanel2.add(logoutBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 170, 40));

        libraryBTN.setBackground(new java.awt.Color(131, 197, 190));
        libraryBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        libraryBTN.setText("LIBRARY");
        libraryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryBTNActionPerformed(evt);
            }
        });
        jPanel2.add(libraryBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 750));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fine ID", "Amount Due", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(0, 109, 119));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 119));
        jLabel1.setText("MY  FINES");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Fine ID:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Amount Paid:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Payment Date:");

        payBTN.setBackground(new java.awt.Color(131, 197, 190));
        payBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        payBTN.setText("PAY");
        payBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel6.setText("Filter:");

        statusCBX.setBackground(new java.awt.Color(131, 197, 190));
        statusCBX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statusCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpaid", "Paid", "Waived", "All" }));
        statusCBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCBXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(statusCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateCalendarCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountPaidTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(payBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(fineIDTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statusCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fineIDTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountPaidTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateCalendarCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(payBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FINES", jPanel3);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Payment ID", "Amount Paid", "Payment Date", "Payment Method"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setBackground(new java.awt.Color(0, 109, 119));
        jLabel2.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 109, 119));
        jLabel2.setText("MY  PAYMENT HISTORY");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PAYMENTS", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void finesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finesBTNActionPerformed
       
    }//GEN-LAST:event_finesBTNActionPerformed

    private void borrowingsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowingsBTNActionPerformed
        Borrowings borrFrame = new Borrowings(userID);
        this.setVisible(false);
        borrFrame.setVisible(true);
    }//GEN-LAST:event_borrowingsBTNActionPerformed

    private void reservationBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationBTNActionPerformed
        Reservations resFrame = new Reservations(userID);
        this.setVisible(false);
        resFrame.setVisible(true);
    }//GEN-LAST:event_reservationBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        Login loginFrame = new Login();
        this.setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void libraryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryBTNActionPerformed
        Library libFrame = new Library(userID);
        this.setVisible(false);
        libFrame.setVisible(true);
    }//GEN-LAST:event_libraryBTNActionPerformed

    private void payBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBTNActionPerformed
        // TODO add your handling code here:
        payFine();
    }//GEN-LAST:event_payBTNActionPerformed

    private void statusCBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCBXActionPerformed
        // TODO add your handling code here:
        filterByStatus();
    }//GEN-LAST:event_statusCBXActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        filterByStatus();
    }//GEN-LAST:event_formWindowOpened

    private void loadFines() {

    String sql = "select fineID, amount, status from fine where userID = ?";


    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear previous data

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        ps.setInt(1, userID);

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                
                
                int fineID = rs.getInt("fineID");
                Double amount = rs.getDouble("amount");
                
                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
                String formattedAmount = currencyFormat.format(amount);
                
                String status = rs.getString("status");

                model.addRow(new Object[]{fineID, formattedAmount, status});
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading borrowing history!", "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void filterByStatus() {
    String selectedStatus = statusCBX.getSelectedItem().toString();
    System.out.println("Selected Status: " + selectedStatus); // Debugging log

    String sql = "select fineID, amount, status from fine where userID = ?";

    // Apply filtering only if a specific genre is selected
    if (!selectedStatus.equals("All")) {
        sql += " and status = ?";
    }

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        ps.setInt(1, userID);
        if (!selectedStatus.equals("All")) {
            ps.setString(2, selectedStatus);
        }

        try (ResultSet rs = ps.executeQuery()) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear existing data

            while (rs.next()) {
                
                double amount = rs.getDouble("amount");
                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
                String formattedAmount = currencyFormat.format(amount);
                
                Object[] row = {
                    rs.getInt("fineID"),
                    formattedAmount,
                    rs.getString("status"),
                };
                model.addRow(row);
            }

            System.out.println("Rows added: " + model.getRowCount()); // Debugging log

        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    private void loadPayments() {

    String sql = "select paymentID, amountPaid, paymentDate, paymentMethod from payment where userID = ?";


    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0); // Clear previous data

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        ps.setInt(1, userID); // Set the user ID dynamically

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int paymentID = rs.getInt("paymentID");
                Double amount = rs.getDouble("amountPaid");
                
                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
                String formattedAmount = currencyFormat.format(amount);
                
                Date paymentDate = rs.getDate("paymentDate");
                String paymentMethod = rs.getString("paymentMethod");

                model.addRow(new Object[]{paymentID, formattedAmount,paymentDate, paymentMethod});
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading borrowing history!", "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void payFine() {
    try {
        // Retrieve inputs from UI components
        int fineID = Integer.parseInt(fineIDTXT.getText().trim());
        double amountPaid = Double.parseDouble(amountPaidTXT.getText().trim());
        java.util.Date selectedDate = (java.util.Date) dateCalendarCBX.getDate();
        java.sql.Date paymentDate = new java.sql.Date(selectedDate.getTime());

        // Stored userID from your Java file
        int userID = this.userID; // Assuming you have stored it in this Java file

        // Step 1: Check if fineID exists and verify the exact amount
        String checkFineSQL = "SELECT amount, status FROM Fine WHERE fineID = ?";
        
        try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(checkFineSQL)) {
            ps.setInt(1, fineID);
            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Fine ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double fineAmount = rs.getDouble("amount");
            String fineStatus = rs.getString("status");

            if (!fineStatus.equals("Unpaid")) {
                JOptionPane.showMessageDialog(this, "This fine is already paid or waived.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (fineAmount != amountPaid) {
                JOptionPane.showMessageDialog(this, "Payment must be the exact fine amount!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Step 2: Insert the payment into the Payment table
        String insertPaymentSQL = "INSERT INTO Payment (amountPaid, paymentDate, paymentMethod, userID, fineID) VALUES (?, ?, 'Online', ?, ?)";

        try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(insertPaymentSQL)) {
            ps.setDouble(1, amountPaid);
            ps.setDate(2, paymentDate);
            ps.setInt(3, userID);
            ps.setInt(4, fineID);
            ps.executeUpdate();
        }

        // Step 3: Update Fine status to "Paid"
        String updateFineSQL = "UPDATE Fine SET status = 'Paid' WHERE fineID = ?";

        try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(updateFineSQL)) {
            ps.setInt(1, fineID);
            ps.executeUpdate();
        }

        JOptionPane.showMessageDialog(this, "Payment successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        loadFines();
        loadPayments();
        filterByStatus();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error occurred!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}



    
    
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
            java.util.logging.Logger.getLogger(Fines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountPaidTXT;
    private javax.swing.JButton borrowingsBTN;
    private de.wannawork.jcalendar.JCalendarComboBox dateCalendarCBX;
    private javax.swing.JTextField fineIDTXT;
    private javax.swing.JButton finesBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton libraryBTN;
    private javax.swing.JLabel logoLBL;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton payBTN;
    private javax.swing.JButton reservationBTN;
    private javax.swing.JComboBox<String> statusCBX;
    // End of variables declaration//GEN-END:variables
}
