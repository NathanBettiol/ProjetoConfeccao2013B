package br.senai.sc.testes;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionariodaoJDBC;
import br.senai.sc.persistencia.dao.FuncionarioDAO;
import javax.swing.JOptionPane;

/**
 * @version 1.0 16/09/2013
 * @author patricia_gageiro
 * @param p
 * @return
 */
public class TesteConexaoFuncionarioDelete {

    public static void main(String[] args) {

        /*
         * Teste de deleção da classe funcionario
         */

        Funcionario fun = new Funcionario();
        fun.setCod(Integer.parseInt(JOptionPane.showInputDialog("Código: ")));
        FuncionarioDAO dao = new FuncionariodaoJDBC();
        dao.delete(fun);
    }
}
