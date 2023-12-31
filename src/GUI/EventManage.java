/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import CODE.DbConnect;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class EventManage extends javax.swing.JFrame {
    Connection conn = null;
    public String name;
    public String selectthisEvent;
    /**
     * Creates new form EventManage
     */
    public EventManage() throws SQLException {
        initComponents();
        conn= DbConnect.connect();
        Reconnect();
        
    }
    
    public String categoryN;
    public int seatPrice,seatNo ;
    
//    public void getTable(){
//        DefaultTableModel tblModel1 = (DefaultTableModel) new_ticket_details.getModel();
//        if (tblModel1.getRowCount() == 0){
//            JOptionPane.showMessageDialog(this,"table is empty");
//        }
//        else{
//            for(int i=0; i<tblModel1.getRowCount();i++){
//                try {
//                    categoryN = tblModel1.getValueAt(i, 0).toString();
//                    seatNo =  (int) tblModel1.getValueAt(i, 1);
//                    seatPrice =  (int) tblModel1.getValueAt(i, 2);
//                    String sql_add = "insert into seats(seat_category,NoOf_seats,seat_price ) values (?,?,?)";
//                    PreparedStatement pst =conn.prepareStatement(sql_add);
//                    pst.setString(1,categoryN);
//                    pst.setInt(2,seatNo);
//                    pst.setInt(2,seatPrice);
//                    pst.execute();
//                } catch (SQLException ex) {
//                    JOptionPane.showMessageDialog(this,ex);
//                }
//            }
//        }
//    }
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
        new_event = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        new_venue = new javax.swing.JTextField();
        new_date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        new_about = new javax.swing.JTextArea();
        addEvent = new javax.swing.JButton();
        clear_bttn1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        goToTickets = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        select_event = new java.awt.Choice();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        updateVenue = new javax.swing.JTextField();
        updateDate = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        updateAbout = new javax.swing.JTextArea();
        Update_bttn = new javax.swing.JButton();
        clear_bttn2 = new javax.swing.JButton();
        delete_event = new javax.swing.JButton();
        selectEvent = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        adminName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(" Event Management ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 430, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 80));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Add New Event  ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        new_event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_eventActionPerformed(evt);
            }
        });
        jPanel3.add(new_event, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 740, -1));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add your Event Ticket Details  :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 280, 30));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Event :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 30));

        new_venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_venueActionPerformed(evt);
            }
        });
        jPanel3.add(new_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 230, -1));
        jPanel3.add(new_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 280, -1));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(yyyy-mm-dd) : ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 110, 30));

        new_about.setColumns(20);
        new_about.setRows(5);
        jScrollPane1.setViewportView(new_about);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 480, 90));

        addEvent.setBackground(new java.awt.Color(204, 204, 204));
        addEvent.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        addEvent.setText("Add");
        addEvent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEventActionPerformed(evt);
            }
        });
        jPanel3.add(addEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 90, 30));

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
        jPanel3.add(clear_bttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 70, 30));

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
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 80, 30));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Venue :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 30));

        jLabel14.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("About :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 70, 30));

        goToTickets.setBackground(new java.awt.Color(204, 204, 204));
        goToTickets.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        goToTickets.setText("Add Tickets");
        goToTickets.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        goToTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToTicketsActionPerformed(evt);
            }
        });
        jPanel3.add(goToTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 90, 30));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 50, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 900, 340));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Update Event ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Venue :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 70, 30));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 70, 30));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Existing Event :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 30));

        select_event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                select_eventMouseClicked(evt);
            }
        });
        jPanel4.add(select_event, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 540, 40));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 10));

        jLabel13.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("About :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 70, 30));

        updateVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVenueActionPerformed(evt);
            }
        });
        jPanel4.add(updateVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, -1));
        jPanel4.add(updateDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 330, -1));

        updateAbout.setColumns(20);
        updateAbout.setRows(5);
        jScrollPane3.setViewportView(updateAbout);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 450, -1));

        Update_bttn.setBackground(new java.awt.Color(204, 204, 204));
        Update_bttn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Update_bttn.setText("Update");
        Update_bttn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_bttnActionPerformed(evt);
            }
        });
        jPanel4.add(Update_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 110, 30));

        clear_bttn2.setBackground(new java.awt.Color(204, 204, 204));
        clear_bttn2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        clear_bttn2.setText("Clear");
        clear_bttn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear_bttn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_bttn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bttn2ActionPerformed(evt);
            }
        });
        jPanel4.add(clear_bttn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 90, 30));

        delete_event.setBackground(new java.awt.Color(204, 204, 204));
        delete_event.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        delete_event.setText("Remove Event");
        delete_event.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_eventActionPerformed(evt);
            }
        });
        jPanel4.add(delete_event, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, 30));

        selectEvent.setBackground(new java.awt.Color(204, 204, 204));
        selectEvent.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        selectEvent.setText("Select Event to Update");
        selectEvent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEventActionPerformed(evt);
            }
        });
        jPanel4.add(selectEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 150, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, 330));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 30));
        jPanel1.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 700, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void new_eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_eventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_eventActionPerformed

    private void new_venueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_venueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_venueActionPerformed

    private void addEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEventActionPerformed
        if(new_event.equals("") || new_venue.equals("") || new_date.equals("") || new_about.equals("")){
           JOptionPane.showMessageDialog(null, "Please fill the details.");
        }else{
        try {                                         
            // TODO add your handling code here:
            String evName = new_event.getText();
            String evVenue = new_venue.getText();
            String evAbout = new_about.getText();
            int adminID = getAdminIdFromDatabase(name);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate = dateFormat.parse(updateDate.getText());
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
            //table.getTable();
            
            try {
                String sql = "INSERT INTO event_table(event_Name, venue, date, about, admin_ID) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement add = conn.prepareStatement(sql);
                
                // Set values using prepared statement parameters
                add.setString(1, evName);
                add.setString(2, evVenue);
                add.setDate(3, sqlDate);
                add.setString(4, evAbout);
                add.setInt(5,adminID);
                
                // Execute the update
                int rowsAffected = add.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Event Added!");
                    new_event.setText("");
                    new_venue.setText("");
                    new_date.setText("");
                    new_about.setText("");
//                    removeAllRows(new_ticket_details);
                } else {
                    JOptionPane.showMessageDialog(null, " Failed! \nTry Again!");}
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error occurs at Adding event : "+e);
            }
        } catch (ParseException ex) {
            Logger.getLogger(EventManage.class.getName()).log(Level.SEVERE,null, ex);
        }         
    }//GEN-LAST:event_addEventActionPerformed
}
    private void updateVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateVenueActionPerformed

    private void clear_bttn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bttn2ActionPerformed
        // TODO add your handling code here:
