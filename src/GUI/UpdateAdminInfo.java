package GUI;

import CODE.DbConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class UpdateAdminInfo extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    public UpdateAdminInfo() {
        initComponents();
        conn= DbConnect.connect();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        newPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        oldPassword = new javax.swing.JPasswordField();
        newNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        updateinfo_bttn = new javax.swing.JButton();
        clear_bttn = new javax.swing.JButton();
        back_bttn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oldname = new javax.swing.JTextField();
        newname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(" Update Details ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " For Administrators ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact : ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 220, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Old Password :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));
        jPanel3.add(oldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 220, -1));

        newNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNumberActionPerformed(evt);
            }
        });
        jPanel3.add(newNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 220, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        updateinfo_bttn.setBackground(new java.awt.Color(204, 204, 204));
        updateinfo_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        updateinfo_bttn.setText("Update");
        updateinfo_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateinfo_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateinfo_bttnActionPerformed(evt);
            }
        });
        jPanel3.add(updateinfo_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 70, -1));

        clear_bttn.setBackground(new java.awt.Color(204, 204, 204));
        clear_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        clear_bttn.setText("Clear");
        clear_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bttnActionPerformed(evt);
            }
        });
        jPanel3.add(clear_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 60, -1));

        back_bttn.setBackground(new java.awt.Color(204, 204, 204));
        back_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        back_bttn.setText("Back");
        back_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_bttnActionPerformed(evt);
            }
        });
        jPanel3.add(back_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 60, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Admin Name :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Admin Name :");
        jLabel2.setToolTipText("");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 20));
        jPanel3.add(oldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 220, -1));

        newname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newnameActionPerformed(evt);
            }
        });
        jPanel3.add(newname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 220, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 480, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordActionPerformed

    private void newNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNumberActionPerformed

    private void updateinfo_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateinfo_bttnActionPerformed
        // TODO add your handling code here:
        String oldn = oldname.getText();
        String newn = newname.getText();
        String oldp = String.valueOf(oldPassword.getPassword());
        String newp = String.valueOf(newPassword.getPassword());
        String nContact = newNumber.getText();
       
        
        if(oldn.isEmpty()|| newn.isEmpty()||oldp.isEmpty()||newp.isEmpty()|| nContact.isEmpty()){
            JOptionPane.showMessageDialog(this, " Please Enter Details");}
        else if(newp.length() < 8||newp.equals(oldp)){
            JOptionPane.showMessageDialog(null, "Check the new Password again!");
        }else if(oldn.equals(newn)){
        JOptionPane.showMessageDialog(null, "Don't use old name.");}
        else if(nContact.length()!= 10){
        JOptionPane.showMessageDialog(null, "Check the new conatct number again");}
        else{
            try{
                if (this.conn == null || this.conn.isClosed()) {
                // Re-establish the connection
                String jdbcUrl = "jdbc:mysql://localhost:3306/event_reservation";
                String username = "root";
                String password = "";
                this.conn = DriverManager.getConnection(jdbcUrl, username, password);
                }
                String sql = "UPDATE admin SET admin_Name = ?, admin_password =?, admin_contact_no = ? WHERE admin_name=? , admin_password=?";
                PreparedStatement add = conn.prepareStatement(sql);
                add.setString(1,newn);
                add.setString(2,newp);
                add.setString(3,nContact);
                add.setString(4,oldn);
                add.setString(5,oldp);
                add.executeUpdate();
                JOptionPane.showMessageDialog(null,"Update Sucessfully!");
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_updateinfo_bttnActionPerformed

    private void newnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newnameActionPerformed

    private void back_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_bttnActionPerformed
        // TODO add your handling code here:
        AdminProfile admin = new AdminProfile();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_bttnActionPerformed

    private void clear_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bttnActionPerformed
        // TODO add your handling code here:
        oldname.setText("");
        newname.setText("");
        newPassword.setText("");
        oldPassword.setText("");
        newNumber.setText("");
    }//GEN-LAST:event_clear_bttnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdminInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_bttn;
    private javax.swing.JButton clear_bttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField newNumber;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JTextField newname;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JTextField oldname;
    private javax.swing.JButton updateinfo_bttn;
    // End of variables declaration//GEN-END:variables
}