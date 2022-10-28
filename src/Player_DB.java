/**
 * Student name : Srushti Madaiah Basavaraju && Varnika Bansal 
 *  Student ID : 19092262 && 22158598
 *  Course Project Design and Software Construction 
 *  Course ID :  COMP603
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// database connection to store players details 
public class Player_DB {
    private static final String USER_NAME = "pdc"; //your DB username
    private static final String PASSWORD = "pdc"; //your DB password
    private static final String URL = "jdbc:derby:WWTBM_DB; create=true"; 
    
    Connection connection ; 
    
    
    public Player_DB() {
        establishConnection();
    }

    private void establishConnection() {
       
        if (this.connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + " Get Connected Successfully ....");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        
        
        
    }
    
}
