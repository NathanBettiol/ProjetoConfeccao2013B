package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.NotaFiscal;
import br.senai.sc.model.persistencia.NotaFiscalDaoJDBC;
import br.senai.sc.persistencia.dao.NotaFiscalDAO;
import java.util.List;

/**
 *
 * @author elivelton_sipriano
 */
public class TesteListaTodasNotasFiscais {

    public static void main(String[] args) {
        NotaFiscalDAO dao = new NotaFiscalDaoJDBC();
        List<NotaFiscal> notasFiscais = dao.listAll();
        for (NotaFiscal notaFiscal : notasFiscais) {
            System.out.println(notaFiscal);

        }
    }
}