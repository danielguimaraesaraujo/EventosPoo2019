/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author cbueno
 */
public class EventosConnection {
    
    private static final String ConnectionString = "jdbc:mysql://localhost:3306/db_eventos?useUnicode=yes&characterEncoding=UTF-8&useTimezone=true&serverTimezone=UTC";
    private static Connection con = null;
    private static Statement stmt = null;
    private static final String user = "root";

    public static Connection ConnectionEventosDB() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        return con = DriverManager.getConnection(ConnectionString, "root", "");

    }
    
}
