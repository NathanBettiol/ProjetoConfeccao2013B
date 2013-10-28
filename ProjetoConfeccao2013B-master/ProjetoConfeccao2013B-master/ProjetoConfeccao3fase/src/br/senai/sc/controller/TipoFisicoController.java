/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.controller;

import br.senai.sc.model.negocio.TipoFisico;
import br.senai.sc.model.persistencia.TipoFisicoDaoJDCB;
import br.senai.sc.persistencia.dao.TipoFisicoDAO;
import java.util.List;

/**
 *
 * @author gustavo_lourenco
 */
public class TipoFisicoController {

    public List<TipoFisico> listAll() {
        TipoFisicoDAO dao = new TipoFisicoDaoJDCB();
        return dao.listall();
    }

    public boolean inserir(TipoFisico m) {
        TipoFisicoDAO dao = new TipoFisicoDaoJDCB();
        return dao.insert(m);
    }
}
