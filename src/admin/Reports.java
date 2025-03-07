/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;



import dbConnection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import user.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;

import main.Login;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Reports() {
        initComponents();
        showMostBorrowedBooksChart();
        displayReservationApprovalRate();
        displayFineCollectionStatus();
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
        logoLBL1 = new javax.swing.JLabel();
        reportsBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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

        logoLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/200whiteLOGO.png"))); // NOI18N
        jPanel2.add(logoLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        reportsBTN.setBackground(new java.awt.Color(131, 197, 190));
        reportsBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportsBTN.setText("REPORTS");
        reportsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsBTNActionPerformed(evt);
            }
        });
        jPanel2.add(reportsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 170, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 750));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 260, 260));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 260, 260));

        jLabel1.setBackground(new java.awt.Color(0, 109, 119));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 119));
        jLabel1.setText("USAGE & COLLECTION ANALYSIS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

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
        Users userFrame = new Users();
        this.setVisible(false);
        userFrame.setVisible(true);
    }//GEN-LAST:event_userBTNActionPerformed

    private void settlementsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settlementsBTNActionPerformed
        Settlements setFrame = new Settlements();
        this.setVisible(false);
        setFrame.setVisible(true); 
    }//GEN-LAST:event_settlementsBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        Login loginFrame = new Login();
        this.setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void reportsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsBTNActionPerformed

    }//GEN-LAST:event_reportsBTNActionPerformed

    private void showMostBorrowedBooksChart() {
    // Create dataset for top 10 most borrowed books
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
    // Database connection
    Connection conn = DatabaseConnection.getInstance().getConnection();
    Map<String, Color> bookColors = new HashMap<>(); // Store book-color mapping
    int bookCount = 0; // Track number of books

    if (conn != null) {
        // Query to get the top 10 most borrowed books
        String query = "SELECT b.title, COUNT(t.bookID) AS borrowCount " +
                       "FROM Transaction t " +
                       "JOIN Book b ON t.bookID = b.bookID " +
                       "GROUP BY b.title " +
                       "ORDER BY borrowCount DESC " +
                       "LIMIT 10";

        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String bookTitle = rs.getString("title");
                int borrowCount = rs.getInt("borrowCount");
                dataset.addValue(borrowCount, bookTitle, "");

                // Generate a unique color for each book
                float hue = (float) bookCount / 10; // Evenly spaced colors
                Color uniqueColor = Color.getHSBColor(hue, 0.8f, 0.9f);
                bookColors.put(bookTitle, uniqueColor);
                
                bookCount++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                "Error fetching borrowed book data: " + e.getMessage(), 
                "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Create the bar chart
    JFreeChart chart = ChartFactory.createBarChart(
            "Top 10 Most Borrowed Books",  // Chart title
            "Book Title",                   // X-Axis Label
            "Times Borrowed",               // Y-Axis Label
            dataset,                        // Dataset
            PlotOrientation.VERTICAL,       // Orientation
            true,                           // Enable legend
            true,                           // Enable tooltips
            false                           // Disable URLs
    );

    // Customize colors per book
    CategoryPlot plot = chart.getCategoryPlot();
    BarRenderer renderer = (BarRenderer) plot.getRenderer();

    int index = 0;
    for (Object obj : dataset.getRowKeys()) { // Get row keys (book titles)
        String book = obj.toString(); // Convert Object to String
        if (bookColors.containsKey(book)) {
            renderer.setSeriesPaint(index, bookColors.get(book));
        }
        index++;
    }

    // Create chart panel
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setBounds(20, 130, 620, 600); // Set (x, y, width, height)

    // Ensure jLabel10 allows adding components
    jPanel1.setLayout(null);
    jPanel1.add(chartPanel, BorderLayout.CENTER);

    jPanel1.revalidate(); // Refresh panel
    jPanel1.repaint();    // Redraw panel
} 
    
    
    private void displayReservationApprovalRate() {
    // Create the dataset
    DefaultPieDataset dataset = new DefaultPieDataset();

    // Database connection and query to fetch reservation counts by status
    Connection conn = DatabaseConnection.getInstance().getConnection();
    if (conn != null) {
        String query = "SELECT status, COUNT(*) AS count FROM Reservation GROUP BY status";

        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String status = rs.getString("status");
                int count = rs.getInt("count");
                dataset.setValue(status, count);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Error fetching reservation data: " + e.getMessage(), 
                "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Create the Pie Chart using JFreeChart
    JFreeChart chart = ChartFactory.createPieChart(
            "Reservation Approval Rate",  // Chart title
            dataset,                      // Dataset
            true,                         // Include legend
            true,                         // Enable tooltips
            false                         // Disable URLs
    );

    // Customize the chart appearance
    PiePlot plot = (PiePlot) chart.getPlot();
  /*  plot.setLabelFont(new Font("SansSerif", Font.BOLD, 12));
    plot.setLabelBackgroundPaint(Color.WHITE);
    plot.setLabelOutlinePaint(Color.BLACK);
    plot.setLabelShadowPaint(null);
    plot.setSimpleLabels(true); // Simplified labels      */

    // Assign colors based on reservation status
    plot.setSectionPaint("Pending", Color.ORANGE);
    plot.setSectionPaint("Approved", Color.GREEN);
    plot.setSectionPaint("Cancelled", Color.RED);  

    // Create a ChartPanel to display the chart
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setBounds(10, 10, 240, 240);
    
    // Add the chartPanelContainer to jPanel2
    jPanel4.removeAll(); // Clear previous chart to avoid overlap
    jPanel4.setLayout(null);
    jPanel4.add(chartPanel);

    jPanel4.revalidate(); // Refresh panel
    jPanel4.repaint();    // Redraw panel
}
    
    private void displayFineCollectionStatus() {
    // Create the dataset
    DefaultPieDataset dataset = new DefaultPieDataset();

    // Database connection and query to fetch fine counts by status
    Connection conn = DatabaseConnection.getInstance().getConnection();
    if (conn != null) {
        String query = "SELECT status, COUNT(*) AS count FROM Fine GROUP BY status";

        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String status = rs.getString("status");
                int count = rs.getInt("count");
                dataset.setValue(status, count);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Error fetching fine data: " + e.getMessage(), 
                "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Create the Pie Chart using JFreeChart
    JFreeChart chart = ChartFactory.createPieChart(
            "Fine Collection Status",  // Chart title
            dataset,                    // Dataset
            true,                        // Include legend
            true,                        // Enable tooltips
            false                        // Disable URLs
    );

    // Customize the chart appearance
    PiePlot plot = (PiePlot) chart.getPlot();
    plot.setLabelFont(new Font("SansSerif", Font.BOLD, 12));
    plot.setLabelBackgroundPaint(Color.WHITE);
    plot.setLabelOutlinePaint(Color.BLACK);
    plot.setLabelShadowPaint(null);
    plot.setSimpleLabels(true); // Simplified labels

    // Assign colors based on fine status
    plot.setSectionPaint("Paid", Color.GREEN);
    plot.setSectionPaint("Unpaid", Color.RED);
    plot.setSectionPaint("Waived", Color.ORANGE);

    // Create a ChartPanel to display the chart
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setBounds(10, 10, 240, 240);
    
    // Add the chartPanelContainer to jPanel2
    jPanel3.removeAll(); // Clear previous chart to avoid overlap
    jPanel3.setLayout(null);
    jPanel3.add(chartPanel);

    jPanel3.revalidate(); // Refresh panel
    jPanel3.repaint();    // Redraw panel
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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booksBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logoLBL1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton reportsBTN;
    private javax.swing.JButton reservationsBTN;
    private javax.swing.JButton settlementsBTN;
    private javax.swing.JButton transactionsBTN;
    private javax.swing.JButton userBTN;
    // End of variables declaration//GEN-END:variables
}