//        removeAllRows(updateTicket);
        updateVenue.setText("");
        updateDate.setText("");
        updateAbout.setText(""); 
    }//GEN-LAST:event_clear_bttn2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
            // TODO add your handling code here:
            AdminProfile adminNew = new AdminProfile();
            adminNew.setVisible(true);
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error occurs at Adding event : "+e);
        }
    }//GEN-LAST:event_backActionPerformed

    private void clear_bttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bttn1ActionPerformed
        // TODO add your handling code here:
        new_event.setText("");
        new_venue.setText("");
        new_date.setText("");
        new_about.setText("");
        
    }//GEN-LAST:event_clear_bttn1ActionPerformed

    private void select_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_bttnActionPerformed

        
    }//GEN-LAST:event_select_bttnActionPerformed

    private void Update_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_bttnActionPerformed
        String venue = updateVenue.getText();
        Object date = updateDate.getText();
        String about = updateAbout.getText();
        
        try{
        String updateSql = "UPDATE event_table SET venue=?, date=?, about=? WHERE eventName=?";
        PreparedStatement add = conn.prepareStatement(updateSql);

            add.setString(1, venue);
            add.setObject(2, date);
            add.setString(3, about);
            

            // Execute the update
            add.executeUpdate();
        

        JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    
        } 
    }//GEN-LAST:event_Update_bttnActionPerformed

    private void delete_eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_eventActionPerformed
        // TODO add your handling code here:
        try{String sql2 = "DELETE FROM  event_table  where  event_name= ?";
        PreparedStatement add = conn.prepareStatement(sql2);
        
        add.executeQuery();
        JOptionPane.showMessageDialog(null, "Event successfully delete!");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_delete_eventActionPerformed
    }
    private void goToTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToTicketsActionPerformed
        try {
            // TODO add your handling code here:
            AddTickets adminNew = new AddTickets(name);
            adminNew.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(EventManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_goToTicketsActionPerformed

    private void select_eventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_eventMouseClicked
        // TODO add your handling code here
        try{
        String sql_eventBox = "SELECT event_name FROM event_table";
            PreparedStatement add = conn.prepareStatement(sql_eventBox);
            ResultSet rs = add.executeQuery();
        
        while(rs.next()){
            String name = rs.getString("event_name");
            select_event.addItem(name);
            
        }
        Object sObj = select_event.getSelectedItem();
        if (sObj != null){
            if(sObj instanceof String ){
               this.selectthisEvent = (String)sObj;
            }
        }
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error occurs at selecting event box : "+e);
        
        }
    }//GEN-LAST:event_select_eventMouseClicked

    private void selectEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectEventActionPerformed

    
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
            java.util.logging.Logger.getLogger(EventManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new EventManage().setVisible(true);
//                EventManage table = new EventManage();
                } catch (SQLException ex) {
                    Logger.getLogger(EventManage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update_bttn;
    private javax.swing.JButton addEvent;
    private javax.swing.JTextField adminName;
    private javax.swing.JButton back;
    private javax.swing.JButton clear_bttn1;
    private javax.swing.JButton clear_bttn2;
    private javax.swing.JButton delete_event;
    private javax.swing.JButton goToTickets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea new_about;
    private javax.swing.JTextField new_date;
    private javax.swing.JTextField new_event;
    private javax.swing.JTextField new_venue;
    private javax.swing.JButton selectEvent;
    private java.awt.Choice select_event;
    private javax.swing.JTextArea updateAbout;
    private javax.swing.JTextField updateDate;
    private javax.swing.JTextField updateVenue;
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
    // clear table method
//public static void removeAllRows(JTable table) {
//
//    DefaultTableModel model = (DefaultTableModel) table.getModel();
//
//    for (int row = 0; row < table.getRowCount(); row++) {
//        model.removeRow(row);
//    }
//}
  void setAdminName(){
     String admin_name = adminName.getText();
     try{if(checkAdminName(admin_name)){
         this.name =admin_name;
     }else{
         JOptionPane.showMessageDialog(null, "Check the Your Name again");
     }
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "error with set admin naming.");
     }
 }
 
 public String getAdminName(){
     return name;
 }
 
 private boolean checkAdminName(String this_name){
     String sql = "SELECT  admin_Name FROM admin WHERE admin_Name=?";
        try{
            PreparedStatement add = conn.prepareStatement(sql);
            add.setString(1, this_name);
            ResultSet rst = add.executeQuery();
            return rst.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error occurs at checking AdminName : "+e);
        }
        return false;
 }
  private int getAdminIdFromDatabase(String adminName) {
        int adminId = -1; // Default value indicating an error or not found

        String selectSql = "SELECT admin_ID FROM admin WHERE admin_Name = ?";
        
        try{
            PreparedStatement add = conn.prepareStatement(selectSql);
            add.setString(1, adminName);

            try (ResultSet resultSet = add.executeQuery()) {
                if (resultSet.next()) {
                    adminId = resultSet.getInt("admin_Id");
                }
            }
        } catch (SQLException e) {
            // Handle the exception according to your needs
            JOptionPane.showMessageDialog(null,"Error occurs at getting admin id : "+e);
        }

        return adminId;
    }
}
