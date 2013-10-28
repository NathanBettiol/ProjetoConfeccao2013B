package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Sobra;
import br.senai.sc.model.persistencia.SobradaoJDBC;
import br.senai.sc.persistencia.dao.SobraDAO;
import javax.swing.JOptionPane;

/**
 * @version 1.0 23/09/2013
 * @author patricia_gageiro
 * @param p
 * @return
 */
public class TesteConexaoSobraDelete {

    public static void main(String[] args) {

        /*
         * Teste de deleção da classe sobra
         */

        Sobra sob = new Sobra();
        sob.setCodSobra(Integer.parseInt(JOptionPane.showInputDialog("Código: ")));
        SobraDAO dao = new SobradaoJDBC();
        dao.delete(sob);
    }
}
