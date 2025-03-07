/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;




import dbConnection.DatabaseConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import user.*;
import main.Login;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Reservations extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Reservations() {
        initComponents();
        loadReservationsData();
        filterByStatus();
        initComboBoxListener();
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
        searchTXT = new javax.swing.JTextField();
        declineBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        titleTXT = new javax.swing.JTextField();
        nameTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCalendarCB = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel5 = new javax.swing.JLabel();
        statusCB = new javax.swing.JComboBox<>();
        searchBTN = new javax.swing.JButton();
        approveBTN = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        stayeaseLBL5 = new javax.swing.JLabel();
        stayeaseLBL6 = new javax.swing.JLabel();
        stayeaseLBL1 = new javax.swing.JLabel();
        stayeaseLBL7 = new javax.swing.JLabel();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(searchTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 350, 60));

        declineBTN.setBackground(new java.awt.Color(131, 197, 190));
        declineBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        declineBTN.setText("Decline");
        declineBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBTNActionPerformed(evt);
            }
        });
        jPanel1.add(declineBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 150, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Reservation ID", "Book Title", "Name", "Reservation Date", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 880, 340));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel2.setText("Title:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 70, 40));

        titleTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTXTActionPerformed(evt);
            }
        });
        jPanel1.add(titleTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 210, 40));
        jPanel1.add(nameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 210, 40));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 70, 40));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel4.setText("Status:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 60, 40));
        jPanel1.add(jCalendarCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 210, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel5.setText("Filter:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 60, 40));

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Cancelled", " " }));
        jPanel1.add(statusCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 210, 40));

        searchBTN.setBackground(new java.awt.Color(131, 197, 190));
        searchBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        jPanel1.add(searchBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, 60));

        approveBTN.setBackground(new java.awt.Color(131, 197, 190));
        approveBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        approveBTN.setText("Approve");
        approveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBTNActionPerformed(evt);
            }
        });
        jPanel1.add(approveBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 150, 60));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Status", "Pending", "Approved", "Cancelled" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 170, 60));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel6.setText("Date:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 60, 40));

        stayeaseLBL5.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL5.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL5.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL5.setText("P");
        jPanel1.add(stayeaseLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 70));

        stayeaseLBL6.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL6.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL6.setText("AGE");
        jPanel1.add(stayeaseLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 90, 40));

        stayeaseLBL1.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL1.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL1.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL1.setText("H");
        jPanel1.add(stayeaseLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, -1));

        stayeaseLBL7.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL7.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL7.setText("UB");
        jPanel1.add(stayeaseLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 60, 60));

        jLabel1.setBackground(new java.awt.Color(0, 109, 119));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 119));
        jLabel1.setText("RESERVATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reservationsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationsBTNActionPerformed

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
        Users userFrame = new Users();
        this.setVisible(false);
        userFrame.setVisible(true);
    }//GEN-LAST:event_userBTNActionPerformed

    private void settlementsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settlementsBTNActionPerformed
        // TODO add your handling code here:
        Settlements setFrame = new Settlements();
        this.setVisible(false);
        setFrame.setVisible(true);
    }//GEN-LAST:event_settlementsBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
    // Get the value entered in the searchTXT text field
String searchValue = searchTXT.getText().trim();

