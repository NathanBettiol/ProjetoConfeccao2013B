package br.senai.sc.controller;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionariodaoJDBC;
import br.senai.sc.persistencia.dao.FuncionarioDAO;

import java.util.List;

/**
 *
 * @author patricia_gageiro
 * @version 1.0 09/10/2013
 */
public class FuncionarioController {

    public List<Funcionario> listAll() {
        FuncionarioDAO dao = new FuncionariodaoJDBC();
        return dao.listAll();
    }
    
    public boolean inserir(Funcionario fun){
        FuncionarioDAO dao = new FuncionariodaoJDBC();
        return dao.insert(fun);
    }
    
    public boolean delete(Funcionario fun){
        FuncionarioDAO dao = new FuncionariodaoJDBC();
        return dao.delete(fun);
    }
    
    public List<Funcionario> pesquisar(String texto){
        FuncionarioDAO dao = new FuncionariodaoJDBC();
        return dao.ListPesquisa(texto);
    }
    
    public boolean update (Funcionario fun){
        FuncionarioDAO dao = new FuncionariodaoJDBC();
        return dao.update(fun);
    }
}
