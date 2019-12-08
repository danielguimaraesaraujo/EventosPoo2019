/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Modelos.Inscricao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class InscricaoDAO {
    private Connection conexao;

    long millis = System.currentTimeMillis();
    java.sql.Date date = new java.sql.Date(millis);
    
    
    
    public String inserir(Inscricao inscricao) {

        String message = "";
        try {
            String sql = "INSERT INTO tb_inscricao (`data`, `tb_logins_id`, `tb_eventos_id` ) VALUES (?,?,?);";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,""+date);
            stmt.setString(2, "1");
            stmt.setString(3, inscricao.getIdEventos());

            // não mexer nessas duas linhas abaixo, elas são padrão
            stmt.execute();
            stmt.close();
            message = "a inscrição para o evento " + inscricao.getIdEventos() + " foi criada com sucesso";
            JOptionPane.showMessageDialog(null, "a inscrição para o evento " + inscricao.getIdEventos() + " foi criada com sucesso");
        } catch (SQLException e) {
            message = "a inscrição para o evento " + inscricao.getIdEventos() + " NÃO foi criada com sucesso" + e.getMessage();
            JOptionPane.showMessageDialog(null, "a inscrição para o evento " + inscricao.getIdEventos() + " NÃO foi criada com sucesso" + e.getMessage());
        }
        System.out.println(message);
        return message;
    }
}
