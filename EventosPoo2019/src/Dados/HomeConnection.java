/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cbueno
 */
public class HomeConnection {
    
        public static ResultSet selectHome() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        String query = "SELECT id as 'Id_Eventos',Nome,Descricao, DATE_FORMAT(dataEvento,'%d/%m/%Y') as Data_Evento, local FROM db_eventos.tb_eventos";
        PreparedStatement ps = EventosConnection.ConnectionEventosDB().prepareCall(query);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    

}
