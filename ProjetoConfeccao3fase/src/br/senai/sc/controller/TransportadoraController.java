/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.controller;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.model.persistencia.TransportadoraDaoJDBC;
import br.senai.sc.persistencia.dao.TransportadoraDAO;
import java.util.List;

/**
 *
 * @author wesley_s
 */
public class TransportadoraController {

    public List<Transportadora> listAll() {
        TransportadoraDAO dao = new TransportadoraDaoJDBC();
        return dao.listAll();
    }

    public boolean inserir(Transportadora t) {
        TransportadoraDAO dao = new TransportadoraDaoJDBC();
        return dao.insert(t);
    }

    public boolean delete(int id) {
        TransportadoraDAO dao = new TransportadoraDaoJDBC();
        return dao.delete(id);
    }

    public int update(Transportadora t) {
        TransportadoraDAO dao = new TransportadoraDaoJDBC();
        return dao.update(t);
    }

    public Transportadora listById(int id) {
        TransportadoraDAO dao = new TransportadoraDaoJDBC();
        return dao.listById(id);
    }

    public List<Transportadora> pesquisar(String texto) {
        TransportadoraDAO dao = new TransportadoraDaoJDBC();
        return dao.listPesquisa(texto);
    }
}
