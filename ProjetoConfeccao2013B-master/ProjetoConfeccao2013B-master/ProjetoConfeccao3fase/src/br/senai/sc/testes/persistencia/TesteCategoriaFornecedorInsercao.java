/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaFornecedor;
import br.senai.sc.model.persistencia.CategoriaFornecedorDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaFornecedorDAO;
import javax.swing.JOptionPane;

/**
* TesteCategoriaFornecedorInsercao
*
* @version v1.0 Setembro/2013
* @author Giliard Carvalho
*/
public class TesteCategoriaFornecedorInsercao {
    
    public static void main(String[] args) {
        CategoriaFornecedor catForn = new CategoriaFornecedor();
        catForn.setCodCategoriaFornecedor(0);
        catForn.setNome(JOptionPane.showInputDialog("Informe o nome da Categoria do Fornecdedor"));
        catForn.setDescricao(JOptionPane.showInputDialog("Informe a descrição da Categoria"));
        catForn.setObservacoes(JOptionPane.showInputDialog("Informe sua Observação"));
        
        CategoriaFornecedorDAO dao = new CategoriaFornecedorDaoJDBC();
        dao.Insert(catForn);
    }
}