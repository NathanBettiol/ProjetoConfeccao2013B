/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Meta;
import br.senai.sc.model.persistencia.MetaDaoJDBC;
import br.senai.sc.persistencia.dao.MetaDAO;
import java.util.List;

/**
 *
 * @author douglas_ghisleri
 */
public class TesteListaTodosMeta {

    public static void main(String[] args) {

        MetaDAO dao = new MetaDaoJDBC();
        List<Meta> metas = dao.listAll();
        for (Meta meta : metas) {
            System.out.println(meta);

        }
    }
}
