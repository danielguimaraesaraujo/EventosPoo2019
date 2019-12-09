/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Modelos.Evento;
import Modelos.Inscricao;
import java.util.Calendar;

/**
 *
 * @author carlo
 */
public class TesteDAO {

    public static void main(String[] args) {
        testeDAOInscricao();
    }

    public static void testeDAOInscricao() {
        Inscricao inscricao = new Inscricao();
        inscricao.setIdEventos("14");
        
        
        InscricaoDAO inscricaoDAO = new InscricaoDAO();
        inscricaoDAO.inserir(inscricao);

    }
    public static void testeDAOEventos() {
        Evento evento = new Evento();
        evento.setNome("aniversario do ET jonatas");
        evento.setDescricao("dia de nascimento do ET jonatas");
        evento.setDataEvento("2019-12-08");
        evento.setLocal("São Paulo capital");

        EventoDAO eventoDAO = new EventoDAO();
        eventoDAO.inserir(evento);

    }

    public static void testeData() {
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        
        
        
    }
}
