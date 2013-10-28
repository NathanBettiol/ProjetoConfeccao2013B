/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaFornecedor;
import br.senai.sc.model.persistencia.CategoriaFornecedorDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaFornecedorDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
* TesteCategoriaFornecedorListId
*
* @version v1.0 Setembro/2013
* @author Giliard Carvalho
*/
public class TesteCategoriaFornecedorListId {
    
    public static void main(String[] args) {
       CategoriaFornecedorDAO dao = new CategoriaFornecedorDaoJDBC();
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código"
                + "da Categoria do Fornecedor a ser listado"));
       CategoriaFornecedor catForn = dao.listById(cod);

        JOptionPane.showMessageDialog(null, catForn);
    }
}
