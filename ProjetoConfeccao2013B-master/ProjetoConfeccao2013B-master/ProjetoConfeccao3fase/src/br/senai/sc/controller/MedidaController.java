/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.controller;

import br.senai.sc.model.negocio.Medida;
import br.senai.sc.model.persistencia.MedidaDaoJDBC;
import br.senai.sc.persistencia.dao.MedidaDAO;
import java.util.List;

/**
 *
 * @author gustavo_lourenco
 */
public class MedidaController {

    public List<Medida> listAll() {
        MedidaDAO dao = new MedidaDaoJDBC();
        return dao.listall();
    }

    public boolean inserir(Medida m) {
        MedidaDAO dao = new MedidaDaoJDBC();
        return dao.insert(m);
    }
}
