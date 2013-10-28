/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Fornecedor;
import br.senai.sc.model.persistencia.FornecedorDaoJDBC;
import br.senai.sc.persistencia.dao.FornecedorDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
* TesteFornecedorListId
*
* @version v1.0 Setembro/2013
* @author Giliard Carvalho
*/
public class TesteFornecedorListId {
    
    public static void main(String[] args) {
       FornecedorDAO dao = new FornecedorDaoJDBC();
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código"
                + "do Fornecedor a ser listado"));
       Fornecedor forn = dao.listById(cod);

        JOptionPane.showMessageDialog(null, forn);
    }
    
}
