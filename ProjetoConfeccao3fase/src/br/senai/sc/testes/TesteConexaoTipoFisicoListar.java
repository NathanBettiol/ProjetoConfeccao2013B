/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.TipoFisico;
import br.senai.sc.model.persistencia.TipoFisicoDaoJDCB;
import br.senai.sc.persistencia.dao.TipoFisicoDAO;
import java.util.List;

/**
 *
 * @author gustavo_lourenco
 */
public class TesteConexaoTipoFisicoListar {

    public static void main(String[] args) {
        TipoFisicoDAO dao = new TipoFisicoDaoJDCB();
        List<TipoFisico> tipofisico = dao.listall();
        for (TipoFisico tipoFisico : tipofisico) {
            System.out.println(tipofisico);

        }
    }
}
