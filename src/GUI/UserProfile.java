
package GUI;

import java.sql.PreparedStatement;
import java.sql.Connection;
import CODE.DbConnect;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserProfile extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public String selectByUser;
    
    
    public UserProfile() throws SQLException {
        initComponents();
        conn = (Connection) DbConnect.connect();
        if (this.conn == null || this.conn.isClosed()) {
        // Re-establish the connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/event_reservation";
            String username = "root";
            String password = "";
            this.conn = DriverManager.getConnection(jdbcUrl, username, password);
            }
    }
    public String eventN;
    public String key;
    public void tabledata(){
        try{
            String sql = "SELECT seat_category, NoOf_seats,seat_price FROM seats WHERE event_ID ";
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void showDetails( String r){
        try{
            
            String sql = "SELECT seat_category, seat_price, NoOf_seats FROM seats WHERE event_ID =? ";
            pst = conn.prepareStatement(sql);
            boolean execute = pst.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        ticket_detail_table = new javax.swing.JTable();
        category_table = new javax.swing.JComboBox<>();
        selecting_seats = new javax.swing.JTextField();
        check_bttn = new javax.swing.JButton();
        book_bttn = new javax.swing.JButton();
        eventCombo = new javax.swing.JComboBox<>();
        search_bttn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        user_Event_Table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        editProfile_bttn = new javax.swing.JMenuItem();
        reservation_bttn = new javax.swing.JMenuItem();
        logout_bttn = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Event  Reservation System");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 540, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, 110));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Find event :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Cinzel Black", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Check Availability Here !");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, 40));

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ticket Prices : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 140, -1));

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Event details :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 163, 710, 10));

        ticket_detail_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Category", " Ticket Price", "No. of seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ticket_detail_table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 450, 70));

        category_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_tableActionPerformed(evt);
            }
        });
        jPanel1.add(category_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 80, -1));

        selecting_seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecting_seatsActionPerformed(evt);
            }
        });
        jPanel1.add(selecting_seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 80, -1));

        check_bttn.setBackground(new java.awt.Color(204, 204, 204));
        check_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        check_bttn.setText("Check");
        check_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        check_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(check_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 60, -1));

        book_bttn.setBackground(new java.awt.Color(204, 204, 204));
        book_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        book_bttn.setText("Book Now");
        book_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        book_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        book_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_bttnActionPerformed(evt);
            }
        });
        jPanel1.add(book_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 80, -1));

        eventCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventComboActionPerformed(evt);
            }
        });
        jPanel1.add(eventCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 340, -1));

        search_bttn.setBackground(new java.awt.Color(204, 204, 204));
        search_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        search_bttn.setText("Search");
        search_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bttnActionPerformed(evt);
            }
        });
        jPanel1.add(search_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 60, -1));

        user_Event_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Event", "Venue", "Time", "About"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(user_Event_Table);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 90));

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Check Seat Availability :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 710, 600));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("My profile");

        editProfile_bttn.setText("Edit  profile info");
        editProfile_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfile_bttnActionPerformed(evt);
            }
        });
        jMenu1.add(editProfile_bttn);

        reservation_bttn.setText("Reservations");
        reservation_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservation_bttnActionPerformed(evt);
            }
        });
        jMenu1.add(reservation_bttn);

        logout_bttn.setText("Logout");
        logout_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_bttnActionPerformed(evt);
            }
        });
        jMenu1.add(logout_bttn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void book_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_bttnActionPerformed
        // TODO add your handling code here:
        Reserve objBooking = new Reserve();
        objBooking.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book_bttnActionPerformed

    private void editProfile_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfile_bttnActionPerformed
        try {
            // TODO add your handling code here:
            UpdateUserInfo user = new UpdateUserInfo();
            user.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UserProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editProfile_bttnActionPerformed

    private void reservation_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservation_bttnActionPerformed
        // TODO add your handling code here:
        UserReservation userRes = new UserReservation();
        userRes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reservation_bttnActionPerformed

    private void logout_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_bttnActionPerformed
        // TODO add your handling code here:
        Login userLogout = new Login();
        userLogout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_bttnActionPerformed

    @SuppressWarnings("unchecked")
    private void eventComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventComboActionPerformed
        // TODO add your handling code here:
            try{
            if (this.conn == null || this.conn.isClosed()) {
        // Re-establish the connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/event_reservation";
            String username = "root";
            String password = "";
            this.conn = DriverManager.getConnection(jdbcUrl, username, password);
            }
        String sql_eventBox = "SELECT event_name FROM event_table";
            PreparedStatement add = conn.prepareStatement(sql_eventBox);
            rs = add.executeQuery();
        
        while(rs.next()){
            selectByUser = rs.getString("event_name");
            eventCombo.addItem(selectByUser);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    }//GEN-LAST:event_eventComboActionPerformed

    private void selecting_seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecting_seatsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_selecting_seatsActionPerformed

    private void category_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_tableActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_category_tableActionPerformed

    private void search_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bttnActionPerformed
        try {
            // TODO add your handling code here:
            showDetails();
            showUserTickets();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_search_bttnActionPerformed
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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new UserProfile().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book_bttn;
    private javax.swing.JComboBox<String> category_table;
    private javax.swing.JButton check_bttn;
    private javax.swing.JMenuItem editProfile_bttn;
    private javax.swing.JComboBox<String> eventCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem logout_bttn;
    private javax.swing.JMenuItem reservation_bttn;
    private javax.swing.JButton search_bttn;
    private javax.swing.JTextField selecting_seats;
    private javax.swing.JTable ticket_detail_table;
    private javax.swing.JTable user_Event_Table;
    // End of variables declaration//GEN-END:variables
private void showDetails() throws SQLException {
        
        try {
            // TODO add your handling code here:
            String sql_A = "SELECT * FROM event_table where event_name=?";
            PreparedStatement add = conn.prepareStatement(sql_A);
            add.setString(1, selectByUser);
            rs = add.executeQuery();
            
            String event = rs.getString("event_Name");
            String venue = rs.getString("venue");
            String time = rs.getString("date");
            String about = rs.getString("about");
            DefaultTableModel tableModel = (DefaultTableModel)user_Event_Table.getModel();
            tableModel.addRow(new Object[]{event,venue, time, about});
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
private void showUserTickets() throws SQLException {
        
        try {
            // TODO add your handling code here:
            String sql_B = "SELECT seat_category, NoOf_seats,seat_price FROM seats where event_name=? JOIN event_table ON seats.event_ID = event_table.event_ID";
            PreparedStatement add = conn.prepareStatement(sql_B);
            add.setString(1, selectByUser);
            rs = add.executeQuery();
            
            String type = rs.getString("seat_category");
            int seats = rs.getInt("NoOf_seats");
            int seat_price = rs.getInt("seat_price");
            DefaultTableModel tableModel = (DefaultTableModel)ticket_detail_table.getModel();
            tableModel.addRow(new Object[]{type, seats, seat_price});
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }


}
