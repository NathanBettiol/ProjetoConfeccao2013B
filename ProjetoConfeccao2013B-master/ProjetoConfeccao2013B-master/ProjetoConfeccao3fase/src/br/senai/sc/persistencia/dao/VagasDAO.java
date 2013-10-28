
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Vagas;
import java.util.List;

/**
 * Interface responsável pela declaração dos métodos 
 * relacionados a persistência da classe Instrutor
 * @author Bruna Zakrzeski
 */

public interface VagasDAO {
    
    
    
    
    
    
   /**
   * Método responsável pela inserção de vagas
   * @author Bruna Zakrzeski
   * @version 1.0 09/09/13
   * @param vaga
   * @return 
   */
    
    boolean insert(Vagas vaga);
    
    
    
    
   /**
   * Método responsável pela alteração de vagas
   * @author Bruna Zakrzeski
   * @version 1.0 09/09/13
   * @param vaga
   * @return 
   */
    
    boolean update(Vagas vaga);
    
    
    
    
   /**
   * Método responsável pela remoção de vagas
   * @author Bruna Zakrzeski
   * @version 1.0 09/09/13
   * @param vaga
   * @return 
   */
    
    boolean delete(int codigo);
    
    
    
    
   /**
   * Método responsável pela listagem de vagas todos 
   * @author Bruna Zakrzeski
   * @version 1.0 09/09/13
   * @param vaga
   * @return 
   */
    
    List<Vagas> listAll();
    
    
}
