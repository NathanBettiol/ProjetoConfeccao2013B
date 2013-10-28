/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.controller;

import br.senai.sc.model.negocio.Usuario;
import br.senai.sc.model.persistencia.UsuarioDaoJDBC;
import br.senai.sc.persistencia.dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author larissa_mezari
 */
public class UsuarioController {
   public List<Usuario> listAll() {
        UsuarioDAO dao = new UsuarioDaoJDBC();
        return dao.listAll();
    }

    public boolean insert (Usuario u){
        UsuarioDAO dao = new UsuarioDaoJDBC();
        return dao.insert(u);
    }
    
    public boolean update (Usuario u){
        UsuarioDAO dao = new UsuarioDaoJDBC();
        return dao.update(u);
    }
    
     public boolean delete (int codUsuario){
        UsuarioDAO dao = new UsuarioDaoJDBC();
        return dao.delete(codUsuario);
    }   
}
