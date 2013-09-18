
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.TreinamentoDaoJDBC;
import br.senai.sc.persistencia.dao.TreinamentoDAO;


/*
 * Classe responsavel pela execução do teste de remoção
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */

public class RemocaoTreinamento {
    
    public static void main(String[] args) {
        
        TreinamentoDAO dao = new TreinamentoDaoJDBC();
        
        dao.delete(4);
        
        
        
        
        
    }
    
}
