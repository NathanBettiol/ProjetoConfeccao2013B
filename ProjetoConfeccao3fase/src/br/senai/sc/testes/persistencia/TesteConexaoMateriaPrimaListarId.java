package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.negocio.MateriaPrima;
import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.model.persistencia.MateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import br.senai.sc.persistencia.dao.MateriaPrimaDAO;


import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 * @version 1.0 20/09/2013
 * 
 * Classe que testa a listagem por id de uma matéria-prima da base de dados.
 */
public class TesteConexaoMateriaPrimaListarId {

//------------------------------------------------------------------------------
    public static void main(String[] args) {
       MateriaPrimaDAO dao = new MateriaPrimaDaoJDBC();
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código"
                + "da  matéria prima  a ser listada"));
      MateriaPrima mp = dao.listById(cod);

        JOptionPane.showMessageDialog(null, mp);
    }
}