/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Ferias;
import br.senai.sc.model.persistencia.FeriasDaoJDBC;
import br.senai.sc.persistencia.dao.FeriasDAO;
import java.util.List;

/**
 *
 * @author larissa
 */
public class TesteListaFerias {
    public static void main(String[] args) {
    	FeriasDAO dao = new FeriasDaoJDBC();
    	List<Ferias> f = dao.listAll();
    	for (Ferias ferias : f) {
        	System.out.println(f);
}
    }
}
