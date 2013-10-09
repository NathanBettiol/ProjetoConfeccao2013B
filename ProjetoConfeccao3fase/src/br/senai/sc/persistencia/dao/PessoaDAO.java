package br.senai.sc.persistencia.dao;


import br.senai.sc.model.negocio.Pessoa;
import java.util.List;

/**
 *
 * @author patricia_gageiro
 */
public interface PessoaDAO {

    List<Pessoa> listAll();
    
}
