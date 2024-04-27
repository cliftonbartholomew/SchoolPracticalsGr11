/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class TestSQL {
    public static void main(String[] args) {
        try {
            DatabaseManager.connect();
            ResultSet rs = DatabaseManager.query("SELECT * FROM apollodb.tblmission;");
            
            while(rs.next()){
                int id = rs.getInt("MissionID");
                String missionName = rs.getString("MissionName");
                
                System.out.println("id: " + id + " mission " + missionName);
            }
            
            ResultSet rs2 = DatabaseManager.query("SELECT MissionName FROM apollodb.tblmission\n" +
"WHERE MissionID = 11;");
            rs2.next();
            String name = rs2.getString("MissionName");
            System.out.println(name);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }
}
