
package GUI;

import CODE.DbConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    Connection conn = null;
    public String user_name;
    public String user_password;
    

    
    public Login() throws SQLException {
        initComponents();
        conn= DbConnect.connect();
       // If connection lost with DbConnect 
        Reconnect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        user_reset_bttn = new javax.swing.JButton();
        go_To_AdminLogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        userReg_bttn1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Reservation");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 210, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("System");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, -1));

        jLabel15.setBackground(new java.awt.Color(0, 102, 102));
        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Event Ticket ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 370));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("User Name:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 100, -1));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 200, -1));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 200, -1));

        loginbtn.setBackground(new java.awt.Color(204, 204, 204));
        loginbtn.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        loginbtn.setText(" Sign In");
        loginbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 70, 30));

        user_reset_bttn.setBackground(new java.awt.Color(204, 204, 204));
        user_reset_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        user_reset_bttn.setText("Reset");
        user_reset_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        user_reset_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_reset_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_reset_bttnActionPerformed(evt);
            }
        });
        jPanel1.add(user_reset_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 70, 30));

        go_To_AdminLogin.setBackground(new java.awt.Color(204, 204, 204));
        go_To_AdminLogin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        go_To_AdminLogin.setText("Admin");
        go_To_AdminLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        go_To_AdminLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        go_To_AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_To_AdminLoginActionPerformed(evt);
            }
        });
        jPanel1.add(go_To_AdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 294, 70, 30));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Login as a Admin ?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Create new account:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        userReg_bttn1.setBackground(new java.awt.Color(204, 204, 204));
        userReg_bttn1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        userReg_bttn1.setText("Register");
        userReg_bttn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userReg_bttn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userReg_bttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userReg_bttn1ActionPerformed(evt);
            }
        });
        jPanel1.add(userReg_bttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 244, 70, 30));

        jLabel14.setBackground(new java.awt.Color(0, 102, 102));
        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Event Ticket ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("- User Login -");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
         user_name = uname.getText();
         user_password = String.valueOf(password.getPassword());

        if(user_password.equals("") || user_name.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill user credentials");
            
        }
        else if(checkUserDetails(user_name, user_password)){
             try {
                 //setName(user_name);
                 UserProfile user = new UserProfile();
                 user.setVisible(true);
                 this.dispose();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(this, "Error occurs at login to UserProfile : "+e);
             }
             }
        else{
        JOptionPane.showMessageDialog(this, "Wrong UserName or Password");
        } 
    }//GEN-LAST:event_loginbtnActionPerformed

    private void user_reset_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_reset_bttnActionPerformed
        // TODO add your handling code here:
        uname.setText("");
        password.setText("");

    }//GEN-LAST:event_user_reset_bttnActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void go_To_AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_To_AdminLoginActionPerformed
        try {
            // TODO add your handling code here:
            LoginAdmin userNew = new LoginAdmin();
            userNew.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error occurs at AdminLogin : "+e);
        }
    }//GEN-LAST:event_go_To_AdminLoginActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void userReg_bttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userReg_bttn1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            UserReg user_reg = new UserReg();
            user_reg.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error occurs at userRegistration : "+e);
        }
    }//GEN-LAST:event_userReg_bttn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton go_To_AdminLogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField uname;
    private javax.swing.JButton userReg_bttn1;
    private javax.swing.JButton user_reset_bttn;
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
private boolean checkUserDetails(String name,String password){
    String sql = "SELECT  user_name, user_password FROM user WHERE user_name=? And user_password=?";
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
