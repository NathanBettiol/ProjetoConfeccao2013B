/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Entrada;
import br.senai.sc.model.persistencia.EntradaDaoJDBC;
import br.senai.sc.persistencia.dao.EntradaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author nathan_bettiol
 * classe que remove um registro da base de dados
 * 
 */
public class TesteRemocaoEntrada {
    
    public static void main(String[] args) {
        
        Entrada e = new Entrada();
        
         EntradaDAO dao = new EntradaDaoJDBC();
        dao.delete(Integer.parseInt(JOptionPane.showInputDialog("digite o numero do registro a ser excluido : ")));
        
    }
}
