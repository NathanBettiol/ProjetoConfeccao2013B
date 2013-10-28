/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.FeriasDaoJDBC;
import br.senai.sc.persistencia.dao.FeriasDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author larissa
 */
public class TesteRemocaoFerias {
    public static void main(String[] args) {
     	FeriasDAO dao = new FeriasDaoJDBC();
   	 
    	dao.delete(Integer.parseInt(JOptionPane.showInputDialog("digite o numero do registro a ser excluido : ")));
	}
}
