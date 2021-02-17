/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ma7moud7amdy
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {


    public static Connection connectDb() {
        try {
            Class.forName("org.sqlite.JDBC");
           //Connection con = DriverManager.getConnection("jdbc:sqlite:/media/ma7moud7amdy/Pro/Library Management System Project/Database.sqlite");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Database.sqlite");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
