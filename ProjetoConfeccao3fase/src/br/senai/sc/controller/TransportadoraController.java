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
}
