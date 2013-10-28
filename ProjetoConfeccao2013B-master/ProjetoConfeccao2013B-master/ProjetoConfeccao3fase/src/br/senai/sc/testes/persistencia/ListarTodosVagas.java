
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Vagas;
import br.senai.sc.model.persistencia.VagasDaoJDBC;
import br.senai.sc.persistencia.dao.VagasDAO;
import java.util.List;

/*
 * Classe responsavel pela execução do teste de listagem
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */

public class ListarTodosVagas {
    
    public static void main(String[] args) {
        
        VagasDAO dao = new VagasDaoJDBC();
        
        List<Vagas> vag = dao.listAll();
        
        for (Vagas vagas : vag)
            
            System.out.println(vag);
    }
    
}
