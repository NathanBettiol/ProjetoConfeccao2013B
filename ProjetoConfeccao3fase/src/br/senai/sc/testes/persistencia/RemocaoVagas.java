
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.VagasDaoJDBC;
import br.senai.sc.persistencia.dao.VagasDAO;


/*
 * Classe responsavel pela execução do teste de remoção
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */

public class RemocaoVagas {
    
    public static void main(String[] args) {
        
        VagasDAO dao = new VagasDaoJDBC();
        
        dao.delete(1);
        
        
    }
    
}
