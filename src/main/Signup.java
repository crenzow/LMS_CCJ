/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import dbConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stayeaseLBL3 = new javax.swing.JLabel();
        stayeaseLBL2 = new javax.swing.JLabel();
        stayeaseLBL = new javax.swing.JLabel();
        stayeaseLBL4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        singupLBL = new javax.swing.JLabel();
        passwordLBL = new javax.swing.JLabel();
        fnameLBL = new javax.swing.JLabel();
        emailLBL = new javax.swing.JLabel();
        phonenumberLBL = new javax.swing.JLabel();
        emailTXT = new javax.swing.JTextField();
        fnameTXT = new javax.swing.JTextField();
        phonenumberTXT = new javax.swing.JTextField();
        passwordTXT = new javax.swing.JPasswordField();
        singupBTN = new javax.swing.JButton();
        usernameLBL = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JTextField();
        stayeaseLBL6 = new javax.swing.JLabel();
        stayeaseLBL7 = new javax.swing.JLabel();
        stayeaseLBL1 = new javax.swing.JLabel();
        stayeaseLBL5 = new javax.swing.JLabel();
        backBTN = new javax.swing.JLabel();

        stayeaseLBL3.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL3.setFont(new java.awt.Font("Serif", 3, 70)); // NOI18N
        stayeaseLBL3.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL3.setText("S");

        stayeaseLBL2.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL2.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL2.setText("TAY ");

        stayeaseLBL.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL.setFont(new java.awt.Font("Serif", 3, 70)); // NOI18N
        stayeaseLBL.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL.setText("E");

        stayeaseLBL4.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL4.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL4.setText("ASE ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 600));

        jPanel1.setBackground(new java.awt.Color(0, 109, 119));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(310, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(310, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        singupLBL.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        singupLBL.setText("SIGN UP");
        jPanel2.add(singupLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 100, -1));

        passwordLBL.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        passwordLBL.setText("PASSWORD:");
        jPanel2.add(passwordLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        fnameLBL.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        fnameLBL.setText("FULL NAME:");
        jPanel2.add(fnameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        emailLBL.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        emailLBL.setText("EMAIL:");
        jPanel2.add(emailLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        phonenumberLBL.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        phonenumberLBL.setText("PHONE NUMBER:");
        jPanel2.add(phonenumberLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        jPanel2.add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 240, 30));

        fnameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTXTActionPerformed(evt);
            }
        });
        jPanel2.add(fnameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 240, 30));
        jPanel2.add(phonenumberTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 240, 30));

        passwordTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTXTActionPerformed(evt);
            }
        });
        jPanel2.add(passwordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 240, 30));

        singupBTN.setBackground(new java.awt.Color(0, 109, 119));
        singupBTN.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        singupBTN.setForeground(new java.awt.Color(245, 245, 220));
        singupBTN.setText("SIGN UP");
        singupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singupBTNActionPerformed(evt);
            }
        });
        jPanel2.add(singupBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        usernameLBL.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        usernameLBL.setText("USERNAME:");
        jPanel2.add(usernameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        usernameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTXTActionPerformed(evt);
            }
        });
        jPanel2.add(usernameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 240, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 0, 375, 600));

        stayeaseLBL6.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL6.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL6.setText("AGE");
        jPanel1.add(stayeaseLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 90, 40));

        stayeaseLBL7.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL7.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL7.setText("UB");
        jPanel1.add(stayeaseLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 60, 60));

        stayeaseLBL1.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL1.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL1.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL1.setText("H");
        jPanel1.add(stayeaseLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 60, -1));

        stayeaseLBL5.setBackground(new java.awt.Color(245, 245, 220));
        stayeaseLBL5.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL5.setForeground(new java.awt.Color(245, 245, 220));
        stayeaseLBL5.setText("P");
        jPanel1.add(stayeaseLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 60, 70));

        backBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTNMouseClicked(evt);
            }
        });
        jPanel1.add(backBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTXTActionPerformed

    private void singupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singupBTNActionPerformed
        // TODO add your handling code here:
        // Get values from text fields
    String fullName = fnameTXT.getText();
    String phoneNumber = phonenumberTXT.getText();
    String email = emailTXT.getText();
    String username = usernameTXT.getText();
    String password = new String(passwordTXT.getPassword()); // Convert char array to String

    // Database connection
    Connection conn = DatabaseConnection.getInstance().getConnection();
    
    if (conn != null) {
        try {
            // Insert query
            String sql = "INSERT INTO user (fullName, phoneNumber, email, username, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            // Set values
            pstmt.setString(1, fullName);
            pstmt.setString(2, phoneNumber);
            pstmt.setString(3, email);
            pstmt.setString(4, username);
            pstmt.setString(5, password);
            
            // Execute the query
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                
                JOptionPane.showMessageDialog(this, "Signup Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                new Login().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Signup Failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_singupBTNActionPerformed

    private void fnameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTXTActionPerformed

    private void usernameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTXTActionPerformed

    private void backBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTNMouseClicked
        Login loginFrame = new Login();
        this.setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_backBTNMouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBTN;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JLabel fnameLBL;
    private javax.swing.JTextField fnameTXT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JLabel phonenumberLBL;
    private javax.swing.JTextField phonenumberTXT;
    private javax.swing.JButton singupBTN;
    private javax.swing.JLabel singupLBL;
    private javax.swing.JLabel stayeaseLBL;
    private javax.swing.JLabel stayeaseLBL1;
    private javax.swing.JLabel stayeaseLBL2;
    private javax.swing.JLabel stayeaseLBL3;
    private javax.swing.JLabel stayeaseLBL4;
    private javax.swing.JLabel stayeaseLBL5;
    private javax.swing.JLabel stayeaseLBL6;
    private javax.swing.JLabel stayeaseLBL7;
    private javax.swing.JLabel usernameLBL;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}
