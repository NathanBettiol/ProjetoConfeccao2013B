package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.CategoriaColecaoDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaColecaoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Teste de listagem de banco da classe CategoriaColecao
 *
 * @author Gabriel Arsênio
 * @version 1.0 04/10/2013
 */
public class TesteCategoriaColecaoListagem {

    public static void main(String[] args) throws SQLException {
        CategoriaColecaoDAO dao = new CategoriaColecaoDaoJDBC();
        JOptionPane.showMessageDialog(null, dao.listAll());
    }
}
