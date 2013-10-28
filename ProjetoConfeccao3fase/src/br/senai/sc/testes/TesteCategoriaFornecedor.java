/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.CategoriaFornecedor;
import javax.swing.JOptionPane;

/**
* TesteCategoriaFornecedor
*
* @version v1.0 Setembro/2013
* @author Giliard Carvalho
*/
public class TesteCategoriaFornecedor {
    
    public static void main(String[] args) {
        //Instâcia Categoriafornecedor com código 0
        CategoriaFornecedor CatForn = new CategoriaFornecedor();
        CatForn.setCodCategoriaFornecedor(0);
        CatForn.setNome(JOptionPane.showInputDialog("Informe o nome da Categoria de Fornecedores"));
        CatForn.setDescricao(JOptionPane.showInputDialog("Informe a descrição da Categoria de Fornecedores"));
        CatForn.setObservacoes(JOptionPane.showInputDialog("Informe suas observações para a Categoria de Fornecedores"));
        
        //Instâcia Categoriafornecedor com código 1
        CategoriaFornecedor CatForn1 = new CategoriaFornecedor();
        CatForn1.setCodCategoriaFornecedor(0);
        CatForn1.setNome(JOptionPane.showInputDialog("Informe o nome da Categoria de Fornecedores"));
        CatForn1.setDescricao(JOptionPane.showInputDialog("Informe a descrição da Categoria de Fornecedores"));
        CatForn1.setObservacoes(JOptionPane.showInputDialog("Informe suas observações para a Categoria de Fornecedores"));
    }
}
