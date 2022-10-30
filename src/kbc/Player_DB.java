package kbc;

/**
 * Student name : Srushti Madaiah Basavaraju && Varnika Bansal 
 *  Student ID : 19092262 && 22158598
 *  Course Project Design and Software Construction 
 *  Course ID :  COMP603
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


// database connection to store players details 
public class Player_DB {
    private static final String USER_NAME = "pdc"; //your DB username
    private static final String PASSWORD = "pdc"; //your DB password
    private static final String URL = "jdbc:derby://localhost:1527/WWTBM_DB; create=true"; 
    
    //Connection connection ; 
    
    Player_DB dbManager;
    Statement statement;
 
    public static Connection connectdb(){
    
        Connection connection = null;
         
        try{
//            try {
//                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Player_DB.class.getName()).log(Level.SEVERE, null, ex);
//            }
         connection = DriverManager.getConnection(URL, USER_NAME,PASSWORD);
         // java.sql.Connection con = DriverManager.getConnection(URL,USER_NAME , PASSWORD);
           return connection;
        } catch (SQLException ex){
            Logger.getLogger(Player_DB.class.getName()).log(Level.SEVERE, null, ex);
        
        
        }
        return null;
        
    }
    
    
    
    
}
