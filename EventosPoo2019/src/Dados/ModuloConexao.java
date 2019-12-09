/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author carlo
 */
public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_eventos?useUnicode=yes&characterEncoding=UTF-8&useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
