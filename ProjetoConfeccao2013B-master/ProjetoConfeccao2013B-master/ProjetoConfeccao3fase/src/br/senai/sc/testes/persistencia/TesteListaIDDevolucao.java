/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Devolucao;
import br.senai.sc.model.persistencia.DevolucaoDaoJDBC;
import br.senai.sc.persistencia.dao.DevolucaoDAO;


/**
 *
 * @author douglas_ghisleri
 */
public class TesteListaIDDevolucao {
    public static void main(String[] args) {
        DevolucaoDAO dao = new DevolucaoDaoJDBC();
        Devolucao d = dao.listById(2);
        System.out.println(d);

    }
}
