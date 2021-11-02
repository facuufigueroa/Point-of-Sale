/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabruyen;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Facundo
 */
public class Conexion {
    
    
    public static final String URL = "jdbc:mysql://localhost:3306/bd_productos";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Juanroman10";
    
    
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(Exception e){
            System.out.println(e);
            
        }
        return con;
    }

    
}
