package br.senai.sc.controller;


import br.senai.sc.model.negocio.CategoriaMateriaPrima;

import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;

import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;

import java.util.List;

/**
 *
 * @author leticia_jesus
 * @version 1.0 09/10/2013
 */
public class CategoriaMateriaPrimaController {

    public List<CategoriaMateriaPrima> listAll() {
        CategoriaMateriaPrimaDAO dao = new CategoriaMateriaPrimaDaoJDBC();
        return dao.listAll();
    }
    
    public boolean inserir(CategoriaMateriaPrima cmp){
        CategoriaMateriaPrimaDAO dao = new CategoriaMateriaPrimaDaoJDBC();
        return dao.insert(cmp);
    }
}
