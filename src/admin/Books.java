/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;



import dbConnection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import user.*;
import main.Login;


public class Books extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Books() {
        initComponents();
        loadBooksData();
        
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
        jTextField9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        reservationsBTN = new javax.swing.JButton();
        logoLBL = new javax.swing.JLabel();
        booksBTN = new javax.swing.JButton();
        transactionsBTN = new javax.swing.JButton();
        userBTN = new javax.swing.JButton();
        settlementsBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTBL = new javax.swing.JTable();
        searchTXT = new javax.swing.JTextField();
        titleTXT = new javax.swing.JTextField();
        authorTXT = new javax.swing.JTextField();
        isbnTXT = new javax.swing.JTextField();
        genreTXT = new javax.swing.JTextField();
        publisherTXT = new javax.swing.JTextField();
        pyearTXT = new javax.swing.JTextField();
        quantityTXT = new javax.swing.JTextField();
        locationTXT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        clearBTN = new javax.swing.JButton();
        genreCBX = new javax.swing.JComboBox<>();
        stayeaseLBL5 = new javax.swing.JLabel();
        stayeaseLBL6 = new javax.swing.JLabel();
        stayeaseLBL1 = new javax.swing.JLabel();
        stayeaseLBL7 = new javax.swing.JLabel();

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

        booksTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book No.", "Title", "Author", "ISBN", "Genre", "Publisher", "Publication Year", "Quantity", "Location"
            }
        ));
        jScrollPane1.setViewportView(booksTBL);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 372, 900, 360));

        searchTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTXTActionPerformed(evt);
            }
        });
        jPanel1.add(searchTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 220, 40));
        jPanel1.add(titleTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 210, 40));
        jPanel1.add(authorTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, 40));
        jPanel1.add(isbnTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 210, 40));
        jPanel1.add(genreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 210, 40));
        jPanel1.add(publisherTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 210, 40));
        jPanel1.add(pyearTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 210, 40));
        jPanel1.add(quantityTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 210, 40));
        jPanel1.add(locationTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 210, 40));

        jButton1.setBackground(new java.awt.Color(131, 197, 190));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 90, 40));

        addBTN.setBackground(new java.awt.Color(131, 197, 190));
        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });
        jPanel1.add(addBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 120, 40));

        deleteBTN.setBackground(new java.awt.Color(131, 197, 190));
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 120, 40));

        updateBTN.setBackground(new java.awt.Color(131, 197, 190));
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });
        jPanel1.add(updateBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 120, 40));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel1.setText(" Location:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 100, 40));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel2.setText("Title:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, 40));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel3.setText("Author:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, 40));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel4.setText("ISBN:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 90, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel5.setText("Genre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, 40));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel6.setText("Publisher:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 100, 40));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel7.setText("Publication Year:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 160, 40));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel8.setText("Quantity Available:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 180, 40));

        clearBTN.setBackground(new java.awt.Color(131, 197, 190));
        clearBTN.setText("Clear");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        jPanel1.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 120, 40));

        genreCBX.setBackground(new java.awt.Color(131, 197, 190));
        genreCBX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genreCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Genres", "Art", "Business", "Cooking", "Engineering", "Fantasy", "Fiction", "History", "Mathematics", "Mystery", "Mythology", "Non-Fiction", "Philosophy", "Politics", "Psychology", "Romance", "Science", "Science Fiction", "Sports", "Technology", "Travel" }));
        genreCBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreCBXActionPerformed(evt);
            }
        });
        jPanel1.add(genreCBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 40));

        stayeaseLBL5.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL5.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL5.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL5.setText("P");
        jPanel1.add(stayeaseLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 70));

        stayeaseLBL6.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL6.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL6.setText("AGE");
        jPanel1.add(stayeaseLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, 40));

        stayeaseLBL1.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL1.setFont(new java.awt.Font("Serif", 1, 70)); // NOI18N
        stayeaseLBL1.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL1.setText("H");
        jPanel1.add(stayeaseLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 60, -1));

        stayeaseLBL7.setBackground(new java.awt.Color(0, 109, 119));
        stayeaseLBL7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        stayeaseLBL7.setForeground(new java.awt.Color(0, 109, 119));
        stayeaseLBL7.setText("UB");
        jPanel1.add(stayeaseLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 60, 60));

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

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        Login loginFrame = new Login();
        this.setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void searchTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTXTActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
                                       
    // Get values from the text fields
    String title = titleTXT.getText().trim();  // Add title field
    String author = authorTXT.getText().trim();
    String isbn = isbnTXT.getText().trim();
    String genre = genreTXT.getText().trim();
    String publisher = publisherTXT.getText().trim();
    String publicationYear = pyearTXT.getText().trim();
    String location = locationTXT.getText().trim();
    String quantity = quantityTXT.getText().trim();

    // Validate that all fields have been filled
    if (title.isEmpty() || author.isEmpty() || isbn.isEmpty() || genre.isEmpty() || 
        publisher.isEmpty() || publicationYear.isEmpty() || location.isEmpty() || quantity.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
        return; // Exit if any field is empty
    }

    // SQL query to insert a new book into the database
    String sql = "INSERT INTO book (title, author, isbn, genre, publisher, publicationYear, location, quantityAvailable) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        // Set parameters for the PreparedStatement
        ps.setString(1, title);  // Set the title
        ps.setString(2, author);
        ps.setString(3, isbn);
        ps.setString(4, genre);
        ps.setString(5, publisher);
        ps.setInt(6, Integer.parseInt(publicationYear)); // Assuming publication year is an integer
        ps.setString(7, location);
        ps.setInt(8, Integer.parseInt(quantity)); // Assuming quantity is an integer

        // Execute the query
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Book added successfully!");

            // Clear the text fields after successful insertion
            titleTXT.setText("");
            authorTXT.setText("");
            isbnTXT.setText("");
            genreTXT.setText("");
            publisherTXT.setText("");
            pyearTXT.setText("");
            locationTXT.setText("");
            quantityTXT.setText("");

            // Refresh the table to reflect the new data
            loadBooksData();  // Call the method that reloads the table data
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add the book.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter valid numeric values for Publication Year and Quantity.");
    }
    }//GEN-LAST:event_addBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
                                       
    // Get the bookID from the searchTXT field
    String bookIDStr = searchTXT.getText().trim();
    
    // Validate that bookID is provided and is numeric
    if (bookIDStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a bookID in the search field.");
        return;
    }

    int bookID;
    try {
        bookID = Integer.parseInt(bookIDStr); // Convert to integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid bookID. Please enter a valid numeric bookID.");
        return;
    }

    // Confirm deletion
    int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the book with ID: " + bookID + "?",
                                                     "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirmation == JOptionPane.NO_OPTION) {
        return; // Exit if the user cancels the deletion
    }

    // SQL query to delete the book from the database
    String sql = "DELETE FROM book WHERE bookID = ?";

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        // Set the bookID for the DELETE query
        ps.setInt(1, bookID);

        // Execute the delete query
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Book deleted successfully!");

            // Refresh the table to reflect the updated data
            loadBooksData();
            
            // Clear searchTXT field after deletion
            searchTXT.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No book found with the given bookID.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
    // Get the bookID from the searchTXT field
    String bookIDStr = searchTXT.getText().trim();
    
    // Validate that bookID is provided and is numeric
    if (bookIDStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a bookID in the search field.");
        return;
    }

    int bookID;
    try {
        bookID = Integer.parseInt(bookIDStr); // Convert to integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid bookID. Please enter a valid numeric bookID.");
        return;
    }

    // SQL query to fetch the current book details from the database using bookID
    String selectSql = "SELECT title, author, isbn, genre, publisher, publicationYear, location, quantityAvailable FROM book WHERE bookID = ?";

    try (PreparedStatement psSelect = DatabaseConnection.getInstance().getConnection().prepareStatement(selectSql)) {
        // Set the bookID for the SELECT query
        psSelect.setInt(1, bookID);

        ResultSet rs = psSelect.executeQuery();

        if (rs.next()) {
            // Pre-fill the fields with current data
            titleTXT.setText(rs.getString("title"));
            authorTXT.setText(rs.getString("author"));
            isbnTXT.setText(rs.getString("isbn"));
            genreTXT.setText(rs.getString("genre"));
            publisherTXT.setText(rs.getString("publisher"));
            pyearTXT.setText(rs.getString("publicationYear"));
            locationTXT.setText(rs.getString("location"));
            quantityTXT.setText(rs.getString("quantityAvailable"));
        } else {
            JOptionPane.showMessageDialog(null, "No book found with the given bookID.");
            return;  // Exit if no matching bookID is found
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error fetching book details: " + e.getMessage());
        e.printStackTrace();
        return;  // Exit in case of an error
    }

    // Confirm update
    int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the book details?", 
                                                     "Confirm Update", JOptionPane.YES_NO_OPTION);
    if (confirmation == JOptionPane.NO_OPTION) {
        return; // Exit if the user cancels the update
    }

    // Now, get the updated values from the fields
    String title = titleTXT.getText().trim();
    String author = authorTXT.getText().trim();
    String isbn = isbnTXT.getText().trim();
    String genre = genreTXT.getText().trim();
    String publisher = publisherTXT.getText().trim();
    String publicationYear = pyearTXT.getText().trim();
    String location = locationTXT.getText().trim();
    String quantity = quantityTXT.getText().trim();

    // Validate that all fields have been filled
    if (title.isEmpty() || author.isEmpty() || isbn.isEmpty() || genre.isEmpty() || 
        publisher.isEmpty() || publicationYear.isEmpty() || location.isEmpty() || quantity.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
        return; // Exit if any field is empty
    }

    // Validate numeric fields (publication year and quantity)
    try {
        Integer.parseInt(publicationYear);  // Ensure the publication year is an integer
        Integer.parseInt(quantity);  // Ensure the quantity is an integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter valid numeric values for Publication Year and Quantity.");
        return;  // Exit if the numeric fields are not valid
    }

    // SQL query to update the book details in the database
    String updateSql = "UPDATE book SET title = ?, author = ?, isbn = ?, genre = ?, publisher = ?, publicationYear = ?, location = ?, quantityAvailable = ? WHERE bookID = ?";

    try (PreparedStatement psUpdate = DatabaseConnection.getInstance().getConnection().prepareStatement(updateSql)) {
        // Set the updated values for the UPDATE query
        psUpdate.setString(1, title);
        psUpdate.setString(2, author);
        psUpdate.setString(3, isbn);
        psUpdate.setString(4, genre);
        psUpdate.setString(5, publisher);
        psUpdate.setInt(6, Integer.parseInt(publicationYear));
        psUpdate.setString(7, location);
        psUpdate.setInt(8, Integer.parseInt(quantity));
        psUpdate.setInt(9, bookID);  // Set bookID to ensure the correct book is updated

        // Debug: Print the query and values
        System.out.println("Executing update query: " + updateSql);
        System.out.println("With values: " + title + ", " + author + ", " + isbn + ", " + genre + ", " + publisher + ", " + publicationYear + ", " + location + ", " + quantity + ", " + bookID);

        // Execute the update query
        int rowsAffected = psUpdate.executeUpdate();
        
        // Debug: Check how many rows were affected
        System.out.println("Rows affected: " + rowsAffected);

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Book updated successfully!");

            // Refresh the table to reflect the updated data
            loadBooksData();

            // Clear the searchTXT and fields after update
            searchTXT.setText("");
            titleTXT.setText("");
            authorTXT.setText("");
            isbnTXT.setText("");
            genreTXT.setText("");
            publisherTXT.setText("");
            pyearTXT.setText("");
            locationTXT.setText("");
            quantityTXT.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update the book.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error updating book details: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        searchTXT.setText("");
        titleTXT.setText("");
        authorTXT.setText("");
        isbnTXT.setText("");
        genreTXT.setText("");
        publisherTXT.setText("");
        pyearTXT.setText("");
        locationTXT.setText("");
        quantityTXT.setText("");
    }//GEN-LAST:event_clearBTNActionPerformed

    private void genreCBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreCBXActionPerformed
        // TODO add your handling code here:
        filterBooksByGenre();
    }//GEN-LAST:event_genreCBXActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                    
    // Get the search term from the search text field (bookID)
    String searchTerm = searchTXT.getText().trim();

    // Check if the input is empty or not a valid integer (bookID is typically an integer)
    if (searchTerm.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a valid book ID.");
        return; // Do not continue if the search field is empty
    }

    try {
        // Try to parse the search term into an integer (bookID)
        int bookID = Integer.parseInt(searchTerm);

        // SQL query to search by bookID
        String sql = "SELECT bookID, title, author, isbn, genre, publisher, publicationYear, quantityAvailable, location " +
                     "FROM book WHERE bookID = ?";

        try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
            ps.setInt(1, bookID); // Set the bookID as the parameter for the query

            try (ResultSet rs = ps.executeQuery()) {
                // If no results are found
                if (!rs.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "No book found with that ID.");
                    return; // If no results, exit the method
                }

                // Process the first result (assuming the bookID is unique)
                if (rs.next()) {
                    // Populate the fields with the data from the database
                    titleTXT.setText(rs.getString("title"));
                    authorTXT.setText(rs.getString("author"));
                    isbnTXT.setText(rs.getString("isbn"));
                    genreTXT.setText(rs.getString("genre"));
                    publisherTXT.setText(rs.getString("publisher"));
                    pyearTXT.setText(rs.getString("publicationYear"));
                    locationTXT.setText(rs.getString("location"));
                    quantityTXT.setText(rs.getString("quantityAvailable"));
                }

                System.out.println("Book found and fields populated."); // Debugging log
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid numeric book ID.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    public void loadBooksData() {
    String sql = "SELECT bookID, title, author, isbn, genre, publisher, publicationYear, quantityAvailable, location FROM book";

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        DefaultTableModel model = (DefaultTableModel) booksTBL.getModel();
        model.setRowCount(0); // Clear existing data

        while (rs.next()) {
            Object[] row = {
                rs.getInt("bookID"),
                rs.getString("title"),
                rs.getString("author"),
                rs.getString("isbn"),
                rs.getString("genre"),
                rs.getString("publisher"),
                rs.getInt("publicationYear"),
                rs.getInt("quantityAvailable"),
                rs.getString("location")
            };
            model.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    private void filterBooksByGenre() {
    String selectedGenre = genreCBX.getSelectedItem().toString();
    System.out.println("Selected Genre: " + selectedGenre); // Debugging log

    String sql = "SELECT bookID, title, author, isbn, genre, publisher, publicationYear, quantityAvailable, location FROM book";

    // Apply filtering only if a specific genre is selected
    if (!selectedGenre.equals("All Genres")) {
        sql += " WHERE genre = ?";
    }

    try (PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {

        if (!selectedGenre.equals("All Genres")) {
            ps.setString(1, selectedGenre);
        }

        try (ResultSet rs = ps.executeQuery()) {
            DefaultTableModel model = (DefaultTableModel) booksTBL.getModel();
            model.setRowCount(0); // Clear existing data

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("bookID"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("isbn"),
                    rs.getString("genre"),
                    rs.getString("publisher"),
                    rs.getInt("publicationYear"),
                    rs.getInt("quantityAvailable"),
                    rs.getString("location")
                };
                model.addRow(row);
            }

            System.out.println("Rows added: " + model.getRowCount()); // Debugging log

        }
    } catch (SQLException e) {
        e.printStackTrace();
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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JTextField authorTXT;
    private javax.swing.JButton booksBTN;
    private javax.swing.JTable booksTBL;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> genreCBX;
    private javax.swing.JTextField genreTXT;
    private javax.swing.JTextField isbnTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField locationTXT;
    private javax.swing.JLabel logoLBL;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JTextField publisherTXT;
    private javax.swing.JTextField pyearTXT;
    private javax.swing.JTextField quantityTXT;
    private javax.swing.JButton reservationsBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JButton settlementsBTN;
    private javax.swing.JLabel stayeaseLBL1;
    private javax.swing.JLabel stayeaseLBL5;
    private javax.swing.JLabel stayeaseLBL6;
    private javax.swing.JLabel stayeaseLBL7;
    private javax.swing.JTextField titleTXT;
    private javax.swing.JButton transactionsBTN;
    private javax.swing.JButton updateBTN;
    private javax.swing.JButton userBTN;
    // End of variables declaration//GEN-END:variables
}
