/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;



import user.*;
import main.Login;


public class Reservations extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Reservations() {
        initComponents();
        
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
        logoLBL = new javax.swing.JLabel();
        booksBTN = new javax.swing.JButton();
        transactionsBTN = new javax.swing.JButton();
        userBTN = new javax.swing.JButton();
        settlementsBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        Reserve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCalendarComboBox1 = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        Reserve1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

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

        logoLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/200blackLOGO.png"))); // NOI18N
        jPanel2.add(logoLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

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
        jPanel2.add(logoutBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 170, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 750));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 350, 60));

        Reserve.setBackground(new java.awt.Color(131, 197, 190));
        Reserve.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Reserve.setText("Cancel");
        jPanel1.add(Reserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 150, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Reservation ID", "Book Title", "Borrower", "Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 880, 340));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel2.setText("Title:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 70, 40));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, 40));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 210, 40));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 70, 40));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel4.setText("Status:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 60, 40));
        jPanel1.add(jCalendarComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 210, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel5.setText("Filter:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 60, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Cancelled", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 210, 40));

        jButton3.setBackground(new java.awt.Color(131, 197, 190));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Search");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, 60));

        Reserve1.setBackground(new java.awt.Color(131, 197, 190));
        Reserve1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Reserve1.setText("Reserve");
        jPanel1.add(Reserve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 150, 60));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Cancelled" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 170, 60));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel6.setText("Date:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 60, 40));

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
        Reservations tranFrame = new Reservations();
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

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        Login loginFrame = new Login();
        this.setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed


    
    
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
    private javax.swing.JButton Reserve;
    private javax.swing.JButton Reserve1;
    private javax.swing.JButton booksBTN;
    private javax.swing.JButton jButton3;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel logoLBL;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton reservationsBTN;
    private javax.swing.JButton settlementsBTN;
    private javax.swing.JButton transactionsBTN;
    private javax.swing.JButton userBTN;
    // End of variables declaration//GEN-END:variables
}
