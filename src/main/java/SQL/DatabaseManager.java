/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author Cliftonb
 */
public class DatabaseManager {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/apollodb";
    private static final String user = "root";
    private static final String pass = "Reddam2021";
    private static PreparedStatement statement;
    private static ResultSet resultSet;
    private static Connection conn;

    public static void connect() throws ClassNotFoundException, SQLException {
        if(conn == null){
            Class.forName(driver);
            System.out.println("Driver found");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected");
        }
    }

    //INSERT, UPDATE or DELETE
    public static void update(String query) throws SQLException {
        statement = conn.prepareStatement(query);
        statement.executeUpdate();
        statement.close();
    }

    //SELECT
    public static ResultSet query(String query) throws SQLException {
        statement = conn.prepareStatement(query);
        resultSet = statement.executeQuery();
        return resultSet;
    }

}
