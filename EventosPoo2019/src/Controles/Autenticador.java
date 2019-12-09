/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Templates.HomeEventos;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Autenticador {
    
    
    public static Boolean getAutentication (String user, String pass) {
    
        if (user.equals("Carlos") && pass.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Bem Vindo");
            HomeEventos telaprincipal = new HomeEventos();
            telaprincipal.setVisible(true);
            return true;
        } else if (user.equals("Paulo") && pass.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Bem Vindo");
            HomeEventos telaprincipal = new HomeEventos();
            telaprincipal.setVisible(true);
            return true;
        } else if (user.equals("Daniel") && pass.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Bem Vindo");
            HomeEventos telaprincipal = new HomeEventos();
            telaprincipal.setVisible(true);
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null,"Acesso Negado");
            return false;
        }
        
        
    }
}
