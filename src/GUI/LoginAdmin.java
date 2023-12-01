/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import CODE.DbConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author User
 */
public class LoginAdmin extends javax.swing.JFrame {
    Connection conn = null;
    /**
     * Creates new form LoginAdmin
     * @throws java.sql.SQLException
     */
    public LoginAdmin() throws SQLException {
        initComponents();
        conn= DbConnect.connect();
       // If connection lost with DbConnect 
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        admin_name = new javax.swing.JTextField();
        admin_password = new javax.swing.JPasswordField();
        loginadminbtn = new javax.swing.JButton();
        admin_reset_bttn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        back_To_UserLgn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        adminReg_bttn1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Event Ticket ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, -1));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Reservation");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("System");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 350));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, 30));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        admin_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_nameActionPerformed(evt);
            }
        });
        jPanel1.add(admin_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 210, 30));
        jPanel1.add(admin_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 142, 210, 30));

        loginadminbtn.setBackground(new java.awt.Color(204, 204, 204));
        loginadminbtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        loginadminbtn.setText("Sign In");
        loginadminbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginadminbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginadminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginadminbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginadminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 70, 30));

        admin_reset_bttn.setBackground(new java.awt.Color(204, 204, 204));
        admin_reset_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        admin_reset_bttn.setText("Reset");
        admin_reset_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_reset_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_reset_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_reset_bttnActionPerformed(evt);
            }
        });
        jPanel1.add(admin_reset_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 60, 30));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Create new account:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 30));

        back_To_UserLgn.setBackground(new java.awt.Color(204, 204, 204));
        back_To_UserLgn.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        back_To_UserLgn.setText("Back");
        back_To_UserLgn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_To_UserLgn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_To_UserLgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_To_UserLgnActionPerformed(evt);
            }
        });
        jPanel1.add(back_To_UserLgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 296, 80, 30));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login as  a User ?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 30));

        adminReg_bttn1.setBackground(new java.awt.Color(204, 204, 204));
        adminReg_bttn1.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        adminReg_bttn1.setText("Register");
        adminReg_bttn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminReg_bttn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminReg_bttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminReg_bttn1ActionPerformed(evt);
            }
        });
        jPanel1.add(adminReg_bttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 246, 80, 30));

        jLabel10.setBackground(new java.awt.Color(0, 102, 102));
        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 102));
        jLabel10.setText("- Admin Login -");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admin_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_nameActionPerformed

    private void loginadminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginadminbtnActionPerformed
        // TODO add your handling code here:
        String ad_name = admin_name.getText();
        String ad_password = String.valueOf(admin_password.getPassword());

        if(ad_password.equals("") || ad_name.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill admin credentials");

        }
        else if(checkAdminDetails(ad_name,ad_password)){
            AdminProfile user = new AdminProfile();
            user.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Wrong Administrator Name or Password");
        }
    }//GEN-LAST:event_loginadminbtnActionPerformed

    private void admin_reset_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_reset_bttnActionPerformed
        // TODO add your handling code here:
        admin_name.setText("");
        admin_password.setText("");
    }//GEN-LAST:event_admin_reset_bttnActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void back_To_UserLgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_To_UserLgnActionPerformed
        try {
            // TODO add your handling code here:
            Login backLogin = new Login();
            backLogin.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error occurs at userLogin : "+e);
        }
    }//GEN-LAST:event_back_To_UserLgnActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void adminReg_bttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminReg_bttn1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            AdminReg getReg = new AdminReg();
            getReg.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error occurs at admin registration  : "+e);
        }
    }//GEN-LAST:event_adminReg_bttn1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new LoginAdmin().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Error occurs at LoginAdmin main : "+ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminReg_bttn1;
    private javax.swing.JTextField admin_name;
    private javax.swing.JPasswordField admin_password;
    private javax.swing.JButton admin_reset_bttn;
    private javax.swing.JButton back_To_UserLgn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginadminbtn;
    // End of variables declaration//GEN-END:variables
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
private boolean checkAdminDetails(String name, String password){
   String sql = "SELECT  admin_Name, admin_password FROM admin WHERE admin_Name=? And admin_password=?";
        try{
            PreparedStatement add = conn.prepareStatement(sql);
            add.setString(1, name);
            add.setString(2, password);
            ResultSet rst = add.executeQuery();
            return rst.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error occurs at checking details : "+e);
        }
        return false;
}
}
