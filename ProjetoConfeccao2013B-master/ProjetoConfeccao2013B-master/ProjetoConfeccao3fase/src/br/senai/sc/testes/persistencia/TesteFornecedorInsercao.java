/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Fornecedor;
import br.senai.sc.model.persistencia.FornecedorDaoJDBC;
import br.senai.sc.persistencia.dao.FornecedorDAO;
import javax.swing.JOptionPane;

/**
* TesteFornecedorInsercao
*
* @version v1.0 Setembro/2013
* @author Giliard Carvalho
*/
public class TesteFornecedorInsercao {
    
    public static void main(String[] args) {
        Fornecedor forn = new Fornecedor();
        forn.setCodFornecedor(0);
        forn.setNome(JOptionPane.showInputDialog("Informe o nome do Fornecedor"));
        forn.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ do Fornecedor"));
        forn.setEndereco(JOptionPane.showInputDialog("Informe o endereço do Fornecedor"));
        forn.setRazaoSocial(JOptionPane.showInputDialog("Informe a razao social do Fornecedor"));
        forn.setTelefone(JOptionPane.showInputDialog("Informe o telefone do Fornecedor"));
        forn.setEmail(JOptionPane.showInputDialog("Informe o E-Mail do Fornecedor"));
        forn.setPaginaWeb(JOptionPane.showInputDialog("Informe o site do Fornecedor"));
        forn.setContato(JOptionPane.showInputDialog("Informe o contato do Fornecedor"));
        forn.setCategoriaFornecedor(JOptionPane.showInputDialog("Informe a Categoria do Fornecedor"));
        
        FornecedorDAO dao = new FornecedorDaoJDBC();
        dao.Insert(forn);
    }
    
}