// Check if the search value is not empty
if (!searchValue.isEmpty()) {
    try {
        // SQL query to search for a reservation based on reservationID
        String sql = "SELECT r.reservationID, b.title, u.fullName, r.reservationDate, r.status " +
                     "FROM Reservation r " +
                     "JOIN Book b ON r.bookID = b.bookID " +
                     "JOIN User u ON r.userID = u.userID " + 
                     "WHERE reservationID = ?";

        // Prepare and execute the query
        try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(searchValue));  // Search by reservationID

            try (ResultSet rs = ps.executeQuery()) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Get table model
                model.setRowCount(0); // Clear existing data

                // Check if a record was found
                if (rs.next()) {
                    // Add the retrieved data to the table model
                    Object[] row = {
                        rs.getInt("reservationID"),
                        rs.getString("title"),
                        rs.getString("fullName"),
                        rs.getDate("reservationDate"),
                        rs.getString("status")
                    };
                    model.addRow(row);

                    // ✅ Populate the text fields with the fetched data
                    titleTXT.setText(rs.getString("title")); // Book Title
                    nameTXT.setText(rs.getString("fullName")); // Name

                    // Set JCalendarComboBox (Reservation Date)
                    java.util.Date date = rs.getDate("reservationDate");
                    jCalendarCB.setDate(date); // For JCalendarComboBox

                    // Set Status ComboBox
                    statusCB.setSelectedItem(rs.getString("status"));
                } else {
                    JOptionPane.showMessageDialog(null, "No reservation found with that ID.");
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error searching for reservation: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid number for reservation ID.");
    }
} else {
    // If the search field is empty, show all reservations from the table
    try {
        String sql = "SELECT r.reservationID, b.title, u.fullName, r.reservationDate, r.status " +
                     "FROM Reservation r " +
                     "JOIN Book b ON r.bookID = b.bookID " +
                     "JOIN User u ON r.userID = u.userID"; 

        // Prepare and execute the query
        try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Get table model
            model.setRowCount(0); // Clear existing data

            // Iterate over the results and add them to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("reservationID"),
                    rs.getString("title"),
                    rs.getString("fullName"),
                    rs.getDate("reservationDate"),
                    rs.getString("status")
                };
                model.addRow(row);
            }

            // If no records found, inform the user
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No reservations found.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching reservations: " + e.getMessage());
    }
}

    }//GEN-LAST:event_searchBTNActionPerformed

    private void titleTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTXTActionPerformed

    private void declineBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBTNActionPerformed
        // TODO add your handling code here:
        declineReservation();
    }//GEN-LAST:event_declineBTNActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        // Set text fields
        titleTXT.setText(jTable1.getValueAt(selectedRow, 1).toString());  // Book Title
        nameTXT.setText(jTable1.getValueAt(selectedRow, 2).toString());   // Name

        // Set JCalendarComboBox (Reservation Date)
        String dateStr = jTable1.getValueAt(selectedRow, 3).toString();   // Reservation Date
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   // Adjust if needed
            Date date = sdf.parse(dateStr);
            jCalendarCB.setDate(date);  // For JCalendarComboBox
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Set Status ComboBox
        statusCB.setSelectedItem(jTable1.getValueAt(selectedRow, 4).toString()); // Status
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void approveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBTNActionPerformed
        // TODO add your handling code here:
        approveReservation();
    }//GEN-LAST:event_approveBTNActionPerformed

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

    public void approveReservation() {
    String title = titleTXT.getText();  // Get book title from the input field
    String fullName = nameTXT.getText();  // Get user's full name from the input field
    java.util.Date reservationDate = jCalendarCB.getDate();  // Get reservation date from the calendar component
    String status = statusCB.getSelectedItem().toString();  // Get status from the combo box (assuming it's a String)

    // SQL query to find bookID using the title
    String getBookIDSql = "SELECT bookID FROM book WHERE title = ?";
    
    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(getBookIDSql)) {
        ps.setString(1, title);  // Set the title parameter for the query
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            String bookID = rs.getString("bookID");  // Get bookID from the result set

            // SQL query to find userID using the fullName
            String getUserIDSql = "SELECT userID FROM user WHERE fullName = ?";
            
            try (PreparedStatement ps2 = DatabaseConnection.getInstance().getConnection().prepareStatement(getUserIDSql)) {
                ps2.setString(1, fullName);  // Set the full name parameter for the query
                ResultSet rs2 = ps2.executeQuery();
                
                if (rs2.next()) {
                    String userID = rs2.getString("userID");  // Get userID from the result set

                    // SQL query to find the reservationID using bookID, userID, reservationDate, and status
                    String getReservationIDSql = "SELECT reservationID FROM reservation "
                            + "WHERE bookID = ? AND userID = ? AND reservationDate = ? AND status = ?";
                    
                    try (PreparedStatement ps3 = DatabaseConnection.getInstance().getConnection().prepareStatement(getReservationIDSql)) {
                        ps3.setString(1, bookID);  // Set the bookID
                        ps3.setString(2, userID);  // Set the userID
                        ps3.setDate(3, new java.sql.Date(reservationDate.getTime()));  // Set the reservationDate
                        ps3.setString(4, status);  // Set the status

                        ResultSet rs3 = ps3.executeQuery();
                        
                        if (rs3.next()) {
                            int reservationID = rs3.getInt("reservationID");  // Get reservationID from the result set

                            // SQL query to update the status to "Approved"
                            String updateStatusSql = "UPDATE reservation SET status = 'Approved' WHERE reservationID = ?";
                            
                            try (PreparedStatement ps4 = DatabaseConnection.getInstance().getConnection().prepareStatement(updateStatusSql)) {
                                ps4.setInt(1, reservationID);  // Set the reservationID to update
                                
                                int result = ps4.executeUpdate();  // Execute the update query
                                if (result > 0) {
                                    JOptionPane.showMessageDialog(this, "Reservation approved successfully.");
                                    loadReservationsData();
                                } else {
                                    JOptionPane.showMessageDialog(this, "Failed to approve reservation.");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "No matching reservation found.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "User not found.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Book not found.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred while approving the reservation.");
    }
}
    
    public void declineReservation() {
    String title = titleTXT.getText();  // Get book title from the input field
    String fullName = nameTXT.getText();  // Get user's full name from the input field
    java.util.Date reservationDate = jCalendarCB.getDate();  // Get reservation date from the calendar component
    String status = statusCB.getSelectedItem().toString();  // Get status from the combo box (assuming it's a String)

    // SQL query to find bookID using the title
    String getBookIDSql = "SELECT bookID FROM book WHERE title = ?";
    
    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(getBookIDSql)) {
        ps.setString(1, title);  // Set the title parameter for the query
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            String bookID = rs.getString("bookID");  // Get bookID from the result set

            // SQL query to find userID using the fullName
            String getUserIDSql = "SELECT userID FROM user WHERE fullName = ?";
            
            try (PreparedStatement ps2 = DatabaseConnection.getInstance().getConnection().prepareStatement(getUserIDSql)) {
                ps2.setString(1, fullName);  // Set the full name parameter for the query
                ResultSet rs2 = ps2.executeQuery();
                
                if (rs2.next()) {
                    String userID = rs2.getString("userID");  // Get userID from the result set

                    // SQL query to find the reservationID using bookID, userID, reservationDate, and status
                    String getReservationIDSql = "SELECT reservationID FROM reservation "
                            + "WHERE bookID = ? AND userID = ? AND reservationDate = ? AND status = ?";
                    
                    try (PreparedStatement ps3 = DatabaseConnection.getInstance().getConnection().prepareStatement(getReservationIDSql)) {
                        ps3.setString(1, bookID);  // Set the bookID
                        ps3.setString(2, userID);  // Set the userID
                        ps3.setDate(3, new java.sql.Date(reservationDate.getTime()));  // Set the reservationDate
                        ps3.setString(4, status);  // Set the status

                        ResultSet rs3 = ps3.executeQuery();
                        
                        if (rs3.next()) {
                            int reservationID = rs3.getInt("reservationID");  // Get reservationID from the result set

                            // SQL query to update the status to "Approved"
                            String updateStatusSql = "UPDATE reservation SET status = 'Cancelled' WHERE reservationID = ?";
                            
                            try (PreparedStatement ps4 = DatabaseConnection.getInstance().getConnection().prepareStatement(updateStatusSql)) {
                                ps4.setInt(1, reservationID);  // Set the reservationID to update
                                
                                int result = ps4.executeUpdate();  // Execute the update query
                                if (result > 0) {
                                    JOptionPane.showMessageDialog(this, "Reservation approved successfully.");
                                    loadReservationsData();
                                } else {
                                    JOptionPane.showMessageDialog(this, "Failed to approve reservation.");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "No matching reservation found.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "User not found.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Book not found.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred while approving the reservation.");
    }
}

    public void loadReservationsData() {
    String sql = "SELECT r.reservationID, b.title, u.fullName, r.reservationDate, r.status " +
             "FROM Reservation r " +
             "JOIN Book b ON r.bookID = b.bookID " +
             "JOIN User u ON r.userID = u.userID order by reservationID ASC"; 

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Change to your table name
        model.setRowCount(0); // Clear existing data

        while (rs.next()) {
            Object[] row = {
                rs.getInt("reservationID"),
                rs.getString("title"),
                rs.getString("fullName"),
                rs.getDate("reservationDate"),  // Assuming it's a DATE type field
                rs.getString("status")
            };
            model.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    private void filterByStatus() {
    // Get the selected value from the jComboBox2 (All Status, Pending, Cancelled, Approved)
    String selectedStatus = (String) jComboBox2.getSelectedItem();

    // Check if a valid selection is made
    if (selectedStatus != null && !selectedStatus.isEmpty()) {
        try {
            String sql;

            // If "All Status" is selected, fetch all records without filtering by status
            if (selectedStatus.equals("All Status")) {
                sql = "SELECT r.reservationID, b.title, u.fullName, r.reservationDate, r.status " +
             "FROM Reservation r " +
             "JOIN Book b ON r.bookID = b.bookID " +
             "JOIN User u ON r.userID = u.userID order by reservationID ASC";
            } else {
                // Otherwise, filter by the selected status
                sql = "SELECT r.reservationID, b.title, u.fullName, r.reservationDate, r.status " +
             "FROM Reservation r " +
             "JOIN Book b ON r.bookID = b.bookID " +
             "JOIN User u ON r.userID = u.userID " + 
             "WHERE status = ?";
            }

            // Prepare and execute the query
            try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
                // Set the status if it's not "All Status"
                if (!selectedStatus.equals("All Status")) {
                    ps.setString(1, selectedStatus);  // Set the selected status value in the query
                }

                try (ResultSet rs = ps.executeQuery()) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Get table model
                    model.setRowCount(0); // Clear existing data

                    // Iterate over the results and add them to the table model
                    while (rs.next()) {
                        Object[] row = {
                            rs.getInt("reservationID"),
                            rs.getString("title"),
                            rs.getString("fullName"),
                            rs.getDate("reservationDate"),  // Assuming it's a DATE type field
                            rs.getString("status")
            };
                        model.addRow(row); // Add each row to the table
                    }

                    // If no records found, inform the user
                    if (model.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(null, "No reservations found with the status: " + selectedStatus);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching filtered reservations: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a status to filter.");
    }
}


    private void initComboBoxListener() {
        // Adding an ActionListener to the jComboBox2 to filter by status whenever the selection changes
        jComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the filter method when the combobox selection changes
                filterByStatus();
            }
        });
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
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Reservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveBTN;
    private javax.swing.JButton booksBTN;
    private javax.swing.JButton declineBTN;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarCB;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoLBL1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JButton reportsBTN;
    private javax.swing.JButton reservationsBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JButton settlementsBTN;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JLabel stayeaseLBL1;
    private javax.swing.JLabel stayeaseLBL5;
    private javax.swing.JLabel stayeaseLBL6;
    private javax.swing.JLabel stayeaseLBL7;
    private javax.swing.JTextField titleTXT;
    private javax.swing.JButton transactionsBTN;
    private javax.swing.JButton userBTN;
    // End of variables declaration//GEN-END:variables
}
