/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author YULIDA
 */
public class conexion {
    private static final String url = "jdbc:mysql://localhost:3306/bd_registrop";
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "root";
    private static Connection cx = null;
    
    public static Connection getConexion(){
        try {
            Class.forName(driver);
            if(cx == null){
            cx = DriverManager.getConnection(url, pass, user);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion: "+e);
        }
        return cx;
    }
    public static void cerrar(){
        if(cx!=null){
            cx = null;
        }
    }
    
}
