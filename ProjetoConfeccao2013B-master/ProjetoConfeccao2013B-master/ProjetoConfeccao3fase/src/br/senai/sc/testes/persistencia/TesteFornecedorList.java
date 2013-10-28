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
* TesteFornecedorList
*
* @version v1.0 Setembro/2013
* @author Giliard Carvalho
*/
public class TesteFornecedorList {
    
    public static void main(String[] args){
        FornecedorDAO dao = new FornecedorDaoJDBC();
        List<Fornecedor> fornecedor = dao.listAll();
        for (Fornecedor fornecedor : fornecedor) {
            System.out.println(fornecedor);
        } 
    }
}
