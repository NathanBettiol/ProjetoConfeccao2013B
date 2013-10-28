package br.senai.sc.controller;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.MateriaPrima;
import br.senai.sc.model.persistencia.FuncionariodaoJDBC;
import br.senai.sc.model.persistencia.MateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.FuncionarioDAO;
import br.senai.sc.persistencia.dao.MateriaPrimaDAO;

import java.util.List;

/**
 *
 * @author patricia_gageiro
 * @version 1.0 09/10/2013
 */
public class MateriaPrimaController {

    public List<MateriaPrima> listAll() {
        MateriaPrimaDAO dao = new MateriaPrimaDaoJDBC();
        return dao.listAll();
    }
    
    public boolean inserir(MateriaPrima mp){
        MateriaPrimaDAO dao = new MateriaPrimaDaoJDBC();
        return dao.insert(mp);
    }
}
