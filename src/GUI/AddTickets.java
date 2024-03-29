/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import CODE.DbConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AddTickets extends javax.swing.JFrame {

    Connection conn = null;
    public String admin_name;
    public AddTickets(String name) throws SQLException {
        initComponents();
            conn= DbConnect.connect();
            Reconnect();
    }
    public AddTickets() throws SQLException {
        initComponents();
            conn= DbConnect.connect();
            Reconnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        new_ticket_details = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addTickets = new javax.swing.JButton();
        clear_bttn1 = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(" Event Management! ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        new_ticket_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Category (Type)", "No. of seats", "Ticket price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(new_ticket_details);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 560, 110));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(Once you added, You can't edit these details.)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 490, 30));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ticket Details :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 30));

        addTickets.setBackground(new java.awt.Color(204, 204, 204));
        addTickets.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        addTickets.setText("Add Tickets");
        addTickets.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTicketsActionPerformed(evt);
            }
        });
        jPanel1.add(addTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 90, 30));

        clear_bttn1.setBackground(new java.awt.Color(204, 204, 204));
        clear_bttn1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        clear_bttn1.setText("Clear");
        clear_bttn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear_bttn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_bttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bttn1ActionPerformed(evt);
            }
        });
        jPanel1.add(clear_bttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 60, 30));

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        back.setText("Back");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTicketsActionPerformed
//        // TODO add your handling code here:
//        String evName = new_event.getText();
//        String evVenue = new_venue.getText();
//        String evDate = new_date.getText();
//        String evAbout = new_about.getText();
//        String adName = getAdminName();
//        //table.getTable();
//
//        try {
//            String sql = "INSERT INTO event_table(event_Name, venue, date, about) VALUES (?, ?, ?, ?) WHERE admin_name";
//            PreparedStatement add = conn.prepareStatement(sql);
//
//            // Set values using prepared statement parameters
//            add.setString(1, evName);
//            add.setString(2, evVenue);
//            add.setString(3, evDate);
//            add.setString(4, evAbout);
//            add.setString(5,adName);
//
//            // Execute the update
//            int rowsAffected = add.executeUpdate();
//            if (rowsAffected > 0) {
//                JOptionPane.showMessageDialog(null, "Event Added!");
//                new_event.setText("");
//                new_venue.setText("");
//                new_date.setText("");
//                new_about.setText("");
//                removeAllRows(new_ticket_details);
//            } else {
//                JOptionPane.showMessageDialog(null, " Failed!\n Try Again!");}
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error occurs at Adding event : "+e);
//        }
    }//GEN-LAST:event_addTicketsActionPerformed

    private void clear_bttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bttn1ActionPerformed
        // TODO add your handling code here:
        removeAllRows(new_ticket_details);

    }//GEN-LAST:event_clear_bttn1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
            // TODO add your handling code here:
            AdminProfile adminNew = new AdminProfile();
            adminNew.setVisible(true);
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error occurs at Adding event : "+e);
        }
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(AddTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new AddTickets().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error occurs at Adding event : "+ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTickets;
    private javax.swing.JButton back;
    private javax.swing.JButton clear_bttn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable new_ticket_details;
    // End of variables declaration//GEN-END:variables

public static void removeAllRows(JTable table) {

    DefaultTableModel model = (DefaultTableModel) table.getModel();

    for (int row = 0; row < table.getRowCount(); row++) {
        model.removeRow(row);
    }
}
private void Reconnect() throws SQLException{
    if (this.conn == null || this.conn.isClosed()) {
        try {
            // Re-establish the connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/event_reservation";
            String username = "root";
            String db_password = null;
            this.conn = DriverManager.getConnection(jdbcUrl, username, db_password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error occurs When reconnecting Database :"+e);
        }
    }
}
}
