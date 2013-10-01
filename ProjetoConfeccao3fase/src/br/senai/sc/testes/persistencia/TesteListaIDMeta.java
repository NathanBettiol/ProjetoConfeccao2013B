/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Meta;
import br.senai.sc.model.persistencia.MetaDaoJDBC;
import br.senai.sc.persistencia.dao.MetaDAO;


/**
 *
 * @author douglas_ghisleri
 */
public class TesteListaIDMeta {
     public static void main(String[] args) {
        MetaDAO dao = new MetaDaoJDBC();
        Meta d = dao.listById(2);
        System.out.println(d);
    }
}
