
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Treinamento;
import br.senai.sc.model.persistencia.TreinamentoDaoJDBC;
import br.senai.sc.persistencia.dao.TreinamentoDAO;
import java.util.List;

/*
 * Classe responsavel pela execução do teste de listagem de todos os isntrutores
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */

public class ListarTodosTreinamento {
    
    public static void main(String[] args) {
        
        TreinamentoDAO dao = new TreinamentoDaoJDBC();
        
        List<Treinamento> treino = dao.listAll();
        
        for (Treinamento treinamento : treino)
            
            System.out.println(treino);
    
}
}
