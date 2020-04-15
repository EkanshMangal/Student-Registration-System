
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ekansh
 */
public class databaseConnection {
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/student"; // student is name of database
    // DB_URL contain path for database where student is name of database used
    final static String USER = "root"; // Username defined
    final static String PASS=""; // Password reamin blank
    public static Connection connection()
    { // to establish connection
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        }catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}    
