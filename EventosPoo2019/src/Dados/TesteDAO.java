/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Modelos.Evento;

/**
 *
 * @author carlo
 */
public class TesteDAO {

    public static void main(String[] args) {
        testeDAO();
    }
    
    public static void testeDAO() {
        Evento evento = new Evento();
        evento.setNome("CCXP");
        evento.setNome("Um evento de cultura nerd mt legal e com muita coisa geek");
        evento.setDataEvento("06/12");
        evento.setLocal("São Paulo capital");
        
        
        EventoDAO eventoDAO = new EventoDAO();
        eventoDAO.inserir(evento);
        

    }
}
