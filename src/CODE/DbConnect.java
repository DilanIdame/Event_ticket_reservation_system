/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CODE;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DbConnect {
    public static Connection connect(){
        Connection conn= null;
         try{
             Class.forName("com.mysql.jdbc.Driver");
             // Load the JDBC driver

            // Establish a connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/event_reservation";
            String username = "root";
            String password = "";
            conn = (Connection) DriverManager.getConnection(jdbcUrl, username, password);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }
         
        return conn;
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        // TODO code application logic here
//    }
}
