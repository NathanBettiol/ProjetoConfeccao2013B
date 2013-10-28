/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.UsuarioDaoJDBC;
import br.senai.sc.persistencia.dao.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author larissa_mezari
 */
public class TesteRemocaoUsuario {
	public static void main(String[] args) {
     	UsuarioDAO dao = new UsuarioDaoJDBC();
   	 
    	dao.delete(Integer.parseInt(JOptionPane.showInputDialog("digite o numero do registro a ser excluido : ")));
	}
}


