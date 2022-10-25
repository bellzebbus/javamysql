/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Connection; /* esta wea nos permite conectarnos a la vola*/
import java.sql.DriverManager; /* esta wea es pa manejar las estructuras sql*/

/**
 *
 * @author vc
 */
public class conectar {
    
    public static final String url= "jdbc:mysql://localhost:3306/prueba";
    /*esta linea nos permite ubicar la base de datos. motor, host, puerto, nombre bd*/
    
    /*usuario y contraseña*/
    public static final String user = "root";
    public static final String pass = "";
    
    
    /*clase connection, sirve para mandar todo esto y poder conectarnos a la bd*/
    public Connection getConnection(){
        
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
        
    }   
}
