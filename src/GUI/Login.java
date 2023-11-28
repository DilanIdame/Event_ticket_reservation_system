
package GUI;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {


    
    public Login() {
        initComponents();
//        conn= (Connection) DbConnect.connect();
    }
    public String userName = "User";
    public String ukey = "12345";
    public String ucontact= "0702827464";
    public String uemail = "user@gmail.com";
    public int userID = 1;
    
    public String adminName = "admin";
    public String adminkey = "admin1234";
    public String admincontact = "071202020678";
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        loginadminbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adminReg_bttn = new javax.swing.JButton();
        user_reset_bttn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        admin_name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        userReg_bttn = new javax.swing.JButton();
        admin_reset_bttn = new javax.swing.JButton();
        admin_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Event Ticket ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, -1));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Reservation");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 240, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("System");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 470));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "\nLogin Page", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Calisto MT", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Name:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel3.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 180, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 180, -1));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- Login as Administrator -");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, 30));

        loginbtn.setBackground(new java.awt.Color(204, 204, 204));
        loginbtn.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        loginbtn.setText("User Sign In");
        loginbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel3.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 90, -1));

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
        jPanel3.add(loginadminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 70, -1));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Create new account:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        adminReg_bttn.setBackground(new java.awt.Color(204, 204, 204));
        adminReg_bttn.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        adminReg_bttn.setText("Register");
        adminReg_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminReg_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminReg_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminReg_bttnActionPerformed(evt);
            }
        });
        jPanel3.add(adminReg_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 80, -1));

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
        jPanel3.add(user_reset_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 60, -1));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Create new account:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("User Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        admin_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_nameActionPerformed(evt);
            }
        });
        jPanel3.add(admin_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 190, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 490, 10));

        userReg_bttn.setBackground(new java.awt.Color(204, 204, 204));
        userReg_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        userReg_bttn.setText("Register");
        userReg_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userReg_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userReg_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userReg_bttnActionPerformed(evt);
            }
        });
        jPanel3.add(userReg_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 70, -1));

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
        jPanel3.add(admin_reset_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 60, -1));
        jPanel3.add(admin_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 190, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 480, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
         String user_name = uname.getText();
         char[] passkey = password.getPassword();
         String key = new String(passkey);

        if(key.equals("") || user_name.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill user credentials");
            
        }
        else if(user_name.equals(userName)||key.equals(ukey)){
             try {
                 UserProfile user = new UserProfile();
                 user.setVisible(true);
                 this.dispose();
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, e);
             }
        }else{
        JOptionPane.showMessageDialog(this, "Wrong UserName or Password");
        } 
    }//GEN-LAST:event_loginbtnActionPerformed

    private void loginadminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginadminbtnActionPerformed
        // TODO add your handling code here:
        String ad_name = admin_name.getText();
         char[] ad_passkey = admin_password.getPassword();
         String ad_key = new String(ad_passkey);

        if(ad_key.equals("") || ad_name.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill admin credentials");
            
        }
        else if(ad_name.equals(adminName)||ad_key.equals(adminkey)){
            AdminProfile user = new AdminProfile();
            user.setVisible(true);
            this.dispose();
        }else{
        JOptionPane.showMessageDialog(this, "Wrong Administrator Name or Password");
        } 

    }//GEN-LAST:event_loginadminbtnActionPerformed

    private void adminReg_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminReg_bttnActionPerformed
        // TODO add your handling code here:
        AdminReg adminNew = new AdminReg();
        adminNew.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminReg_bttnActionPerformed

    private void user_reset_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_reset_bttnActionPerformed
        // TODO add your handling code here:
        uname.setText("");
        password.setText("");

    }//GEN-LAST:event_user_reset_bttnActionPerformed

    private void admin_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_nameActionPerformed

    private void userReg_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userReg_bttnActionPerformed
        // TODO add your handling code here:
        UserReg userNew = new UserReg();
        userNew.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userReg_bttnActionPerformed

    private void admin_reset_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_reset_bttnActionPerformed
        // TODO add your handling code here:
        admin_name.setText("");
        admin_password.setText("");
    }//GEN-LAST:event_admin_reset_bttnActionPerformed

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
            public void run() {
            new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminReg_bttn;
    private javax.swing.JTextField admin_name;
    private javax.swing.JPasswordField admin_password;
    private javax.swing.JButton admin_reset_bttn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginadminbtn;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField uname;
    private javax.swing.JButton userReg_bttn;
    private javax.swing.JButton user_reset_bttn;
    // End of variables declaration//GEN-END:variables

    
}
