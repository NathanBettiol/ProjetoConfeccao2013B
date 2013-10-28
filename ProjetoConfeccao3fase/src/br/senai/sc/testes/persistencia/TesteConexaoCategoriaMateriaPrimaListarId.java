package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;


import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 * @version 1.0 20/09/2013
 * 
 * Classe que testa a listagem por id de uma categoria de matéria-prima da base de dados.
 */
public class TesteConexaoCategoriaMateriaPrimaListarId {

//------------------------------------------------------------------------------
    public static void main(String[] args) {
        CategoriaMateriaPrimaDAO dao = new CategoriaMateriaPrimaDaoJDBC();
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código"
                + "da categoria da matéria prima  a ser listada"));
        CategoriaMateriaPrima cmp = dao.listById(cod);

        JOptionPane.showMessageDialog(null, cmp);
    }
}