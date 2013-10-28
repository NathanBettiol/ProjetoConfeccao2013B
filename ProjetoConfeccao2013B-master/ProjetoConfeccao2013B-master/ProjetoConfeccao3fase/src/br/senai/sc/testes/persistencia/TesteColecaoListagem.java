/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.ColecaoDaoJDBC;
import br.senai.sc.persistencia.dao.ColecaoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

/**
 * Teste de listagem da classe Colecao
 *
 * @author Gabriel Arsênio
 * @version 1.0 04/10/2013
 */
public class TesteColecaoListagem {

    public static void main(String[] args) throws SQLException {

        ColecaoDAO dao = new ColecaoDaoJDBC();
        JOptionPane.showMessageDialog(null, dao.listAll());
    }
}
