/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;



import dbConnection.DatabaseConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import user.*;
import main.Login;


public class Users extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Users() {
        initComponents();
        userInfo();
        loadUserBorrowingHistory();
        
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
        reservationsBTN = new javax.swing.JButton();
        booksBTN = new javax.swing.JButton();
        transactionsBTN = new javax.swing.JButton();
        userBTN = new javax.swing.JButton();
        settlementsBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        reportsBTN = new javax.swing.JButton();
        logoLBL1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        searchTXT = new javax.swing.JTextField();
        deleteBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        userIDTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contactTXT = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        stayeaseLBL5 = new javax.swing.JLabel();
        stayeaseLBL6 = new javax.swing.JLabel();
        stayeaseLBL1 = new javax.swing.JLabel();
        stayeaseLBL7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        borrowingsTBL = new javax.swing.JTable();
        stayeaseLBL8 = new javax.swing.JLabel();
        stayeaseLBL9 = new javax.swing.JLabel();
        stayeaseLBL2 = new javax.swing.JLabel();
        stayeaseLBL10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        setTitle("ADMIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 109, 119));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservationsBTN.setBackground(new java.awt.Color(131, 197, 190));
        reservationsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reservationsBTN.setText("RESERVATIONS");
        reservationsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationsBTNActionPerformed(evt);
            }
        });
        jPanel2.add(reservationsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 170, 40));

        booksBTN.setBackground(new java.awt.Color(131, 197, 190));
        booksBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        booksBTN.setText("BOOKS");
        booksBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksBTNActionPerformed(evt);
            }
        });
        jPanel2.add(booksBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 40));

        transactionsBTN.setBackground(new java.awt.Color(131, 197, 190));
        transactionsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        transactionsBTN.setText("TRANSACTIONS");
        transactionsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsBTNActionPerformed(evt);
            }
        });
        jPanel2.add(transactionsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 40));

        userBTN.setBackground(new java.awt.Color(131, 197, 190));
        userBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userBTN.setText("USERS");
        userBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBTNActionPerformed(evt);
            }
        });
        jPanel2.add(userBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 170, 40));

        settlementsBTN.setBackground(new java.awt.Color(131, 197, 190));
        settlementsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        settlementsBTN.setText("SETTLEMENTS");
        settlementsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settlementsBTNActionPerformed(evt);
            }
        });
        jPanel2.add(settlementsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 170, 40));

        logoutBTN.setBackground(new java.awt.Color(131, 197, 190));
        logoutBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutBTN.setText("LOGOUT");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });
        jPanel2.add(logoutBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 170, 40));

        reportsBTN.setBackground(new java.awt.Color(131, 197, 190));
        reportsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportsBTN.setText("REPORTS");
        reportsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsBTNActionPerformed(evt);
            }
        });
        jPanel2.add(reportsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 170, 40));

        logoLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/200whiteLOGO.png"))); // NOI18N
        jPanel2.add(logoLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 750));

        jTabbedPane1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(searchTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 350, 60));

        deleteBTN.setBackground(new java.awt.Color(131, 197, 190));
        deleteBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBTN.setText("Delete Borrower");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, -1, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User ID", "Name", "Email", "Contact"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 880, 300));
        jPanel3.add(userIDTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 260, 40));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("User ID:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 130, 40));
        jPanel3.add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 260, 40));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Email:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 130, 40));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 130, 40));
        jPanel3.add(nameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 260, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Contact:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 130, 40));
        jPanel3.add(contactTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 260, 40));

        searchBTN.setBackground(new java.awt.Color(131, 197, 190));
        searchBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        jPanel3.add(searchBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, 60));

        jButton4.setBackground(new java.awt.Color(131, 197, 190));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Edit Borrower");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 170, 60));

        stayeaseLBL5.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL5.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL5.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL5.setText("P");
        jPanel3.add(stayeaseLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 70));

        stayeaseLBL6.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL6.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL6.setText("AGE");
        jPanel3.add(stayeaseLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 90, 40));

        stayeaseLBL1.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL1.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL1.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL1.setText("H");
        jPanel3.add(stayeaseLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 60, -1));

        stayeaseLBL7.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL7.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL7.setText("UB");
        jPanel3.add(stayeaseLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 60, 60));

        jTabbedPane1.addTab("User Information", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrowingsTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Book Title", "Borrow Date", "Due Date", "Return Date", "Status"
            }
        ));
        jScrollPane2.setViewportView(borrowingsTBL);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 152, 821, 524));

        stayeaseLBL8.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL8.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL8.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL8.setText("P");
        jPanel4.add(stayeaseLBL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 70));

        stayeaseLBL9.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL9.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL9.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL9.setText("AGE");
        jPanel4.add(stayeaseLBL9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 90, 40));

        stayeaseLBL2.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL2.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL2.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL2.setText("H");
        jPanel4.add(stayeaseLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 60, -1));

        stayeaseLBL10.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL10.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL10.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL10.setText("UB");
        jPanel4.add(stayeaseLBL10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 60, 60));

        jLabel1.setBackground(new java.awt.Color(0, 109, 119));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 119));
        jLabel1.setText("BORROWING HISTORY");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jTabbedPane1.addTab("Borrowing History", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reservationsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationsBTNActionPerformed
        Reservations resFrame = new Reservations();
        this.setVisible(false);
        resFrame.setVisible(true);
    }//GEN-LAST:event_reservationsBTNActionPerformed

    private void booksBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksBTNActionPerformed
        Books bookFrame = new Books();
        this.setVisible(false);
        bookFrame.setVisible(true);
    }//GEN-LAST:event_booksBTNActionPerformed

    private void transactionsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsBTNActionPerformed
        Transactions tranFrame = new Transactions();
        this.setVisible(false);
        tranFrame.setVisible(true);
    }//GEN-LAST:event_transactionsBTNActionPerformed

    private void userBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBTNActionPerformed
     
    }//GEN-LAST:event_userBTNActionPerformed

    private void settlementsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settlementsBTNActionPerformed
        // TODO add your handling code here:
        Settlements setFrame = new Settlements();
        this.setVisible(false);
        setFrame.setVisible(true);
    }//GEN-LAST:event_settlementsBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
                                         
    String userID = searchTXT.getText().trim(); // Get User ID from search field

    // Check if User ID field is empty
    if (userID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a User ID to search.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sql = "SELECT * FROM user WHERE userID = ?";

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        ps.setInt(1, Integer.parseInt(userID)); // Set User ID parameter

        ResultSet rs = ps.executeQuery();

        // Clear existing table data
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        if (rs.next()) {
            // Populate the fields with fetched data
            userIDTXT.setText(String.valueOf(rs.getInt("userID")));
            nameTXT.setText(rs.getString("fullName"));
            emailTXT.setText(rs.getString("email"));
            contactTXT.setText(rs.getString("phoneNumber"));

            // Add result to table
            Object[] row = {
                rs.getInt("userID"),
                rs.getString("fullName"),
                rs.getString("email"),
                rs.getString("phoneNumber")
            };
            model.addRow(row);

        } else {
            JOptionPane.showMessageDialog(this, "No user found with User ID: " + userID, "Not Found", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error searching user: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid User ID format.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int selectedRow = jTable1.getSelectedRow();
         if (selectedRow != -1) {
        // Set text fields
        userIDTXT.setText(jTable1.getValueAt(selectedRow, 0).toString());  
        nameTXT.setText(jTable1.getValueAt(selectedRow, 1).toString());  
        emailTXT.setText(jTable1.getValueAt(selectedRow, 2).toString());  
        contactTXT.setText(jTable1.getValueAt(selectedRow, 3).toString());  
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                            
    // Fetch data from text fields
    String userID = userIDTXT.getText().trim();
    String fullName = nameTXT.getText().trim();
    String email = emailTXT.getText().trim();
    String phoneNumber = contactTXT.getText().trim();

    // Validate input fields
    if (userID.isEmpty() || fullName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in Full Name, Email, and Phone Number before updating.");
        return;
    }

    String sql = "UPDATE user SET fullName = ?, phoneNumber = ?, email = ? WHERE userID = ?";

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        ps.setString(1, fullName);
        ps.setString(2, phoneNumber);
        ps.setString(3, email);
        ps.setInt(4, Integer.parseInt(userID)); // Convert userID to int

        int updated = ps.executeUpdate();

        if (updated > 0) {
            JOptionPane.showMessageDialog(null, "User details updated successfully.");
            clearFields(); 
            refreshUserTable();
        
        } else {
            JOptionPane.showMessageDialog(null, "Update failed. User not found.");
        }
    } catch (SQLException | NumberFormatException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // Get userID from the text field
    String userID = userIDTXT.getText().trim();

    // Check if userID is provided
    if (userID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a valid User ID to delete.");
        return;
    }

    // Confirm deletion
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return; // Exit if user cancels deletion
    }

    String sql = "DELETE FROM user WHERE userID = ?";

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        ps.setInt(1, Integer.parseInt(userID)); // Convert userID to int

        int deleted = ps.executeUpdate();

        if (deleted > 0) {
            JOptionPane.showMessageDialog(null, "User deleted successfully.");
            refreshUserTable(); // Refresh table to reflect changes
            clearFields();      // Clear input fields
        } else {
            JOptionPane.showMessageDialog(null, "Delete failed. User not found.");
        }
    } catch (SQLException | NumberFormatException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        Login loginFrame = new Login();
        this.setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void reportsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsBTNActionPerformed
        // TODO add your handling code here:
        Reports reportFrame = new Reports();
        this.setVisible(false);
        reportFrame.setVisible(true);
    }//GEN-LAST:event_reportsBTNActionPerformed
    private void refreshUserTable() {
    String sql = "SELECT * FROM user";

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        // Clear existing data in the table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Populate table with updated user data
        while (rs.next()) {
            Object[] row = {
                rs.getInt("userID"),
                rs.getString("fullName"),
                rs.getString("email"),
                rs.getString("phoneNumber")
            };
            model.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error refreshing user table: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void clearFields() {
    userIDTXT.setText("");
    nameTXT.setText("");
    emailTXT.setText("");
    contactTXT.setText("");
}
    public void userInfo() {
    String sql = "SELECT userID, fullName, email, phoneNumber FROM user";

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing data

        while (rs.next()) {
            Object[] row = {
                rs.getInt("userID"),
                rs.getString("fullName"),
                rs.getString("email"),
                rs.getString("phoneNumber")
            };
            model.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void searchUsers(String keyword) {
    String sql;
    boolean n = keyword.matches("\\d+"); // Check if keyword is a number

    if (n) {
        sql = "SELECT userID, fullName, email, phoneNumber FROM user WHERE userID = ?";
    } else {
        sql = "SELECT userID, fullName, email, phoneNumber FROM user WHERE fullName LIKE ?";
    }

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        if (n) {
            ps.setInt(1, Integer.parseInt(keyword)); 
        } else {
            ps.setString(1, "%" + keyword + "%"); 
        }

        ResultSet rs = ps.executeQuery();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing data

        while (rs.next()) {
            Object[] row = {
                rs.getInt("userID"),
                rs.getString("fullName"),
                rs.getString("email"),
                rs.getString("phoneNumber"),
            };
            model.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    private void loadUserBorrowingHistory() {
    String sql = "SELECT u.fullName, b.title, t.borrowDate, t.dueDate, t.returnDate, t.status " +
                 "FROM Transaction t " +
                 "JOIN Book b ON t.bookID = b.bookID join user u on t.userID = u.userID order by borrowDate DESC";
    
    DefaultTableModel model = (DefaultTableModel) borrowingsTBL.getModel();
    model.setRowCount(0); // Clear previous data

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String fullName = rs.getString("fullName");
                String title = rs.getString("title");
                Date borrowDate = rs.getDate("borrowDate");
                Date dueDate = rs.getDate("dueDate");
                Date returnDate = rs.getDate("returnDate");
                String status = rs.getString("status");

                model.addRow(new Object[]{fullName, title, borrowDate, dueDate, returnDate, status});
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading borrowing history!", "Database Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booksBTN;
    private javax.swing.JTable borrowingsTBL;
    private javax.swing.JTextField contactTXT;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoLBL1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JButton reportsBTN;
    private javax.swing.JButton reservationsBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JButton settlementsBTN;
    private javax.swing.JLabel stayeaseLBL1;
    private javax.swing.JLabel stayeaseLBL10;
    private javax.swing.JLabel stayeaseLBL2;
    private javax.swing.JLabel stayeaseLBL5;
    private javax.swing.JLabel stayeaseLBL6;
    private javax.swing.JLabel stayeaseLBL7;
    private javax.swing.JLabel stayeaseLBL8;
    private javax.swing.JLabel stayeaseLBL9;
    private javax.swing.JButton transactionsBTN;
    private javax.swing.JButton userBTN;
    private javax.swing.JTextField userIDTXT;
    // End of variables declaration//GEN-END:variables
}
