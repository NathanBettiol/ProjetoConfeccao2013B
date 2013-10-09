package br.senai.sc.controller;


import br.senai.sc.model.negocio.Pessoa;
import br.senai.sc.model.persistencia.PessoaDaoJDBC;
import br.senai.sc.persistencia.dao.PessoaDAO;
import java.util.List;

/**
 *
 * @author patricia_gageiro
 */
public class PessoaController {
    
    public List<Pessoa> listAll(){
        PessoaDAO dao = new PessoaDaoJDBC();
        return dao.listAll();
    }
}
