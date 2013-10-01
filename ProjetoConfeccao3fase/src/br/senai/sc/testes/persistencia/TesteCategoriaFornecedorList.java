/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaFornecedor;
import br.senai.sc.model.persistencia.CategoriaFornecedorDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaFornecedorDAO;
import java.util.List;

/**
* TesteCategoriaFornecedorList
*
* @version v1.0 Setembro/2013
* @author Giliard Carvalho
*/
public class TesteCategoriaFornecedorList {
    
    public static void main(String[] args){
        CategoriaFornecedorDAO dao = new CategoriaFornecedorDaoJDBC();
        List<CategoriaFornecedor> fornecedor = dao.listAll();
        for (CategoriaFornecedor categoriaFornecedor : categoriaFornecedor) {
            System.out.println(categoriaFornecedor);
        } 
    }
}
