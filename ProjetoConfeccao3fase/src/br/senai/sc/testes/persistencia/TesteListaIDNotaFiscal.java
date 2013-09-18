/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.NotaFiscal;
import br.senai.sc.model.persistencia.NotaFiscalDaoJDBC;
import br.senai.sc.persistencia.dao.NotaFiscalDAO;

/**
 *
 * @author elivelton_sipriano
 */
public class TesteListaIDNotaFiscal {

    public static void main(String[] args) {
        NotaFiscalDAO dao = new NotaFiscalDaoJDBC();
        NotaFiscal e = dao.listById(1);
        System.out.println(e);

    }
}
