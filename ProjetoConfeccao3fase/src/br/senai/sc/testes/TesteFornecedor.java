/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Fornecedor;
import javax.swing.JOptionPane;

/**
* TesteFornecedor
*
* @version v1.0 Setembro/2013
* @author Giliard Carvalho
*/
public class TesteFornecedor {
    
    public static void main(String[] args) {
        //Instância Fornecedor com o código 0
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
        
        //Instância Fornecedor com o código 1
        Fornecedor forn1 = new Fornecedor();
        forn1.setCodFornecedor(1);
        forn1.setNome(JOptionPane.showInputDialog("Informe o nome do Fornecedor"));
        forn1.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ do Fornecedor"));
        forn1.setEndereco(JOptionPane.showInputDialog("Informe o endereço do Fornecedor"));
        forn1.setRazaoSocial(JOptionPane.showInputDialog("Informe a razao social do Fornecedor"));
        forn1.setTelefone(JOptionPane.showInputDialog("Informe o telefone do Fornecedor"));
        forn1.setEmail(JOptionPane.showInputDialog("Informe o E-Mail do Fornecedor"));
        forn1.setPaginaWeb(JOptionPane.showInputDialog("Informe o site do Fornecedor"));
        forn1.setContato(JOptionPane.showInputDialog("Informe o contato do Fornecedor"));
    }
}
