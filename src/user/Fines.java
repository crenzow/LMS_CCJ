/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;



import main.Login;


public class Fines extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Fines() {
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
        finesBTN = new javax.swing.JButton();
        logoLBL = new javax.swing.JLabel();
        borrowingsBTN = new javax.swing.JButton();
        reservationBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        libraryBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void finesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finesBTNActionPerformed
       
    }//GEN-LAST:event_finesBTNActionPerformed

    private void borrowingsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowingsBTNActionPerformed
        Borrowings borrFrame = new Borrowings();
        this.setVisible(false);
        borrFrame.setVisible(true);
    }//GEN-LAST:event_borrowingsBTNActionPerformed

    private void reservationBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationBTNActionPerformed
        Reservations resFrame = new Reservations();
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
        Library libFrame = new Library();
        this.setVisible(false);
        libFrame.setVisible(true);
    }//GEN-LAST:event_libraryBTNActionPerformed


    
    
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
    private javax.swing.JButton borrowingsBTN;
    private javax.swing.JButton finesBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton libraryBTN;
    private javax.swing.JLabel logoLBL;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton reservationBTN;
    // End of variables declaration//GEN-END:variables
}
