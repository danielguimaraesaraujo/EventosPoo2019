/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dgaraujo
 */
public class ListaEventosConnection extends EventosConnection{
    
    public  List<String> selectListEventos() throws IllegalAccessException, InstantiationException, SQLException, ClassNotFoundException {
        String query = "select id,nome from db_eventos.tb_eventos";
        PreparedStatement ps = EventosConnection.ConnectionEventosDB().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<String> lista = new ArrayList<>();
        while(rs.next()){
            lista.add(rs.getString("nome"));
            //lista.add(rs.getString("id"));
        }
        return lista;
    }
    
}
