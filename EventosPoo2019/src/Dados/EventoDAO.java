/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Modelos.Evento;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class EventoDAO {

    private Connection conexao;

    long millis = System.currentTimeMillis();
    java.sql.Date date = new java.sql.Date(millis);
    
    
    
    public String inserir(Evento evento) {

        String message = "";
        try {
            String sql = "INSERT INTO tb_eventos (`nome`, `descricao`, `dataEvento`, `local`, `id_login`, `dataAtualizacao`) VALUES (?,?,?,?,?,?);";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, evento.getNome());
            stmt.setString(2, evento.getDescricao());
            stmt.setString(3, evento.getDataEvento());
            stmt.setString(4, evento.getLocal());
            stmt.setString(5, "1");
            stmt.setString(6,""+date);
            // não mexer nessas duas linhas abaixo, elas são padrão
            stmt.execute();
            stmt.close();
            message = "Evento " + evento.getNome() + " criado com sucesso";
        } catch (SQLException e) {
            message = "Evento " + evento.getNome() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }

}
