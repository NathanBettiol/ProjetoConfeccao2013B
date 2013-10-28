/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.controller;

import br.senai.sc.model.negocio.Assistencia;
import br.senai.sc.model.persistencia.AssistenciaDaoJDBC;
import br.senai.sc.persistencia.dao.AssistenciaDAO;
import java.util.List;

/**
 *
 * @author wesley_s
 */
public class AssistenciaController {

    public List<Assistencia> listAll() {
        AssistenciaDAO dao = new AssistenciaDaoJDBC();
        return dao.listAll();
    }

    public boolean inserir(Assistencia a) {
        AssistenciaDAO dao = new AssistenciaDaoJDBC();
        return dao.insert(a);
    }
}
