/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Usuario;
import br.senai.sc.model.persistencia.UsuarioDaoJDBC;
import br.senai.sc.persistencia.dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author larissa_mezari
 */
public class TesteListarUsuario {
  	public static void main(String[] args) {
    	UsuarioDAO dao = new UsuarioDaoJDBC();
    	List<Usuario> usuarios = dao.listAll();
    	for (Usuario usuario : usuarios) {
        	System.out.println(usuarios);
    	}
           UsuarioDAO daoPes = new UsuarioDaoJDBC();
        daoPes.listAll();
	}
}


