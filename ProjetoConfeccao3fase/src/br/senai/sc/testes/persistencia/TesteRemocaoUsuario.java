/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.UsuarioDaoJDBC;
import br.senai.sc.persistencia.dao.UsuarioDAO;

/**
 *
 * @author larissa_mezari
 */
public class TesteRemocaoUsuario {
	public static void main(String[] args) {
     	UsuarioDAO dao = new UsuarioDaoJDBC();
   	 
    	dao.delete(1);
	}
}


